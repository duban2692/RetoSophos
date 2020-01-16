package pe.com.plazavea.automation.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import pe.com.plazavea.automation.utils.ProductoAleatorio;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pe.com.plazavea.automation.userinterfaces.PlazaVeaHomePage.BARRA_BUSQUEDA;
import static pe.com.plazavea.automation.userinterfaces.PlazaVeaHomePage.LISTA_PRODUCTOS;

public class BuscarProduto implements Task {

    private String producto;

    public BuscarProduto(String producto) {
        this.producto = producto;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("Lavadora").into(BARRA_BUSQUEDA).thenHit(Keys.ENTER));
        WebElementFacade posicion = ProductoAleatorio.ListaProducto(actor);
        actor.attemptsTo(Enter.theValue("Lavadora").into(LISTA_PRODUCTOS), Click.on(posicion));

    }

    public static BuscarProduto busqueda(String producto) {
        return instrumented(BuscarProduto.class, producto);
    }
}
