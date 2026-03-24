package co.com.banistmo.questions;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class ElPdf implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = BrowseTheWeb.as(actor).getDriver();
        String ventanaPrincipal = driver.getWindowHandle();
        Set<String> todasLasVentanas = driver.getWindowHandles();

        for (String ventana : todasLasVentanas) {
            if (!ventana.equals(ventanaPrincipal)) {
                driver.switchTo().window(ventana);
                break;
            }
        }
        // Validamos que la URL contenga el nombre del archivo esperado [cite: 49, 57]
        return driver.getCurrentUrl().contains("https://assets.ctfassets.net/catp2t59asao/2IHaxF76DAW7LiHSARGxWh/9c1dedd5685f93d514ea4e54cee22085/PJ_Autocertificacion_unificado-_Fatca_y_CRS.pdf");

    }

    public static ElPdf esElCorrecto() {
        return new ElPdf();
    }
}