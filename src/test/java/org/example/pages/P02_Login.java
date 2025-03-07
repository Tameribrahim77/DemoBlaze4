package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.example.stepsDefs.Hooks.driver;

public class P02_Login {
    public List<WebElement> header(){return driver.findElements(By.cssSelector("ul[class=\"navbar-nav ml-auto\"]>li>a"));}
    public WebElement userName(){return driver.findElement(By.id("loginusername"));}
    public WebElement password(){return driver.findElement(By.id("loginpassword"));}
    public WebElement logButton(){return driver.findElement(By.cssSelector("button[onclick='logIn()']"));}
    public WebElement userProfile(){return driver.findElement(By.id("nameofuser"));}
}
