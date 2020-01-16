package pe.com.plazavea.automation.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import pe.com.plazavea.automation.questions.Elemento;
import pe.com.plazavea.automation.tasks.BuscarProduto;
import pe.com.plazavea.automation.userinterfaces.PlazaveaUrl;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static pe.com.plazavea.automation.userinterfaces.PlazaVeaHomePage.AGREGAR_CARRITO;


public class CompraProductoStepDefinition {
    PlazaveaUrl plazaveaUrl;

    //definición de driver
    @Managed(driver = "chrome")

    private WebDriver browser;

    private Actor Duban = new Actor("Duban");

    //se ejecuta el navegador antes de la prueba
    @Before
    public void setUp() {
        Duban.can(BrowseTheWeb.with(browser));
    }

    //métodos mapeados

    @Given("^duban quiere ingresar al sitio web plazavea$")
    public void dubanQuiereIngresarAlSitioWebPlazavea() throws Exception {
        Duban.wasAbleTo(Open.browserOn().the(plazaveaUrl));

    }

    @When("^duban busca el producto computador(.*)")
    public void dubanBuscaElProductoComputador(String producto) {
        Duban.attemptsTo(BuscarProduto.busqueda(producto));
    }

    @Then("^valida que el producto se agrego al carrito de compras$")
    public void validaQueElProductoSeAgregoAlCarritoDeCompras() throws Exception {

        Duban.should((seeThat(Elemento.exists(AGREGAR_CARRITO))));
    }
}
