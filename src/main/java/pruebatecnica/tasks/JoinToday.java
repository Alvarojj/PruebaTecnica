package pruebatecnica.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pruebatecnica.userinterface.UtestPage;


public class JoinToday implements Task {
    public static JoinToday Click(){
        return Tasks.instrumented(JoinToday.class);
    }
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Click.on(UtestPage.JOINTODAY_BUTTON));
    }
}
