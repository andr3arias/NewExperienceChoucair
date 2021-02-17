package com.arias.certification.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class ProductListPage {

    public static final Target POPULAR = Target.the("POPULAR").locatedBy( ".homefeatured");
    public static final Target CONTINUE_SHOPPING = Target.the("Continue Shopping").locatedBy("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span");
    public static final Target PROCEED_TO_CHECKOUT = Target.the("Proceed to checkout button").locatedBy("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a");

    public static final Target FIRST_PRODUCT = Target.the("First product").locatedBy( "/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]");
    public static final Target ADD_FIRST_PRODUCT_BUTTON = Target.the("T-shirt").locatedBy("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[1]/div/div[2]/div[2]/a[1]");

    public static final Target SECOND_PRODUCT = Target.the("Second product").locatedBy( "/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]");
    public static final Target ADD_SECOND_PRODUCT_BUTTON = Target.the("Blouse").locatedBy("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[2]/div[2]/a[1]");

    public static final Target THIRD_PRODUCT = Target.the("Printed Dress Model 3").locatedBy("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[3]");
    public static final Target ADD_THIRD_PRODUCT_BUTTON = Target.the("Blouse").locatedBy("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[3]/div/div[2]/div[2]/a[1]");
}