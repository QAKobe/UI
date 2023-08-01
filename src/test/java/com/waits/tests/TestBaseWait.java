package com.waits.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverHelper;

public class TestBaseWait {

    WebDriver driver;

    @BeforeMethod()
    public void setUp(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("test"));
    }
}
