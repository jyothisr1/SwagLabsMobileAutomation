package com.automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LoginPage extends BasePage{
    @FindBy(className = "android.widget.ImageView")
    WebElement loginPageImage;

    @FindBy(xpath = "//android.widget.TextView/following-sibling::android.view.ViewGroup/android.widget.TextView")
    List<WebElement> username;

    @FindBy(xpath = "//android.widget.TextView/following-sibling::android.widget.TextView/following-sibling::android.widget.TextView")
    WebElement password;

    @FindBy(xpath = "(//android.widget.EditText)[1]")
    WebElement usernameInput;

    @FindBy(xpath = "(//android.widget.EditText)[2]")
    WebElement passwordInput;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-LOGIN']")
    WebElement loginButton;

    public boolean isLoginPageDisplayed() {
        return loginPageImage.isDisplayed();
    }

    public void displayUsername(){
        for(WebElement lis:username){
            System.out.println("Usernames");
            System.out.println(lis.getText());
        }
    }

    public void scrollLoginPage() {
        int width=driver.manage().window().getSize().getWidth();
        int height=driver.manage().window().getSize().getHeight();
        scroll(width/2,height/2,width/2,0);
        if (!isPresent(password)){
            scroll(width/2,height/2,width/2,0);
        }
    }

    public void displayPassword() {
        System.out.println("Password");
        System.out.println(password.getText());
    }

    public void enterUsername() {
        usernameInput.sendKeys(username.get(0).getText());
    }

    public void enterPassword() {
        passwordInput.sendKeys(password.getText());
    }

    public void clickLoginButton() throws InterruptedException {
        loginButton.click();
        Thread.sleep(2000);
    }
}
