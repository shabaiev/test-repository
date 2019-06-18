package com.citybase.testrepository;

import com.citybase.testrepository.config.Driver;
import org.junit.AfterClass;
import org.junit.BeforeClass;

public class FrontEndBase {

    @BeforeClass
    public static void setup() {
        Driver driver = new Driver();
        driver.setupDriver();
    }

    @AfterClass
    public static void tearDown(){
        if (Driver.driver()!=null){
            Driver.driver().quit();
        }
    }
}
