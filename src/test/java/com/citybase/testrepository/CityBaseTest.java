package com.citybase.testrepository;

import com.citybase.testrepository.config.Driver;
import com.citybase.testrepository.pages.MainPage;
import com.citybase.testrepository.utils.Timer;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CityBaseTest extends FrontEndBase {

    private Logger log = LoggerFactory.getLogger(CityBaseTest.class);

    @Test
    public void validateThatPageIsLoadedUnder15Seconds(){
        Timer.startTimer();
        MainPage.goTo();
        Timer.stopTimer();
        long secondsTakenToLoadThePage = Timer.getTimeInSeconds();
        log.info("Page loaded in: " + secondsTakenToLoadThePage + " seconds!");
        Assertions.assertThat(secondsTakenToLoadThePage).isLessThan(15);
    }


    @Test
    public void scrollDownToTheEndOfThePage() {
        MainPage.goTo();
        Driver.js().executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
