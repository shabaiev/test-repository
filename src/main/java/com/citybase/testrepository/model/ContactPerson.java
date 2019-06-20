package com.citybase.testrepository.model;

public class ContactPerson {

    private String firstName;
    private String lastName;
    private String jobTitle;
    private String company;
    private String email;
    private String city;
    private String phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ContactPerson(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.jobTitle = builder.jobTitle;
        this.company = builder.company;
        this.email = builder.company;
        this.city = builder.city;
        this.phoneNumber = builder.phoneNumber;

    }

    public static class Builder {

        private String firstName;
        private String lastName;
        private String jobTitle;
        private String company;
        private String email;
        private String city;
        private String phoneNumber;

        public ContactPerson.Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }


        public ContactPerson.Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ContactPerson.Builder jobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public ContactPerson.Builder company(String company) {
            this.company = company;
            return this;
        }

        public ContactPerson.Builder email(String email) {
            this.email = email;
            return this;
        }

        public ContactPerson.Builder city(String city) {
            this.city = city;
            return this;
        }

        public ContactPerson.Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ContactPerson build() {
            return new ContactPerson(this);
        }



        @Override
        public String toString() {
            return "ContactPerson" + "firstName" + firstName + "lastName= " + lastName + "job tittle" + jobTitle
                    + "company" + company + "email" + email + "city" + city + "phone number" + phoneNumber;

        }
    }
}


