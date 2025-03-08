package org.example.stepsDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Registration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.example.stepsDefs.Hooks.driver;

public class D01_Registration {
    P01_Registration reg = new P01_Registration();

    @When("Clicking on SignUp from header")
    public void RegisterHeaderClicking() {
        reg.header().get(7).click();
    }

    @And("Enter Username")
    public void enterUsername() {
        reg.userName().sendKeys("Tamer Ibrahim6");
    }

    @And("Enter Password")
    public void enterPassword() {
        reg.password().sendKeys("Tamer@123456");
    }

    @And("Click sign up button")
    public void clickSignUpButton() {
        reg.signupButton().click();
    }

    @Then("The successful popup appears")
    public void theSuccessfulPopupAppears() {
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
}
