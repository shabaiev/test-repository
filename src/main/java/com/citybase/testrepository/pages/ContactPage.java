package com.citybase.testrepository.pages;

import com.citybase.testrepository.config.Driver;
import org.openqa.selenium.By;

public class ContactPage {

    public static void enterData(String firstName, String lastName,
                                  String jobTitle,
                                  String company,
                                  String city,
                                  String email,
                                  String phoneNumber) {
        Driver.driver().findElement(By.name("first-name")).sendKeys(firstName);
        Driver.driver().findElement(By.name("last-name")).sendKeys(lastName);
        Driver.driver().findElement(By.name("job-tittle")).sendKeys(jobTitle);
        Driver.driver().findElement(By.name("company")).sendKeys(company);
        Driver.driver().findElement(By.name("city")).sendKeys(city);
        Driver.driver().findElement(By.name("phone-number")).sendKeys(phoneNumber);
        Driver.driver().findElement(By.name("email")).sendKeys(email);
    }
}
