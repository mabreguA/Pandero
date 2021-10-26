package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Task;
import java.util.List;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class Buscar implements Task {

    private String producto;



    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(

        );
    }
    public static Buscar busca(List<String> producto) {
        return instrumented(Buscar.class, producto);
    }
}
