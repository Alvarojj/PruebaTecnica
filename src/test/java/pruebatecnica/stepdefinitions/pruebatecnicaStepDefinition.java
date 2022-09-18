package pruebatecnica.stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import pruebatecnica.questions.Answer;
import pruebatecnica.tasks.*;

public class pruebatecnicaStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver driver;
    private Actor actor = new Actor("Alvaro");
    @Dado("^que un usuario accede a la pagina web de utest y preciona el boton join today$")
    public void queUnUsuarioAccedeALaPaginaWebDeUtestYPrecionaElBotonJoinToday() {
        actor.can(BrowseTheWeb.with(driver));
        actor.wasAbleTo(OpenUp.thePage(), JoinToday.Click());
    }


    @Cuando("^llenamos el formulario de información personal con el nombre (.*) (.*) correo (.*) y la fecha de nacimiento (.*)/(.*)/(.*)$")
    public void llenamosElFormularioDeInformaciónPersonal(String nombre, String apellido, String correo, String mes, String dia, String año) {
        actor.attemptsTo(InfoPersonal.llenarDatos(nombre, apellido, correo, mes, dia, año));
    }

    @Cuando("^llenamos el formulario de registro de localización la ciudad (.*), codigo postal (.*) y el pais (.*)$")
    public void llenamosElFormularioDeRegistroDeLocalización(String ciudad, String postal, String pais) {
        actor.attemptsTo(InfoAddress.llenarDatos(ciudad, postal, pais));
    }

    @Cuando("^llenamos el formulario de dispositivo con tu computador (.*) la version (.*) y el lenguaje (.*)$")
    public void llenamosElFormularioDeDispositivo(String computador, String version, String lenguaje) {
        actor.attemptsTo(InfoDevice.llenarDatos(computador, version, lenguaje));
    }

    @Cuando("^llenamos el formulario de contraseña creando una contraseña (.*)$")
    public void llenamosElFormularioDeContraseña(String contra) {
        actor.attemptsTo(InfoContra.llenarDatos(contra));
    }

    @Entonces("^deberia ver (.*)$")
    public void darClickEnElBotonDeCrearCuenta(String question) {
        actor.should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
