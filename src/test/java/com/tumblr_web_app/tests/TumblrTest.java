package com.tumblr_web_app.tests;

import com.lambdatest_web_app.pages.LambdaMainPage;
import com.tumblr_web_app.pages.LoginPage;
import com.tumblr_web_app.pages.TumblrMainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.time.Duration;

public class TumblrTest extends TestBase {

    @Parameters({"email", "password", "errorMsg"})
    @Test()
    public void ValidateLoginErrorMsg(String email, String password, String errorMsg) throws InterruptedException {

        TumblrMainPage page = new TumblrMainPage(driver);
        page.clickOnLoginBtn();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.validateErrorMsg(email, password,
                errorMsg);
    }


}
