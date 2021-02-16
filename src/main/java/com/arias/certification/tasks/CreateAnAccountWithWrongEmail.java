package com.arias.certification.tasks;

import com.arias.certification.models.User;
import com.arias.certification.userinterface.RegisterPage;
import com.arias.certification.userinterface.AuthenticationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import java.time.Duration;

public class CreateAnAccount implements Task {
    private final User user;
    public CreateAnAccount(User user){
        this.user = user;
    }

    @Step("{0} signs up on New Experience")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AuthenticationPage.SIGN_IN_MENU.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Enter.theValue(user.getEmail()).into(AuthenticationPage.EMAIL_CREATE),
                Click.on(AuthenticationPage.BUTTON_CREATE_AN_ACCOUNT),
                Fill.theForm(user),
                Click.on(RegisterPage.REGISTER_BUTTON)
        );
    }
     public static CreateAnAccount onNewExperience(User user){
        return Tasks.instrumented(CreateAnAccount.class,user);
     }
}