package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class SummaryPage {
    public static final Target PROCEED_CHECKOUT_FROM_SUMMARY = Target.the("Proceed from Summary").locatedBy("//*[@id=\"center_column\"]/p[2]/a[1]/span");
}