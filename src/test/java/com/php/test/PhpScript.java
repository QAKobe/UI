package com.php.test;

import com.php.pages.PhpMainPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PhpScript extends TestBasePHP{


    @Test(dataProvider = "testData", dataProviderClass = MyData.class)
    public void TC_01_PHP(String name, String lastName, String business, String email) throws InterruptedException {

        PhpMainPage page = new PhpMainPage(driver);
        page.validateFillForm(name, lastName, business, email);


    }


}
