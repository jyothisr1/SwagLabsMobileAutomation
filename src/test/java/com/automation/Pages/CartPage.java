package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{
    @FindBy(xpath = "//android.widget.TextView[@text='CHECKOUT']")
    WebElement checkout;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-First Name']")
    WebElement firstNameInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Last Name']")
    WebElement lastNameInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc='test-Zip/Postal Code']")
    WebElement postalCode;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-CONTINUE']")
    WebElement continueButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-FINISH\"]")
    WebElement finishButton;

    public boolean isAddToCartPageDisplayed() {
       return checkout.isDisplayed();
    }

    public void clickCheckoutButton() {
        checkout.click();
    }

    public void enterAddress() {
    }
}
