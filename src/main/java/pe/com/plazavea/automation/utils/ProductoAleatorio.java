package pe.com.plazavea.automation.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import java.util.List;

public class ProductoAleatorio {
    public static WebElementFacade ListaProducto(Actor actor) {
        List<WebElementFacade> listaElementos = BrowseTheWeb.as(actor).findAll("//div[@class='Search__result__content']//div[@class='SuggestionItem__productImage']");
        int posicion = (int) (Math.random()*listaElementos.size());
        return listaElementos.get(posicion);
    }
}
