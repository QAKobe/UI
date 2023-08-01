package com.php.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import utils.DriverHelper;

public class TestBasePHP {

    public WebDriver driver;

    @BeforeMethod()
    public void setUp(){

      driver = DriverHelper.getDriver();
      driver.get(ConfigReader.readProperty("phpURL"));
    }


}
