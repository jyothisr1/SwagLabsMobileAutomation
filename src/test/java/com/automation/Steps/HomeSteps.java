package com.automation.Steps;

import com.automation.Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage=new HomePage();
    @Given("user opens the application")
    public void user_opens_the_application() {
        homePage.openApplication();
    }


    @Then("verify user is on home page")
    public void verifyUserIsOnHomePage() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }

    @And("print product names")
    public void printProductNames() {
        homePage.printProductNames();
    }

    @And("user click on an element")
    public void userClickOnAnElement() {
        homePage.clickProduct();
    }

    @And("click on add to cart button")
    public void clickOnAddToCartButton() throws InterruptedException {
        homePage.addToCartButtonClick();

    }

    @When("user click on back button")
    public void userClickOnBackButton() {
        homePage.clickBack();
    }

    @When("user click on add to cart icon")
    public void userClickOnAddToCartIcon() {
        homePage.clickAddToCartIcon();
    }

    @And("click on burger menu icon")
    public void clickOnBurgerMenuIcon() {
        homePage.clickOnBurgerMenu();
    }

    @When("click on webView")
    public void clickOnWebView() {
        homePage.clickOnWebView();
    }

}
