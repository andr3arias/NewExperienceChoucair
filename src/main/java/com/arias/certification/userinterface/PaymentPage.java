package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {
    public static final Target PAYMODE = Target.the("{0}").locatedBy("//*[contains(@title,'{0}')]");
    public static final Target BUTTON_I_CONFIRM_MY_ORDER = Target.the("I confirm my Order button").locatedBy("//button[contains(.,'I confirm my order')]");
}