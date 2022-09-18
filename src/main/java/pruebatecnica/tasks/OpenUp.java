package pruebatecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pruebatecnica.userinterface.UtestPage;

public class OpenUp implements Task {
    UtestPage utestPage;
    public static OpenUp thePage(){
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Open.browserOn(utestPage));
    }
}
