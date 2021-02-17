package com.arias.certification.tasks;

import com.arias.certification.models.User;
import com.arias.certification.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.thucydides.core.annotations.Step;


public class FillThe implements Task {


    private User user;
    public FillThe(User user){
        this.user = user;
    }

    @Override
    @Step("{0} fills the form with his personal information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(user.getAddress()).into(RegisterPage.ADDRESS),
                Enter.theValue(user.getCity()).into(RegisterPage.CITY),
                SelectFromOptions.byVisibleText(user.getState()).from(RegisterPage.STATE),
                Enter.theValue(user.getZipPostalCode()).into(RegisterPage.ZIP_POSTAL_CODE),
                Enter.theValue(user.getHomePhone()).into(RegisterPage.HOME_PHONE),
                Enter.theValue(user.getAddressAlias()).into(RegisterPage.ADDRESS_ALIAS)
        );

    }

    public static FillThe formOfNewAddress(User user){
        return Tasks.instrumented(FillThe.class,user);
    }
}