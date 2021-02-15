package com.arias.certification.tasks;

import com.arias.certification.models.User;
import com.arias.certification.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

public class Fill implements Task {


    private User user;
    public Fill (User user){
        this.user = user;
    }

    @Override
    @Step("{0} fills the form with his personal information")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(user.getFirstName()).into(RegisterPage.FIRST_NAME),
                Enter.theValue(user.getLastName()).into(RegisterPage.LAST_NAME),
                Enter.theValue(user.getPassword()).into(RegisterPage.PASSWORD),
                Enter.theValue(user.getAddress()).into(RegisterPage.ADDRESS),
                Enter.theValue(user.getCity()).into(RegisterPage.CITY),
                Enter.theValue(user.getState()).into(RegisterPage.STATE),
                Enter.theValue(user.getZipPostalCode()).into(RegisterPage.ZIP_POSTAL_CODE),
                Enter.theValue(user.getCountry()).into(RegisterPage.COUNTRY),
                Enter.theValue(user.getMobilePhone()).into(RegisterPage.MOBILE_PHONE)
        );

    }

    public static Fill theForm(User user){
        return Tasks.instrumented(Fill.class,user);
    }
}