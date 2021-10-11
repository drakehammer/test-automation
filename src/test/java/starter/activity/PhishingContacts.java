package starter.activity;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class PhishingContacts implements Question<String> {

    public static Question<String> value(){
        return new PhishingContacts();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(ActivityOverview.PHISHING_CARD).getText();
    }
}
