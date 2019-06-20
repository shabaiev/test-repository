package com.citybase.testrepository.pages;

import com.citybase.testrepository.config.Driver;
import com.citybase.testrepository.model.ContactPerson;
import org.openqa.selenium.By;

public class ContactPage {
    public static void enterData(ContactPerson contactPerson) {
        Driver.driver().findElement(By.name("first-name")).sendKeys(contactPerson.getFirstName());
        Driver.driver().findElement(By.name("last-name")).sendKeys(contactPerson.getLastName());
        Driver.driver().findElement(By.name("job-title")).sendKeys(contactPerson.getJobTitle());
        Driver.driver().findElement(By.name("company")).sendKeys(contactPerson.getCompany());
        Driver.driver().findElement(By.name("city")).sendKeys(contactPerson.getCity());
        Driver.driver().findElement(By.name("phone-number")).sendKeys(contactPerson.getPhoneNumber());
        Driver.driver().findElement(By.name("email")).sendKeys(contactPerson.getEmail());
    }
}
