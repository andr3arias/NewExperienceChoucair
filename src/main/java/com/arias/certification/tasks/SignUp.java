package com.arias.certification.tasks;

import com.arias.certification.models.User;
import com.arias.certification.userinterface.RegisterPage;
import com.arias.certification.userinterface.SignUpPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class SignUp implements Task {
    private final User user;
    public SignUp(User user){
        this.user = user;
    }

    @Step("{0} signs up on New Experience")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user.getEmail()).into(SignUpPage.EMAIL_CREATE),
                Click.on(SignUpPage.BUTTON_CREATE_AN_ACCOUNT),
                Fill.theForm(user),
                Click.on(RegisterPage.REGISTER_BUTTON)
        );
    }
     public static SignUp onNewExperience(User user){
        return Tasks.instrumented(SignUp.class,user);
     }
}