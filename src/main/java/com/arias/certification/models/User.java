package com.arias.certification.models;

import java.util.UUID;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String address;
    private String city;
    private String state;
    private String country;
    private String zipPostalCode;
    private String mobilePhone;
    private String addressAlias;
    private String payMode;
    private String homePhone;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email.trim();
    }
    public String getRandomEmail() {
        return "random-" + UUID.randomUUID().toString() + "@choucair.com";
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public String getAddressAlias() {
        return addressAlias;
    }


    public String getPayMode() {
        return payMode;
    }

    public String getCountry() {
        return country;
    }

    public String getHomePhone() {
        return homePhone;
    }
}