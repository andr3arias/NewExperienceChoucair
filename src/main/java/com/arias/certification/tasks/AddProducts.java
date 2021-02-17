package com.arias.certification.tasks;

import com.arias.certification.userinterface.AuthenticationPage;
import com.arias.certification.userinterface.ProductListPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;

import java.time.Duration;


public class AddProducts implements Task {


    @Override
        public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(AuthenticationPage.RETURN_TO_HOME.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Scroll.to(ProductListPage.POPULAR),
                MoveMouse.to(ProductListPage.FIRST_PRODUCT),
                Click.on(ProductListPage.ADD_FIRST_PRODUCT_BUTTON),
                Click.on(ProductListPage.CONTINUE_SHOPPING.waitingForNoMoreThan(Duration.ofSeconds(10))),
                MoveMouse.to(ProductListPage.SECOND_PRODUCT),
                Click.on(ProductListPage.ADD_SECOND_PRODUCT_BUTTON),
                Click.on(ProductListPage.CONTINUE_SHOPPING.waitingForNoMoreThan(Duration.ofSeconds(10))),
                MoveMouse.to(ProductListPage.THIRD_PRODUCT),
                Click.on(ProductListPage.ADD_THIRD_PRODUCT_BUTTON),
                Click.on(ProductListPage.PROCEED_TO_CHECKOUT.waitingForNoMoreThan(Duration.ofSeconds(10)))
                );

    }

    public static AddProducts toCart(){
        return Tasks.instrumented(AddProducts.class);
    }
}