package pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormuAddress extends PageObject {

    public static final Target INPUT_CITY = Target.the("Ingresar ciudad").locatedBy("//*[@id=\"city\"]");
    public static final Target INPUT_POSTALCODE = Target.the("Ingresar codigo postal").locatedBy("//*[@id=\"zip\"]");
    public static final Target INPUT_COUNTRY = Target.the("Ingresar pais").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]");

    public static final Target NEXDEVICE_BUTTON = Target.the("Boton de siguiente").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a");
    public static final Target DESPLIEGUECONTRY_BUTTON = Target.the("Boton para desplegar las ciudades").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/i");



    public static final Target SELECTION_CITY = Target.the("seleccionar ciudad").locatedBy("/html/body/div[3]/div[2]");

}
