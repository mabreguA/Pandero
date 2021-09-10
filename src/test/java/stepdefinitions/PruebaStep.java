package stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterfaces.HomePage;
import tasks.Ingresar;

import java.util.List;

public class PruebaStep {
    @Managed(driver = "chrome")
    private WebDriver navegador1;
    private Actor actor = Actor.named("Global");
    private HomePage homepage = new HomePage();


    @Dado("^Ingreso a Ginni$")
    public void ingresoAGinni() {
        actor.can(BrowseTheWeb.with(navegador1));
        actor.wasAbleTo(Open.browserOn(homepage));
    }

    @Cuando("^Ingreso las credenciales de usuario (.*) y passrowd (.*) para el logeo$")
    public void ingresoLasCredencialesDeUsuarioFolivaYPassrowdParaElLogeo(String usuario, String password) {
        actor.wasAbleTo(
                Ingresar.login(usuario,password)
        );

    }

    @Cuando("^Realizar el restablecmiento de contraseña e ingresar el mensaje (.*)$")
    public void realizarElRestablecmientoDeContraseñaEIngresarElMensaje(String mensaje) {
actor.wasAbleTo(
        Ingresar.envio(mensaje)
);
    }

    @Entonces("^Validar que se muestre el siguiente$")
    public void validarQueSeMuestreElSiguiente(List <String> datos) {

    }

}
