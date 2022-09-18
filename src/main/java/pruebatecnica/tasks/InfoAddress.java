package pruebatecnica.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import pruebatecnica.userinterface.FormuAddress;

import static pruebatecnica.userinterface.FormuAddress.SELECTION_CITY;

public class InfoAddress implements Task {
    private String ciudad;
    private String postal;
    private String pais;

    public InfoAddress(String ciudad, String postal, String pais){
        this.ciudad = ciudad;
        this.postal = postal;
        this.pais = pais;
    }
    public static InfoAddress llenarDatos(String ciudad, String postal, String pais){
        return Tasks.instrumented(InfoAddress.class, ciudad, postal, pais);
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Enter.keyValues(ciudad).into(FormuAddress.INPUT_CITY),
               Click.on(SELECTION_CITY),
               Enter.theValue(postal).into(FormuAddress.INPUT_POSTALCODE),
               Click.on(FormuAddress.DESPLIEGUECONTRY_BUTTON),
               Enter.theValue(pais).into(FormuAddress.INPUT_COUNTRY),
               Hit.the(Keys.ENTER).into(FormuAddress.INPUT_COUNTRY),
               Click.on(FormuAddress.NEXDEVICE_BUTTON)
       );
    }
}
