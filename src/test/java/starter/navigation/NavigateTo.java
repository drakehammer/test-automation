package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.OpenAt;

public class NavigateTo {

    public static Performable theLumuLoginPage(){
        return Task.where("{0} opens the Lumu login page",
                Open.browserOn().the(LumuHomePage.class)
        );
    }

    public static Performable theLumuActivityPage(){
        return Task.where("{1} opens the Lumu activity page",
                Open.browserOn().the(LumuActivityPage.class)
        );
    }
}
