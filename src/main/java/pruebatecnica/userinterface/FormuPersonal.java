package pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormuPersonal extends PageObject {
    public static final Target INPUT_NAME = Target.the("Ingresar nombre").locatedBy("//*[@id=\"firstName\"]");
    public static final Target INPUT_LASTNAME = Target.the("Ingresar Apellido").locatedBy("//*[@id=\"lastName\"]");
    public static final Target INPUT_EMAIL = Target.the("Ingresar Correo").locatedBy("//*[@id=\"email\"]");
    public static final Target INPUT_MONTH = Target.the("Ingresar mes de nacimiento").locatedBy("//*[@id=\"birthMonth\"]");
    public static final Target INPUT_DAY = Target.the("Ingresar día de nacimiento").locatedBy("//*[@id=\"birthDay\"]");
    public static final Target INPUT_YEAR = Target.the("Ingresar año de nacimiento").locatedBy("//*[@id=\"birthYear\"]");
    public static final Target NEXLOCATION_BUTTON = Target.the("boton seguir al siguiuente formulario").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a");

}
