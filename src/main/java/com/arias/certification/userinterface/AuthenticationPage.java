package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AuthenticationPage {
    public static final Target SIGN_IN_MENU = Target.the("Login").locatedBy("//a[@class='login']");
    public static final Target EMAIL_CREATE = Target.the("Email Create Address").locatedBy("//input[@id='email_create']");
    public static final Target BUTTON_CREATE_AN_ACCOUNT = Target.the("Create an account Button").locatedBy("//button[@id='SubmitCreate']");
    public static final Target EMAIL = Target.the("Email").locatedBy("//input[@id='email']");
    public static final Target PASSWORD = Target.the("Password").locatedBy("//input[@name='passwd']");
    public static final Target SIGN_IN_BUTTON = Target.the("Sign In Button").locatedBy("//button[contains(.,'Got it!')]");
    public static final Target ERROR_MESSAGE = Target.the("Error Message {0}").locatedBy("//li[contains(.,'{0}')]");
}