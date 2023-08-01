package com.lambdatest_web_app.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class Sliders {

    public Sliders(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@id='slider1']//input[@type='range']")
    WebElement slider;

    @FindBy(xpath = "//output[@id='range']")
    WebElement range;

    @FindBy(xpath = "//input[@type='range']")
    List<WebElement> allSliders;

    @FindBy(css = "output")
    List<WebElement> allOutput;

    public void slideIt() throws InterruptedException {

        while (!BrowserUtils.getText(range).equals("99")) {
            Thread.sleep(50);
            slider.sendKeys(Keys.ARROW_RIGHT);
        }

    }

    public void slideItAll(WebDriver driver) throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.scrollByAmount(400, 400).perform();
        for (int i = 0; i < 6; i++) {
            while (!BrowserUtils.getText(allOutput.get(i)).equals("99")) {
                if ( BrowserUtils.getText(allOutput.get(i)).equals("99")){
                    break;
                }else {
                    Thread.sleep(50);
                    allSliders.get(i).sendKeys(Keys.ARROW_RIGHT);
                }
            }

        }

    }

    public void slideItAll2(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.scrollByAmount(400, 400).perform();
        for (int i = 0; i < 6; i++) {

            while (!BrowserUtils.getText(allOutput.get(i)).equals("45")){

                if (BrowserUtils.getText(allOutput.get(i)).equals("75")){
                    break;
                }
                allSliders.get(i).sendKeys(Keys.ARROW_RIGHT);
            }

        }
    }

    public void slideItAll3(WebDriver driver){
        Actions actions = new Actions(driver);
        actions.scrollByAmount(400, 400).perform();
        for (int i = 0; i < 6; i++) {

            while (!BrowserUtils.getText(allOutput.get(i)).equals("99")){

                allSliders.get(i).sendKeys(Keys.ARROW_RIGHT);
            }

        }
    }
}
