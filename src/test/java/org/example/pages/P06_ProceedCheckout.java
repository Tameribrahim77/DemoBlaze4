package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.example.stepsDefs.Hooks.driver;

public class P06_ProceedCheckout {
    public WebElement chekOut(){return driver.findElement(By.cssSelector(".btn.btn-success"));}
    public WebElement name(){return driver.findElement(By.xpath("//input[@id='name']"));}
    public WebElement country(){return driver.findElement(By.xpath("//input[@id='country']"));}
    public WebElement city(){return driver.findElement(By.xpath("//input[@id='city']"));}
    public WebElement creditCard(){return driver.findElement(By.xpath("//input[@id='card']"));}
    public WebElement month(){return driver.findElement(By.xpath("//input[@id='month']"));}
    public WebElement year(){return driver.findElement(By.xpath("//input[@id='year']"));}
    public WebElement purchaseButton(){return driver.findElement(By.cssSelector("button[onclick='purchaseOrder()']"));}
}
