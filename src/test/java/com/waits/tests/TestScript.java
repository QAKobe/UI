package com.waits.tests;

import com.waits.pages.MainPageWait;
import org.testng.annotations.Test;

public class TestScript extends TestBaseWait{

    @Test()
    public void validateWaits(){

        MainPageWait wait = new MainPageWait(driver);
        wait.clickExpectedWait(driver);

    }

}
