package com.tumblr_web_app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TumblrMainPage {

    public TumblrMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Log in')]")
    WebElement loginBtn;

    public void clickOnLoginBtn(){
        loginBtn.click();
    }

}
