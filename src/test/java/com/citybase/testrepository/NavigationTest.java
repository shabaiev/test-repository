package com.citybase.testrepository;

import com.citybase.testrepository.config.Driver;
import com.citybase.testrepository.pages.MainPage;
import org.junit.Test;

public class NavigationTest extends FrontEndBase {

    @Test
    public void scrollDownToTheEndOfThePage() {
        MainPage.goTo();
        Driver.js().executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}