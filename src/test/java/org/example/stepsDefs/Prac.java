package org.example.stepsDefs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class Prac {
    WebDriver driver0;
    @BeforeMethod
    public void Start() {
        driver0 = new ChromeDriver(); //BackupBrowser
        driver0.manage().window().maximize();
        driver0.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver0.get("https://demoblaze.com/");
    }

    @Test
    public void Test() throws InterruptedException {driver0.findElement(By.id("login2")).click();}

    @AfterMethod
    public void Down() throws InterruptedException {
        Thread.sleep(3000);
        driver0.quit();
    }
}