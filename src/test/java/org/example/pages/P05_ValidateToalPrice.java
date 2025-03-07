package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.example.stepsDefs.Hooks.driver;

public class P05_ValidateToalPrice {
    public WebElement product1(){return driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(3)"));}
    public WebElement product2(){return driver.findElement(By.cssSelector("tbody tr:nth-child(2) td:nth-child(3)"));}
}