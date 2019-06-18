package com.citybase.testrepository;

import com.citybase.testrepository.config.Driver;
import org.junit.BeforeClass;

public class FrontEndBase {

    @BeforeClass
    public static void setup() {
        Driver driver = new Driver();
        driver.setupDriver();
    }
}
