package com.php.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;

public class PhpMainPage {

    public PhpMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='first_name']")
    WebElement nameField;

    @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastNameField;

    @FindBy(xpath = "//input[@name='business_name']")
    WebElement businessNameField;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailField;

    @FindBy(xpath = "//div//button[@id='demo']")
    WebElement submitBtn;

    @FindBy(xpath = "//span[@id='numb1']")
    WebElement number1;

    @FindBy(xpath = "//span[@id='numb2']")
    WebElement number2;

    @FindBy(xpath = "//input[@id='number']")
    WebElement answerField;

    public void validateFillForm( String name, String lastName, String businessName,
                                 String email) throws InterruptedException {

        nameField.sendKeys(name);
        lastNameField.sendKeys(lastName);
        businessNameField.sendKeys(businessName);
        emailField.sendKeys(email);
        Thread.sleep(2000);
        int parsedNum1 = Integer.parseInt(BrowserUtils.getText(number1));
        int parsedNum2 = Integer.parseInt(BrowserUtils.getText(number2));
        System.out.println(parsedNum1);
        System.out.println(parsedNum2);
        int answer = parsedNum1 + parsedNum2;
        Thread.sleep(2000);
        answerField.sendKeys(String.valueOf(answer));
        submitBtn.click();



    }





}
