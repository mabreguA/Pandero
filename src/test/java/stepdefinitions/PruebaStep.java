package stepdefinitions;

import cucumber.api.java.es.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.Buscar;
import userinterfaces.HomePage;
import tasks.Ingresar;

import java.util.List;

public class PruebaStep {
    @Managed(driver = "chrome")
    private WebDriver navegador1;
    private Actor actor = Actor.named("Vozy");
    private HomePage homepage = new HomePage();


    @Dado("^Ingreso a la pagina de SauceDemo$")
    public void ingresoASauceDemo() {
        actor.can(BrowseTheWeb.with(navegador1));
        actor.wasAbleTo(Open.browserOn(homepage));
    }

    @Cuando("^Uso las credenciales de usuario (.*) y password (.*)$")
    public void usoLasCredencialesDeUsuarioStandard_userYPasswordSecret_sauce(String usuario, String password) {
        actor.wasAbleTo(
                Ingresar.login(usuario, password)
        );
    }

    @Entonces("^Valido que se muestre el siguiente$")
    public void validoQueSeMuestreElSiguiente(List<String> producto) {
        actor.wasAbleTo(
                Buscar.busca(producto)
        );

    }


    @Cuando("^Seleccionemos el producto$")
    public void seleccionemosElProducto() {

    }

    @Y("^Agregamos al carrito y vamos al inventario$")
    public void agregamosAlCarritoYVamosAlInventario() {
    }

    @Entonces("^Confirmamos la compra del producto en el checkout$")
    public void confirmamosLaCompraDelProductoEnElCheckout() {
    }

    @Y("^llenamos los siguientes datos$")
    public void llenamosLosSiguientesDatos(List<String> first, List<String> Last, List<String> postal) {
    }

    @Y("^continuamos para validar la compra y confirmar$")
    public void continuamosParaValidarLaCompraYConfirmar() {
    }

    @Y("^Volver a la pagina de compra$")
    public void volverALaPaginaDeCompra() {
    }
}
