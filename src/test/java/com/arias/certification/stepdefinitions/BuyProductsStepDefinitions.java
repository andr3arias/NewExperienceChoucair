package com.arias.certification.stepdefinitions;

import com.arias.certification.models.User;
import com.arias.certification.tasks.SignIn;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class BuyProductsStepDefinitions {

    @Managed(driver = "chrome",clearCookies = BeforeEachTest)
    WebDriver driver;

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andrea");
    }
    @Given("^she enters the store with her credentials$")
    public void sheEntersTheStoreWithHerCredentials(List<User> users) {
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().attemptsTo(Open.url("http://automationpractice.com/index.php"));
        theActorInTheSpotlight().attemptsTo(SignIn.onNewExperience(users.get(0)));

    }

    @When("^She tries to add products to cart$")
    public void sheTriesToAddProductsToCart() {

    }

    @Then("^she sends her purchase to a new address$")
    public void sheSendsHerPurchaseToANewAddress(List<User>users) {

    }

}