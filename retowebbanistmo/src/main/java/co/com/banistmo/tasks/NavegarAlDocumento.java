package co.com.banistmo.tasks;

import co.com.banistmo.userinterfaces.PaginaPrincipal;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class NavegarAlDocumento implements Task {

    @Override
    @Step("{0} navega a través de las secciones legales hasta el PDF")
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo( Click.on(PaginaPrincipal.BTN_CERRAR_BANNER)        );

        WebElement element = PaginaPrincipal.LNK_APRENDER_ES_FACIL.resolveFor(actor);
        ((JavascriptExecutor) BrowseTheWeb.as(actor).getDriver()).executeScript("arguments[0].scrollIntoView({behavior: 'instant', block: 'center'});", element);


        actor.attemptsTo(
                WaitUntil.the(PaginaPrincipal.LNK_APRENDER_ES_FACIL, isEnabled()).forNoMoreThan(15).seconds(),
                Click.on(PaginaPrincipal.LNK_APRENDER_ES_FACIL)
                // WaitUntil.the(PaginaPrincipal.BTN_DESCUBRE_MAS_LEGALES, isClickable()).forNoMoreThan(15).seconds()

        );

       element=PaginaPrincipal.BTN_DESCUBRE_MAS_LEGALES.resolveFor(actor);

        ((JavascriptExecutor) BrowseTheWeb.as(actor).getDriver()).executeScript("arguments[0].scrollIntoView({behavior: 'instant', block: 'center'});", element);

        actor.attemptsTo(
                Click.on(PaginaPrincipal.BTN_DESCUBRE_MAS_LEGALES)
                   );

        element=PaginaPrincipal.BTN_CONOCE_MAS_FATCA.resolveFor(actor);
        ((JavascriptExecutor) BrowseTheWeb.as(actor).getDriver()).executeScript("arguments[0].scrollIntoView({behavior: 'instant', block: 'center'});", element);

        actor.attemptsTo(
                     Click.on(PaginaPrincipal.BTN_CONOCE_MAS_FATCA)
        );

        element=PaginaPrincipal.LNK_PDF_PJ.resolveFor(actor);
        ((JavascriptExecutor) BrowseTheWeb.as(actor).getDriver()).executeScript("arguments[0].scrollIntoView({behavior: 'instant', block: 'center'});", element);

        actor.attemptsTo(
                Click.on(PaginaPrincipal.LNK_PDF_PJ)
        );


    }


    public static NavegarAlDocumento legal() {
        return instrumented(NavegarAlDocumento.class);
    }
}