package pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FormuContra extends PageObject {
    public static final Target INPUT_CONTRA = Target.the("Ingresar contraseña").locatedBy("//*[@id=\"password\"]");
    public static final Target INPUT_CONFIRMARCONTRA = Target.the("Confirmar contraseña").locatedBy("//*[@id=\"confirmPassword\"]");
    public static final Target CHECK_TERMINOS = Target.the("aceptar terminos y condiciones").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]");
    public static final Target CHECK_PRIVACIDAD = Target.the("aceptar politicas de privacidad").locatedBy("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]");
    public static final Target CLICK_COMPLETE = Target.the("registrar persona").locatedBy("//*[@id=\"laddaBtn\"]");

}
