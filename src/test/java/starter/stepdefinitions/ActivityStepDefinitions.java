package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.activity.ActivityOverview;
import starter.activity.OverviewData;
import static org.hamcrest.core.IsEqual.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ActivityStepDefinitions {

    String name;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^(.*) is in the activity page")
    public void is_in_the_activity_page(String name) {
        this.name = name;
        theActorCalled(name).attemptsTo(
                Click.on(ActivityOverview.LEFT_MENU.ACTIVITY_LINK),
                WaitUntil.the("//*[@id=\"root\"]/div/header/a", isVisible())
        );
    }

    @Then("^He check the (.*) card has (.*) contacts")
    public void he_check_the_card_has_contacts(String activityType, String contacts) {
     //   System.out.println("*********"+PhishingContacts.value().answeredBy(theActorInTheSpotlight()));
        theActorInTheSpotlight().should(
                seeThat("The displayed " + activityType + " card:", OverviewData.numberOfContacts(activityType), equalTo(contacts))
        );
    }
}
