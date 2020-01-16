package pe.com.plazavea.automation.runners;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@CucumberOptions(
        features = "src/test/resources/features/compra_producto.feature",
        glue = {"pe.com.plazavea.automation.stepdefinitions"},
        snippets = CAMELCASE
)

@RunWith(CucumberWithSerenity.class)
public class CompraProductoRunner {
}
