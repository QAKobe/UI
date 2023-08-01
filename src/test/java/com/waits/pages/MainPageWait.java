package com.waits.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPageWait {

    public MainPageWait(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//input[@id='submitButton']")
    WebElement submitBtn;

    public void clickExpectedWait(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.scrollByAmount(500, 500).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn));
        submitBtn.click();
    }

    public void clickFluent(WebDriver driver){

        Actions actions = new Actions(driver);
        actions.scrollByAmount(500, 500).perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
}
