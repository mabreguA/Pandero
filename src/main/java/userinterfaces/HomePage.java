package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.saucedemo.com/")
public class HomePage extends PageObject {

    public static final Target INPUT_USUARIO = Target.the("Campode ingreso de usuario").located(By.id("user-name"));
    public static final Target INPUT_PASSWORD = Target.the("Campode ingreso de password").located(By.id("password"));
    public static final Target BOTON_LOGIN = Target.the("Boton de Login").located(By.id("login-button"));

}