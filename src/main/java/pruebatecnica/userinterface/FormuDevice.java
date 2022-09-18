package pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormuDevice extends PageObject {
    public static final Target BUTTON_COMPU = Target.the("Click para seleccionar computador").locatedBy("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]/span/i");
    public static final Target BUTTON_VERSION = Target.the("Click para seleccionar Version").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span/i");
    public static final Target BUTTON_LENGUAJE = Target.the("Click para seleccionar Lenguage").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/div[1]/span/i");

    public static final Target BUTTON_NEXTLASTSTEP = Target.the("Click para siguiente cuestionario").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a");

    public static final Target INPUT_COMPU = Target.the("Selecionar tu computador").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/input[1]");
    public static final Target INPUT_VERSION = Target.the("Selecionar tu version").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]");
    public static final Target INPUT_lENGUAJE = Target.the("Selecionar tu Lenguaje").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[3]/div[2]/div/input[1]");
}
