package com.citybase.testrepository;

import com.citybase.testrepository.config.Driver;
import com.citybase.testrepository.pages.MainPage;
import org.junit.Test;

public class NavigationTest extends FrontEndBase {

    @Test
    public void scrollDownToTheEndOfThePage() {
        MainPage.goTo();
        MainPage.acceptCookies();
        Driver.js().executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


    @Test
    public void VerifyThatContactPageOpenWhenClicksOnStayInTouchButton() {
        MainPage.ClickOnGetInTouch();

    }

}
