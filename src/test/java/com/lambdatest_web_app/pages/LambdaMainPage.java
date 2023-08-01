package com.lambdatest_web_app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LambdaMainPage {


    public LambdaMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Drag & Drop Sliders')]")
    WebElement slidersBtn;

    public void clickOnSlidersBtn(){
        slidersBtn.click();
    }
}
