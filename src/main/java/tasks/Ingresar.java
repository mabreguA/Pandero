package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.questions.Visibility;
import org.openqa.selenium.Keys;
import org.springframework.scheduling.support.SimpleTriggerContext;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;


public class Ingresar implements Task {

    private String usuario;
    private String password;
    private String mensaje;

    public Ingresar(String usuario, String password) {
        this.usuario = usuario;
        this.password=password;
        this.mensaje=mensaje;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(usuario).into(INPUT_USUARIO),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(LINK_RESTABLECER),

                Enter.theValue(mensaje).into(INPUT_PASSWORD),
                Click.on(BOTON_ENVIAR),
                Click.on(MENSAJE_POP.of(mensaje))
        );
    }

    public static Ingresar login(String usuario, String password) {
        return instrumented(Ingresar.class, usuario,password);
    }
    public static Ingresar envio(String mensaje) {
        return instrumented(Ingresar.class, mensaje);
    }
}
