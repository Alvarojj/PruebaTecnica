package pruebatecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pruebatecnica.userinterface.FormuContra;

public class InfoContra implements Task {
    private String contra;
    public InfoContra(String contra){
        this.contra = contra;
    }
    public static InfoContra llenarDatos(String contra){
        return Tasks.instrumented(InfoContra.class, contra);
    }
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
            Enter.keyValues(contra).into(FormuContra.INPUT_CONTRA),
            Enter.keyValues(contra).into(FormuContra.INPUT_CONFIRMARCONTRA),
            Click.on(FormuContra.CHECK_TERMINOS),
            Click.on(FormuContra.CHECK_PRIVACIDAD),
            Click.on(FormuContra.CLICK_COMPLETE)
        );

    }
}
