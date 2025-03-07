package org.example.stepsDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Registration;
import org.example.pages.P06_ProceedCheckout;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.stepsDefs.Hooks.driver;

public class D06_ProceedCheckout {
    P01_Registration headerMenu =new P01_Registration();
    P06_ProceedCheckout checkout=new P06_ProceedCheckout();
    @When("Navigate to cart page")
    public void clickCartPage(){headerMenu.header().get(3).click();}

    @And("Clicking Place Order")
    public void clickingPlaceOrder() {checkout.chekOut().click();}

    @And("Enter Name")
    public void enterName() {checkout.name().sendKeys("Tamer");}

    @And("Enter Country")
    public void enterCountry() {checkout.country().sendKeys("Egypt");}

    @And("Enter City")
    public void enterCity() {checkout.city().sendKeys("Cairo");}

    @And("Enter Credit card")
    public void enterCreditCard() {checkout.creditCard().sendKeys("0000-0000-0000-0000");}

    @And("Enter Month")
    public void enterMonth() {checkout.month().sendKeys("December");}

    @And("Enter Year")
    public void enterYear() {checkout.year().sendKeys("2023");}

    @And("Clicking Purchase")
    public void clickingPurchase() {checkout.purchaseButton().click();}

    @Then("Success message appears")
    public void theSuccessfulPopupAppears() throws InterruptedException {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            // Wait for the alert to appear
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            // Get the alert text
            String alertText = alert.getText();
            System.out.println("Thank you for your purchase!" + alertText);
            Thread.sleep(Duration.ofSeconds(5));
            // Accept the alert
            alert.accept();
        } catch (NoAlertPresentException e) {
            System.out.println("No alert is present.");
        } catch (Exception e) {
            System.out.println("Error apears." + e.getMessage());
        }
    }

}
