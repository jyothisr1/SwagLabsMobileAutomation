package com.automation.Steps;

import com.automation.Pages.WebViewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class WebViewSteps {
    WebViewPage webViewPage=new WebViewPage();
    @Then("verify user on webView page")
    public void verify_user_on_webView_page() {
        Assert.assertTrue(webViewPage.isWebViewPageDisplayed());
    }
    @Then("enter the website")
    public void enter_the_website() {
        webViewPage.enterWebsite();
    }
    @When("click on go to website")
    public void click_on_go_to_website() {
        webViewPage.clickGoToWebsiteButton();
        Assert.assertTrue(webViewPage.check());
    }
    @Then("verify context")
    public void verify_context() throws InterruptedException {
        Thread.sleep(3000);
        webViewPage.verifyContext();
    }
}
