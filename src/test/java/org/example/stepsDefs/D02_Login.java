package org.example.stepsDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_Login;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static org.example.stepsDefs.Hooks.driver;

public class
D02_Login {
    P02_Login log = new P02_Login();

    @When("Clicking Login from header")
    public void loginHeaderClicking() {
        log.header().get(4).click();
    }

    @And("Enter user Username")
    public void enterUserUsername() {
        log.userName().sendKeys("Tamer Ibrahim5");
    }

    @And("Enter user Password")
    public void enterUserPassword() {
        log.password().sendKeys("Tamer@123456");
    }

    @And("Click login button")
    public void clickLoginButton() {
        log.logButton().click();
    }

    @Then("Successful login happened")
    public void SuccessfulLogin() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue
                (driver.findElement(By.id("nameofuser")).isEnabled());
        softAssert.assertAll();
    }
}
