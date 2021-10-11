package starter.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DoLogin implements Task {

    private final String email;
    private final String password;

    public DoLogin(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Performable withCredentials (String email, String password){
        return instrumented(DoLogin.class, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(email).into(LoginForm.EMAIL_FIELD),
                Enter.theValue(password).into(LoginForm.PASSWORD_FIELD),
                Click.on(LoginForm.LOGIN_BUTTON)
        );
    }
}
