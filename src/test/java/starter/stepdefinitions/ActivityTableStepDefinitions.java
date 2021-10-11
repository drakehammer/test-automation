package starter.stepdefinitions;

import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import starter.activity.ActivityOverview;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ActivityTableStepDefinitions {

    String name;

    @When("^He filter the activity details table by domain (.*)")
    public void he_filter_the_activity_details_table_by_domain(String domain) {
        this.name = name;
        theActorCalled(name).attemptsTo(
                Click.on(ActivityOverview.TABLE.DOMAIN_BUTTON)
        );
    }
}
