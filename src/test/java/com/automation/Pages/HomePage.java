package com.automation.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HomePage extends BasePage{
    @FindBy(xpath = "//android.widget.TextView[@text='PRODUCTS']")
    WebElement homePageContent;

    @FindBy(xpath = "//android.widget.TextView[@content-desc='test-Item title' and @text]")
    List<WebElement> productNames;

    @FindBy(xpath = "//android.widget.TextView[@text='Terms of Service | Privacy Policy']")
    WebElement footer;

    @FindBy(xpath = "//android.widget.TextView[@text='ADD TO CART']")
    WebElement addToCartButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-BACK TO PRODUCTS']")
    WebElement backButton;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Cart']/android.view.ViewGroup/android.widget.ImageView")
    WebElement cartIcon;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Menu\"]/android.view.ViewGroup/android.widget.ImageView")
    WebElement burgerMenuButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"WEBVIEW\"]")
    WebElement webViewItem;
    
    public void openApplication() {
        System.out.println("Opened Application");
    }

    public boolean isHomePageDisplayed() {
        return homePageContent.isDisplayed();
    }

    public void printProductNames() {
        Set<String> set=new HashSet<>();
        for(WebElement name:productNames){
            set.add(name.getText());
        }
        int width=driver.manage().window().getSize().getWidth();
        int height=driver.manage().window().getSize().getHeight();
        while(!isPresents(footer)){
            scroll(width/2,height/2,width/2,0);
            productNames=driver.findElements(By.xpath("//android.widget.TextView[@content-desc='test-Item title' and @text]"));
            for(WebElement name:productNames){
                set.add(name.getText());
            }
        }
        for(String name:set){
            System.out.println(name);
        }
    }

    public void clickProduct() {
        productNames.get(0).click();
    }

    public void addToCartButtonClick() throws InterruptedException {
        int width=driver.manage().window().getSize().getWidth();
        int height=driver.manage().window().getSize().getHeight();
        while(!isPresents(addToCartButton)) {
            scroll(width / 2, height / 2, width / 2, 0);
        }
        int elementWidth=addToCartButton.getSize().getWidth()+addToCartButton.getLocation().getX();
        int elementHeight=addToCartButton.getSize().getHeight()+addToCartButton.getLocation().getY();
        Thread.sleep(3000);
        doubleTap(elementWidth,elementHeight);
//        addToCartButton.click();

        Thread.sleep(2000);
    }

    public void clickBack() {
        backButton.click();
    }

    public void clickAddToCartIcon() {
        cartIcon.click();
    }

    public void clickOnBurgerMenu() {
        burgerMenuButton.click();
    }

    public void clickOnWebView() {
        webViewItem.click();
    }
}