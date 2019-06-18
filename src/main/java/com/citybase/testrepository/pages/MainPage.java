package com.citybase.testrepository.pages;

import com.citybase.testrepository.config.Driver;

public class MainPage {

    static private String webSiteMainPage = "http://thecitybase.com";

    public static void goTo(){
        Driver.driver().navigate().to(webSiteMainPage);
    }
}
