package com.automation.Pages;

import io.appium.java_client.remote.SupportsContextSwitching;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.Set;

public class WebViewPage extends BasePage{
    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-enter a https url here...\"]")
    WebElement websiteInput;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-GO TO SITE\"]")
    WebElement clickOnGoToSiteWebsite;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView")
    WebElement burgerMenuButton;

    @FindBy(xpath = "//android.widget.EditText")
    WebElement searchInput;

    public boolean check() {
        return isPresent(burgerMenuButton);
    }

    public boolean isWebViewPageDisplayed() {
        return websiteInput.isDisplayed();
    }

    public void enterWebsite() {
        websiteInput.sendKeys("www.google.com");
    }

    public void clickGoToWebsiteButton() {
        clickOnGoToSiteWebsite.click();
    }

    public void verifyContext() {
        SupportsContextSwitching contextSwitching=(SupportsContextSwitching) driver;
        System.out.println(Arrays.toString(contextSwitching.getContextHandles().toArray()));
        Set<String> contexts=contextSwitching.getContextHandles();
        String current=contextSwitching.getContext();
        for (String context:contexts){
            if(context.contains("wEBVIEW")){
                contextSwitching.context(context);
            }
            System.out.println(contextSwitching.getContext());
        }
        searchInput.sendKeys("laptop");
        searchInput.click();
        Actions actions=new Actions(driver);
        actions.keyDown(Keys.ENTER).build().perform();
    }
}
