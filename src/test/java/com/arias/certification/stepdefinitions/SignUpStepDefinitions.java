package com.arias.certification.stepdefinitions;

import com.arias.certification.interactions.Highlight;
import com.arias.certification.models.User;
import com.arias.certification.tasks.CreateAnAccount;
import com.arias.certification.tasks.CreateAnAccountWithWrongEmail;
import com.arias.certification.userinterface.AuthenticationPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.arias.certification.userinterface.UserHomePageUI.GREETING;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.thucydides.core.annotations.ClearCookiesPolicy.BeforeEachTest;

public class SignUpStepDefinitions {

    @Managed(driver = "chrome",clearCookies = BeforeEachTest)
    WebDriver driver;

    @Before
    public void before() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Andrea");
    }

    @Given("^She is on New Experience website$")
    public void sheIsOnNewExperienceWebsite() {
        theActorInTheSpotlight().can(BrowseTheWeb.with(driver));
        theActorInTheSpotlight().attemptsTo(Open.url("http://automationpractice.com/index.php"));


    }

    @When("^She tries to create an account at New Experience website$")
    public void sheTriesToCreateAnAccountAtNewExperienceWebsite(List<User> users) {
        theActorInTheSpotlight().attemptsTo(
                CreateAnAccount.onNewExperience(users.get(0))
                );
    }

    @When("^She tries to create an account with a wrong email$")
    public void sheTriesToCreateAnAccountWithAWrongEmail(List<User> users) {
        theActorInTheSpotlight().attemptsTo(
                CreateAnAccountWithWrongEmail.onNewExperience(users.get(0))
        );
    }

    @Then("^She should see the text (.*)$")
    public void sheShouldSeeTheText(String errorMessage) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(AuthenticationPage.ERROR_MESSAGE.of(errorMessage)).text().isEqualTo(errorMessage),
                Highlight.theTarget(AuthenticationPage.ERROR_MESSAGE.of(errorMessage))
        );
    }

       @Then("^She should be able to see the text (.*)$")
    public void sheShouldBeAbleToSeeTheText(String greeting) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(GREETING.of(greeting)).text().isEqualTo(greeting),
                Highlight.theTarget(GREETING.of(greeting))
        );
     }

}

