package com.citybase.testrepository;

import com.citybase.testrepository.config.Driver;
import com.citybase.testrepository.model.ContactPerson;
import com.citybase.testrepository.pages.ContactPage;
import com.citybase.testrepository.pages.MainPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class NavigationTest extends FrontEndBase {

    @Test
    public void scrollDownToTheEndOfThePage() {
        MainPage.goTo();
        MainPage.acceptCookies();
        Driver.js().executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }


    @Test
    public void verifyThatContactPageOpenedWhenClickedOnStayInTouchButton() {
        MainPage.goTo();
        MainPage.acceptCookies();
        Driver.js().executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);", "window.scrollTo(0, document.body.scrollHeight)");
        MainPage.clickOnGetInTouch();

    }

    @Test
    public void verifyThatDataWasEnteredOnAContactPage() {

        ContactPerson contactPerson = new ContactPerson.Builder()
                .firstName(faker.name().firstName())
                .lastName(faker.name().lastName())
                .jobTitle(faker.name().title())
                .company(faker.book().title())
                .city(faker.address().city())
                .email(faker.name() + "@gmail.com")
                .phoneNumber(faker.number().digit())
                .build();
        System.out.println(contactPerson);


        MainPage.goTo();
        MainPage.acceptCookies();
        Driver.js().executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);", "window.scrollTo(0, document.body.scrollHeight)");
        MainPage.clickOnGetInTouch();
        ContactPage.enterData(contactPerson);
    }

    @Test
    public void verifyThatUserCanSelectValueFromDropDown() {
        MainPage.goTo();
        MainPage.acceptCookies();
        Actions actions = new Actions(Driver.driver());
        actions.moveToElement(Driver.driver().findElement(By.xpath("//*[@id=\"menu-citybase-main-nav\"]//*[contains(text(), 'About Us')]"))).build().perform();
        List<WebElement> list = Driver.driver().findElements(By.xpath("//*[@id=\\\"menu-citybase-main-nav\\\"]//*[contains(text(), 'About Us')]//ancestor::li[1]//ul/li"));
        WebElement cityBase = getElementThatContainsText(list, "CityBlog");
        if (cityBase != null) {
            System.out.println(cityBase.getText());
        } else {
            System.out.println("ELement is null :(");
        }


        public WebElement getElementThatContainsText (List < WebElement > list, String desiredText){
            for (WebElement webElement : list) {
                if (webElement.getText().contains(desiredText)) {
                    System.out.println("Found element that contains: " + desiredText + " Full text: " + webElement.getText());
                    return webElement;
                } else {
                    System.out.println("Skipping: " + webElement.getText());
                }
            }
            return null;
        }

