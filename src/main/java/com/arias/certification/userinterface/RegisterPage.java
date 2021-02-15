package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target MR = Target.the("Mr.").locatedBy("//input[@id='id_gender1']");
    public static final Target MRS = Target.the("Mrs.").locatedBy("//input[@id='id_gender2']");
    public static final Target FIRST_NAME = Target.the("First Name").locatedBy("//input[@id='customer_firstname']");
    public static final Target LAST_NAME = Target.the("Last Name").locatedBy("//input[@id='customer_lastname']");
    public static final Target EMAIL = Target.the("Email").locatedBy("//input[@name='email']");
    public static final Target PASSWORD = Target.the("Password").locatedBy("//input[@id='passwd']");
    public static final Target DAY_BIRTH = Target.the("Day of Birth").locatedBy("//select[@id='days']");
    public static final Target MONTH_BIRTH = Target.the("Month of Birth").locatedBy("//div[@id='uniform-months']");
    public static final Target YEAR_BIRTH = Target.the("Year of Birth").locatedBy("//div[@id='uniform-years']");
    public static final Target NEWSLETTER = Target.the("Sign up for Newsletter!").locatedBy("//input[@id='newsletter']");
    public static final Target OFFERS = Target.the("Receive special offers from our partners!").locatedBy("//input[@id='optin']");
    public static final Target ADDRESS_FIRST_NAME = Target.the("First Name for Address").locatedBy("//input[@id='firstname']");
    public static final Target ADDRESS_LAST_NAME = Target.the("Lats Name for Address").locatedBy("//input[@id='lastname']");
    public static final Target COMPANY = Target.the("Company").locatedBy("//input[@id='company']");
    public static final Target ADDRESS = Target.the("Address").locatedBy("//input[@id='address1']");
    public static final Target ADDRESS_LINE2 = Target.the("Address Line 2").locatedBy("//input[@id='address2']");
    public static final Target CITY = Target.the("City").locatedBy("//input[@id='city']");
    public static final Target STATE = Target.the("State").locatedBy("//select[@id='id_state']");
    public static final Target ZIP_POSTAL_CODE = Target.the("Zip Postal Code").locatedBy("//input[@id='postcode']");
    public static final Target COUNTRY = Target.the("Country").locatedBy("//select[@id='id_country']");
    public static final Target ADDITIONAL_INFORMATION = Target.the("Additional Information").locatedBy("//textarea[@id='other']");
    public static final Target HOME_PHONE = Target.the("Home Phone").locatedBy("//input[@id='phone']");
    public static final Target MOBILE_PHONE = Target.the("Mobile Phone").locatedBy("//input[@id='phone_mobile']");
    public static final Target ADDRESS_ALIAS = Target.the("Address Alias").locatedBy("//input[@id='alias']");
    public static final Target REGISTER_BUTTON = Target.the("Register button").locatedBy("//button[@id='submitAccount']");


}