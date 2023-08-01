package com.tumblr_web_app.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

import java.util.List;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@class='dKGjO']")
    WebElement continueWithEmail;

    @FindBy(xpath = "//input[@type='email']")
    WebElement emailField;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextBtn;

    @FindBy(xpath = "//input[@type='password']")
    List<WebElement> passwords;

    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement next2Btn;

    @FindBy(xpath = "//div[@class='a0A37 hAkP2']")
    WebElement redErrorMsg;

    public void validateErrorMsg(String email, String password, String errorMsg) throws InterruptedException {

        continueWithEmail.click();
        emailField.sendKeys(email);
        Thread.sleep(2000);
        nextBtn.click();

        for (int i = 0; i < passwords.size(); i++) {

            Thread.sleep(1000);
            passwords.get(i).sendKeys(password);

        }


        next2Btn.click();
        Assert.assertEquals(BrowserUtils.getText(redErrorMsg), errorMsg);
    }
    //The password must be at least 8 characters long.
}
