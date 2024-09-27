package com.automation.Steps;

import com.automation.Pages.CartPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CartSteps {
    CartPage cartPage=new CartPage();
    @Then("verify user is on cart page")
    public void verifyUserIsOnCartPage() {
        Assert.assertTrue(cartPage.isAddToCartPageDisplayed());
    }

    @And("user click on checkout button")
    public void userClickOnCheckoutButton() {
        cartPage.clickCheckoutButton();
    }

    @And("user enter address")
    public void userEnterAddress() {
        cartPage.enterAddress();
    }
}
