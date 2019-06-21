package com.citybase.testrepository.pages;

import com.citybase.testrepository.config.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class MainPage {

    private static Logger log = LoggerFactory.getLogger(MainPage.class);

    static private String webSiteMainPage = "http://thecitybase.com";

    public static void goTo() {
        Driver.driver().navigate().to(webSiteMainPage);
    }

    public static void acceptCookies() {
        boolean acceptButtonExists = true;
        WebElement denyButton = null;

        try {
            denyButton = Driver.driver().findElement(By.xpath("//a[(contains(text(), 'Accept'))]"));
        } catch (NoSuchElementException nse) {
            acceptButtonExists = false;
        }

        if (acceptButtonExists) {
            denyButton.click();
            log.info("Clicked on Accept cookies button");
        } else {
            log.error("Accept button doesn't exist");
        }
    }

    public static void clickOnGetInTouch() {
        Driver.driver().findElement(By.xpath("//*[contains(text(),'Get In Touch')]")).click();

    }




}
