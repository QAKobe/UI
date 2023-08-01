package com.tumblr_web_app.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

import java.time.Duration;

public class TestBase {

    public WebDriver driver;

    @BeforeMethod()
    public void setUp() {

        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("tmblrURL"));

    }

    @AfterMethod()
    public void tearDown(ITestResult result) {
        if (!result.isSuccess()) {
            BrowserUtils.getScreenShot(driver, "failedScreenshot");
        }
        driver.quit();
    }
}
