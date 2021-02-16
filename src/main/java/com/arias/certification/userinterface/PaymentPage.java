package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentPage {
    public static final Target PAY_BY_BANK_WIRE = Target.the("Pay by bank wire").locatedBy("//a[@class='bankwire']");
    public static final Target PAY_BY_CHECK = Target.the("Pay by check").locatedBy("//a[@class='cheque']");
    public static final Target BUTTON_I_CONFIRM_MY_ORDER = Target.the("I confirm my Order button").locatedBy("//button[contains(.,'I confirm my order')]");

}