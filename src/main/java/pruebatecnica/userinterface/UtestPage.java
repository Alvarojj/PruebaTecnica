package pruebatecnica.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {
    public static final Target JOINTODAY_BUTTON = Target.the("boton de registrar").locatedBy("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a");
    public static final Target BIENVENIDA = Target.the("Mensaje de bienvenida").locatedBy("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1");
}
