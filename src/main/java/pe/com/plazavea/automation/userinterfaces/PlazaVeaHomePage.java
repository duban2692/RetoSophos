package pe.com.plazavea.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlazaVeaHomePage {
    public static final Target BARRA_BUSQUEDA = Target.the("BarraBusqueda").located(By.id("search_box"));
    public static final Target LISTA_PRODUCTOS = Target.the("listaProductos").located(By.xpath("//div//a[contains(text(),'Ver producto')]"));
    public static  final Target AGREGAR_CARRITO = Target.the("agregarCarrito").located(By.id("ProductCard__add-to-cart"));
}
