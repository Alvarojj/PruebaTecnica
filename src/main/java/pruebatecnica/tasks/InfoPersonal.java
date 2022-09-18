package pruebatecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import pruebatecnica.userinterface.FormuPersonal;

public class InfoPersonal implements Task {

    private String nombre;
    private String apellido;
    private String correo;
    private String mes;
    private String dia;
    private String año;

    public InfoPersonal(String nombre, String apellido, String correo, String mes, String dia, String año){
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.mes = mes;
        this.dia = dia;
        this.año = año;
    }
    public static InfoPersonal llenarDatos(String nombre, String apellido, String correo, String mes, String dia, String año){
        return Tasks.instrumented(InfoPersonal.class, nombre, apellido, correo, mes, dia, año);
    }
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Enter.theValue(nombre).into(FormuPersonal.INPUT_NAME),
                Enter.theValue(apellido).into(FormuPersonal.INPUT_LASTNAME),
                Enter.theValue(correo).into(FormuPersonal.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(mes).from(FormuPersonal.INPUT_MONTH),
                SelectFromOptions.byVisibleText(dia).from(FormuPersonal.INPUT_DAY),
                SelectFromOptions.byVisibleText(año).from(FormuPersonal.INPUT_YEAR),
                Click.on(FormuPersonal.NEXLOCATION_BUTTON)
        );
    }
}
