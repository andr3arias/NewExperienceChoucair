package com.arias.certification.interactions;

import com.arias.certification.models.User;
import com.arias.certification.userinterface.AddressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.SelectFromOptions;



public class Choose implements Interaction {


    private User user;
    public Choose(User user){
        this.user = user;
    }

    @Override

    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                SelectFromOptions.byVisibleText(user.getAddressAlias()).from(AddressPage.CHOOSE_NEW_ADDRESS)
        );

    }

    public static Choose aDeliveryAddress(User user){
        return Tasks.instrumented(Choose.class,user);
    }
}