package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://int-ginni.pandero.com.pe/")
public class HomePage extends PageObject {
    public static final Target INPUT_USUARIO = Target.the("input donde se ingresa el usuario").located(By.id("txtNombreUsuario"));
    public static final Target INPUT_PASSWORD = Target.the("input donde se ingresa el password").located(By.id("txtContrasenia"));
    public static final Target LINK_RESTABLECER = Target.the("Link de Restablecer").located(By.id("linkRecuperar"));
    public static final Target INPUT_MENSAJE = Target.the("input donde se ingresa el mensaje").locatedBy("/html/body/app-core/div/app-inicio-sesion/ginni-modal[1]/ngx-smart-modal/div/div/div/div/div[2]/div[2]/div/ginni-cargando/div/div/div[1]/div/form/div/input");
    public static final Target BOTON_ENVIAR = Target.the("input donde se ingresa el mensaje").locatedBy("/html/body/app-core/div/app-inicio-sesion/ginni-modal[1]/ngx-smart-modal/div/div/div/div/div[2]/div[2]/div/ginni-cargando/div/div/div[1]/div/form/button");
    public static final Target MENSAJE_POP = Target.the("Mensaje pop").locatedBy("//a[starts-with(@title,'{0}')]");//Entre llaves 0 para que reciba un valor

}