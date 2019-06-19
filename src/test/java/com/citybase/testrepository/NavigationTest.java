package com.citybase.testrepository;

import com.citybase.testrepository.config.Driver;
import com.citybase.testrepository.model.ContactPerson;
import com.citybase.testrepository.pages.ContactPage;
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
    public void verifyThatContactPageOpenedWhenClickedOnStayInTouchButton() {
        MainPage.goTo();
        MainPage.acceptCookies();
        Driver.js().executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);", "window.scrollTo(0, document.body.scrollHeight)");
        MainPage.clickOnGetInTouch();

    }

    @Test
    public void verifyThatDataWasEnteredOnAContactPage() {
      /*  String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String jobTitle = faker.name().title();
        String companyName = faker.company().logo();
        String email = faker.funnyName().name() + "@gmail.com";
        String phoneNumber = faker.phoneNumber().phoneNumber();
        String city = faker.country().capital();
*/
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
}
