package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class AddressPage {
    public static final Target CHOOSE_NEW_ADDRESS = Target.the("Choose a delivery address").locatedBy("//select[@id='id_address_delivery']");
    public static final Target ADD_NEW_ADDRESS_BUTTON = Target.the("Add a New Address Button").locatedBy("//span[contains(.,'Add a new address')]");
    public static final Target BUTTON_PROCEED_FROM_ADDRESS = Target.the("Proceed To Shipping").locatedBy("//button[@name='processAddress']");

}