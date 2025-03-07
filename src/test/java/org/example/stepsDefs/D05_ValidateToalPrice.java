package org.example.stepsDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P01_Registration;
import org.example.pages.P05_ValidateToalPrice;

public class D05_ValidateToalPrice {
    P01_Registration headerMenu = new P01_Registration();
    P05_ValidateToalPrice price = new P05_ValidateToalPrice();

    @And("Retrieve product one price")
    public String RetrieveProductOnePrice() {
        price.product1().getText();
        return RetrieveProductOnePrice();
    }

    @And("Retrieve product two price")
    public String RetrieveProductTwoPrice() {
        price.product2().getText();
        return RetrieveProductTwoPrice();
    }

    @And("Retrieve the total price displayed")
    public double retrieveTheTotalPriceDisplayed() {
        double sum = Double.parseDouble(RetrieveProductOnePrice() + RetrieveProductTwoPrice());
        return sum;
    }

    @Then("The sum of product prices should equal the total price")
    public void theSumOfProductPricesShouldEqualTheTotalPrice() {
    }
}
