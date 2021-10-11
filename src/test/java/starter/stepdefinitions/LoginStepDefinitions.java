package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.login.DoLogin;
import starter.navigation.NavigateTo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class LoginStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) has an active account")
    public void has_an_active_account(String name) {
        this.name = name;
    }

    @When("^He sends their valid credentials")
    public void he_sends_their_valid_credentials() {
        theActorCalled(name).attemptsTo(
                NavigateTo.theLumuLoginPage(),
                DoLogin.withCredentials("diego.caldas@appgate.com", "D!e7435662")
        );
    }

    @Then("^He should have access to the company activity")
    public void he_should_have_access_to_the_company_activity() {
        theActorCalled(name).attemptsTo(
                WaitUntil.the("//*[@id=\"root\"]/div/header/a", isVisible())
        );
    }

}
