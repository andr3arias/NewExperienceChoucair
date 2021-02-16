package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddressPage {
    public static final Target STATE = Target.the("Choose a delivery address").locatedBy("//*[@id='id_address_delivery']");
    public static final Target BUTTON_PROCEED_CHECKOUT_ADDRESS = Target.the("Proceed to checkout from Address").locatedBy("//button[@name='processAddress']")
}