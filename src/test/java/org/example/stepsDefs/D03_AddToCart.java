package org.example.stepsDefs;

import io.cucumber.java.en.And;
import org.example.pages.P01_Registration;
import org.example.pages.P02_Login;
import org.example.pages.P03_AddToCart;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepsDefs.Hooks.driver;

public class D03_AddToCart {
    P02_Login log = new P02_Login();
    P03_AddToCart addToCart = new P03_AddToCart();
    P01_Registration headerMenu = new P01_Registration();

    @And("When Clicking Login from header")
    public void whenClickingLoginFromHeader() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        log.header().get(4).click();
    }

    @And("Clicking on Laptops Menu")
    public void clickingOnLaptopsMenu() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        addToCart.clickLaptops().click();
    }

    @And("Choose Product One")
    public void chooseProductOne() {
        addToCart.products().get(7).click();
    }

    @And("Add Product One to Cart")
    public void addProductOneToCart() {
        addToCart.addButton().click();
    }

    @And("The successful add product popup appears")
    public void theSuccessfulAddProductPopupAppears() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Wait for the alert to appear
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            // Get the alert text
            String alertText = alert.getText();
            System.out.println("Sign up successful." + alertText);
            Thread.sleep(Duration.ofSeconds(5));
            // Accept the alert
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert is present.");
        } catch (Exception e) {
            System.out.println("This user already exist." + e.getMessage());
        }
    }

    @And("Navigate into homepage")
    public void navigateIntoHomepage() {
        headerMenu.header().get(0).click();
    }


    @And("Choose Product Two")
    public void chooseProductTwo() {
        addToCart.products().get(8).click();
    }

    @And("Add Product Two to Cart")
    public void addProductTwoToCart() {
        addToCart.addButton().click();
    }

    @And("Successful add product popup appears")
    public void theSuccessfulPopupAppears() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
            // Wait for the alert to appear
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            // Get the alert text
            String alertText = alert.getText();
            System.out.println("Sign up successful." + alertText);

            Thread.sleep(Duration.ofSeconds(1));
            // Accept the alert
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert is present.");
        } catch (Exception e) {
            System.out.println("This user already exist." + e.getMessage());
        }
    }

    @And("Clicking on Cart")
    public void clickingOnCart() {
        headerMenu.header().get(3).click();
    }

    @And("The Two Products added")
    public void theTwoProductsAdded() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2)")).isEnabled());
        softAssert.assertTrue(driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(3)")).isEnabled());
        softAssert.assertTrue(driver.findElement(By.xpath("//td[normalize-space()='Sony vaio i7']")).isEnabled());
        softAssert.assertTrue(driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(3)")).isEnabled());
        softAssert.assertTrue(driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(3)")).isEnabled());
        softAssert.assertAll();
    }


    @And("Clicking on Laptops Menu Again")
    public void clickingOnLaptopsMenuAgain() {
    }
}