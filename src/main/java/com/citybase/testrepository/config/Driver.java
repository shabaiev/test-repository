package com.citybase.testrepository.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Driver {

   private static WebDriver driver;

    public void setupDriver(){
        File webDriver = new File("driver/chromedriver.exe");
        System.setProperty(
                "webdriver.chrome.driver",
                webDriver.getAbsolutePath());
        driver = new ChromeDriver();
    }

    public static WebDriver get(){
        return driver;
    }
}