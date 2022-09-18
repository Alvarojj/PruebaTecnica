package pruebatecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import pruebatecnica.userinterface.FormuDevice;

public class InfoDevice implements Task {
    private String computador, version, lenguaje;

    public InfoDevice(String computador, String version, String lenguaje){
        this.computador = computador;
        this.version = version;
        this.lenguaje = lenguaje;
    }
    public static InfoDevice llenarDatos(String computador, String version, String lenguaje){
        return Tasks.instrumented(InfoDevice.class, computador, version, lenguaje);
    }
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
            Click.on(FormuDevice.BUTTON_COMPU),
            Enter.keyValues(computador).into(FormuDevice.INPUT_COMPU),
            Hit.the(Keys.ENTER).into(FormuDevice.INPUT_COMPU),

            Click.on(FormuDevice.BUTTON_VERSION),
            Enter.keyValues(version).into(FormuDevice.INPUT_VERSION),
            Hit.the(Keys.ENTER).into(FormuDevice.INPUT_VERSION),

            Click.on(FormuDevice.BUTTON_LENGUAJE),
            Enter.keyValues(lenguaje).into(FormuDevice.INPUT_lENGUAJE),
            Hit.the(Keys.ENTER).into(FormuDevice.INPUT_lENGUAJE),

            Click.on(FormuDevice.BUTTON_NEXTLASTSTEP)
        );
    }
}
