package com.php.test;

import org.testng.annotations.DataProvider;

public class MyData {

    @DataProvider(name = "testData")
    public Object[][] provideData(){
        return new Object[][]  {{"firstNameTest", "lastNameTest", "businessNameTest", "EmailTest"},
                {"secondName", "secondLastName", "secondBusiness", "secondEmail"},
                {"thirdName", "thirdLastName", "thirdBusiness", "thirdEmail"}};


    }
}
