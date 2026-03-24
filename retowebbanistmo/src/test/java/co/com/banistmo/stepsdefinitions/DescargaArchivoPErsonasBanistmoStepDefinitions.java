package co.com.banistmo.stepsdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import co.com.banistmo.questions.ElPdf;
import co.com.banistmo.tasks.NavegarAlDocumento;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.is;
public class DescargaArchivoPErsonasBanistmoStepDefinitions {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que el {string} se encuentra en el portal institucional de Banistmo")
    public void queElActorSeEncuentraEnElPortalInstitucionalDeBanistmo(String actor) {
        // Paso inicial: Abrir la URL base solicitada en el reto
        theActorCalled("QA Analyst").wasAbleTo(
                Open.url("https://www.banistmo.com/wps/portal/banistmo/personas/")
        );

    }
    @Cuando("solicita el documento de autocertificación unificado para personas jurídicas")
    public void solicitaElDocumentoDeAutocertificacionUnificadoParaPersonasJuridicas() {
        // Ejecuta la tarea que creamos (Pasos 1 al 4 del documento) [cite: 4, 31, 42, 49]
        theActorInTheSpotlight().attemptsTo(
                NavegarAlDocumento.legal()
        );
    }
    @Entonces("debería visualizar el formulario legal en formato PDF correctamente")
    public void deberiaVisualizarElFormularioLegalEnFormatoPDFCorrectamente() {
        // Write code here that turns the phrase above into concrete actions
        theActorInTheSpotlight().should(
                seeThat("El PDF visualizado es el correcto", ElPdf.esElCorrecto(), is(true))
        );
    }

    }




