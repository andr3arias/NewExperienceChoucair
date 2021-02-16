package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UserHomePageUI {
    public static final Target GREETING = Target.the("Greeting {0}").locatedBy("//p[contains(.,'{0}')]");
}