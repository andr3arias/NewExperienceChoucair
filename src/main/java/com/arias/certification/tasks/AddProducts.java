package com.arias.certification.tasks;

import com.arias.certification.models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;



public class AddProducts implements Task {


    @Override
        public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


        );

    }

    public static AddProducts toTheCart(User user){
        return Tasks.instrumented(AddProducts.class,user);
    }
}