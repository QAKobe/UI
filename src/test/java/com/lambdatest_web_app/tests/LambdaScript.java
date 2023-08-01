package com.lambdatest_web_app.tests;

import com.lambdatest_web_app.pages.LambdaMainPage;
import com.lambdatest_web_app.pages.Sliders;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utils.BrowserUtils;

import java.time.Duration;

public class LambdaScript {


    @Test()
    public void validateSliders() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        LambdaMainPage page = new LambdaMainPage(driver);
        page.clickOnSlidersBtn();

        Sliders sliders = new Sliders(driver);
//        sliders.slideItAll(driver);
        // sliders.slideItAll3(driver);

        sliders.slideIt();


    }

    @Test()
    public void ValidateSliders2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.lambdatest.com/selenium-playground/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        LambdaMainPage page = new LambdaMainPage(driver);
        page.clickOnSlidersBtn();

        Sliders sliders = new Sliders(driver);
        sliders.slideItAll2(driver);
    }

    @Test()
    public void testXML() {
        System.out.println("it worked");
    }

}
