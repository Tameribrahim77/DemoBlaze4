import org.example.pages.P05_ValidateToalPrice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

P05_ValidateToalPrice price = new P05_ValidateToalPrice();

public void main() {
}

public class prac2 {
    WebDriver driver0;

    @BeforeMethod
    public void Start() {
        driver0 = new ChromeDriver(); //BackupBrowser
        driver0.manage().window().maximize();
        driver0.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver0.get("https://demoblaze.com/");
    }

    @Test
    private double RetrieveProductOnePrice() {
        price.product1().getText();
        return RetrieveProductOnePrice();
    }

    private double RetrieveProductTwoPrice() {
        price.product2().getText();

        return RetrieveProductTwoPrice();
    }

    public double productSum() {
        double productsSum = RetrieveProductOnePrice() + RetrieveProductTwoPrice();

        return productSum();
    }
    

    @AfterMethod
    public void Down() throws InterruptedException {
        Thread.sleep(3000);
        driver0.quit();
    }
}