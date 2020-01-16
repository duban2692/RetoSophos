package pe.com.plazavea.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Elemento implements Question<Boolean> {

    private Target element;

    public Elemento(Target element) {
        this.element = element;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WaitUntil.the(element, WebElementStateMatchers.isVisible());
        return element.resolveFor(actor).isVisible();
    }

    public static Elemento exists(Target element) {
        return new Elemento(element);
    }
}

