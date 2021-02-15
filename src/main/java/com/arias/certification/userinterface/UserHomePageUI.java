package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class UserHomePageUI {
    public static final Target GREETING = Target.the("Greeting").locatedBy("//p[@class='info-account']");
}