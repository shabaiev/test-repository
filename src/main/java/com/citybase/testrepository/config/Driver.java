package com.citybase.testrepository.config;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Driver {

   private static WebDriver driver;
   private static JavascriptExecutor js;

    public void setupDriver(){
        File webDriver = new File("driver/chromedriver.exe");
        System.setProperty(
                "webdriver.chrome.driver",
                webDriver.getAbsolutePath());
                //driver().manage().window().maximize();
        driver = new ChromeDriver();
        js = (JavascriptExecutor)driver;

        driver().manage().window().maximize();
    }

    public static WebDriver driver(){
        return driver;
    }

    public static JavascriptExecutor js(){
        return js;
    }


}