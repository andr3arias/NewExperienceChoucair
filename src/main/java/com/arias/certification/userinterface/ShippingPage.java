package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ShippingPage {
    public static final Target TERMS_OF_SERVICE = Target.the("Terms of Service Checkbox").locatedBy("//input[@id='cgv']");
    public static final Target BUTTON_PROCEED = Target.the("Terms of Service Checkbox").locatedBy("//input[@id='cgv']");

}