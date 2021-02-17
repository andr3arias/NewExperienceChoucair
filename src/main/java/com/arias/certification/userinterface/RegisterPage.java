package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target FIRST_NAME = Target.the("First Name").locatedBy("//input[@id='customer_firstname']");
    public static final Target LAST_NAME = Target.the("Last Name").locatedBy("//input[@id='customer_lastname']");
    public static final Target EMAIL = Target.the("Email").locatedBy("//input[@name='email']");
    public static final Target PASSWORD = Target.the("Password").locatedBy("//input[@id='passwd']");
    public static final Target ADDRESS = Target.the("Address").locatedBy("//input[@id='address1']");
    public static final Target CITY = Target.the("City").locatedBy("//input[@id='city']");
    public static final Target STATE = Target.the("State").locatedBy("//select[@id='id_state']");
    public static final Target ZIP_POSTAL_CODE = Target.the("Zip Postal Code").locatedBy("//input[@id='postcode']");
    public static final Target COUNTRY = Target.the("Country").locatedBy("//select[@id='id_country']");
    public static final Target MOBILE_PHONE = Target.the("Mobile Phone").locatedBy("//input[@id='phone_mobile']");
    public static final Target HOME_PHONE = Target.the("Mobile Phone").locatedBy("//input[@id='phone']");
    public static final Target ADDRESS_ALIAS = Target.the("Address Alias").locatedBy("//input[@id='alias']");
    public static final Target REGISTER_BUTTON = Target.the("Register button").locatedBy("//button[@id='submitAccount']");
    public static final Target SAVE_BUTTON = Target.the("Save").locatedBy("//*[@id='submitAddress']");


}