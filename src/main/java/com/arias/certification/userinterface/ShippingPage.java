package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ShippingPage {
    public static final Target TERMS_OF_SERVICE_CHECKBOX = Target.the("Terms of Service Checkbox").locatedBy("//input[@name='cgv']");
    public static final Target BUTTON_PROCEED_TO_PAY = Target.the("Proceed to Pay").locatedBy("//button[@name='processCarrier']");

}