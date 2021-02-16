package com.arias.certification.tasks;

import com.arias.certification.models.User;
import com.arias.certification.userinterface.AuthenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

public class SignIn implements Task {
    private final User user;
    public SignIn(User user){
        this.user = user;
    }

    @Step("{0} signs in on New Experience")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AuthenticationPage.SIGN_IN_MENU.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(user.getEmail()).into(AuthenticationPage.EMAIL),
                Enter.theValue(user.getPassword()).into(AuthenticationPage.PASSWORD),
                Click.on(AuthenticationPage.SIGN_IN_BUTTON)
        );
    }
    public static SignIn onNewExperience(User user){
        return Tasks.instrumented(SignIn.class,user);
    }
}