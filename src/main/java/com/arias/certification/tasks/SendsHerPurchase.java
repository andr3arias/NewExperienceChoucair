package com.arias.certification.tasks;

import com.arias.certification.interactions.Choose;
import com.arias.certification.models.User;
import com.arias.certification.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import java.time.Duration;

public class SendsHerPurchase implements Task {
    private final User user;
    public SendsHerPurchase(User user){
        this.user = user;
    }

       @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SummaryPage.PROCEED_CHECKOUT_FROM_SUMMARY.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Click.on(AddressPage.ADD_NEW_ADDRESS_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(10))),
                FillThe.formOfNewAddress(user),
                Click.on(RegisterPage.SAVE_BUTTON.waitingForNoMoreThan(Duration.ofSeconds(10))),
                Choose.aDeliveryAddress(user),
                Click.on(AddressPage.BUTTON_PROCEED_FROM_ADDRESS),
                Click.on(ShippingPage.TERMS_OF_SERVICE_CHECKBOX),
                Click.on(ShippingPage.BUTTON_PROCEED_TO_PAY),
                Click.on(PaymentPage.PAYMODE.of(user.getPayMode())),
                Click.on(PaymentPage.BUTTON_I_CONFIRM_MY_ORDER)
        );
    }
     public static SendsHerPurchase ToANewAddress(User user){
        return Tasks.instrumented(SendsHerPurchase.class,user);
     }
}