package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.example.stepsDefs.Hooks.driver;

public class P01_Registration {
    public List<WebElement>header(){return driver.findElements(By.cssSelector("ul[class=\"navbar-nav ml-auto\"]>li>a"));}
    public WebElement userName(){return driver.findElement(By.id("sign-username"));}
    public WebElement password(){return driver.findElement(By.id("sign-password"));}
    public WebElement signupButton(){return driver.findElement(By.cssSelector("button[onclick='register()']"));}
}
