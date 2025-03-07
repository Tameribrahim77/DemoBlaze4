package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.List;

import static org.example.stepsDefs.Hooks.driver;

public class P03_AddToCart {
    public List<WebElement> catList() {
        return driver.findElements(By.cssSelector("[class=\"list-group\"]>a"));
    }

    public List<WebElement> products() {
        return driver.findElements(By.cssSelector("div [class=\"col-lg-4 col-md-6 mb-4\"]>div[class=\"card h-100\"]>a"));
    }

    public WebElement addButton() {
        return driver.findElement(By.cssSelector(".btn.btn-success.btn-lg"));
    }

    public List<WebElement> headerMenu() {
        return driver.findElements(By.cssSelector("ul[class=\"navbar-nav ml-auto\"]>li>a"));
    }

    public WebElement clickLaptops() throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        return driver.findElement(By.linkText("Laptops"));
    }

    public WebElement product1Cart() {
        return driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(2)\""));
    }

    public WebElement product2Cart() {
        return driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(2)"));
    }

    public WebElement productPrice1Cart() {
        return driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(3)"));
    }

    public WebElement productPrice2Cart() {
        return driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(3)"));
    }

    public WebElement totalPrice() {
        return driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(3)"));
    }
}