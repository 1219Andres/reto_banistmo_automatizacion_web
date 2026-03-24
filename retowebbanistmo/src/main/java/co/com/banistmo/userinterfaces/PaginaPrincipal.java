package co.com.banistmo.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPrincipal {
    // body > div.bc-overflow-hidden > dialog > div > div.ml-bandstrip-flexible__container > button
    public static final Target BTN_CERRAR_BANNER = Target.the("Botón para cerrar el banner de cookies")
            .located(By.cssSelector("body > div.bc-overflow-hidden > dialog > div > div.ml-bandstrip-flexible__container > button"));

    public static final Target LNK_APRENDER_ES_FACIL = Target.the("Enlace Aprender es Fácil")
            .located(By.cssSelector("body > div.bc-overflow-hidden > footer > div.or-footer-top.bc-bg-brand-primary-00 > div > div > div.bc-col-12.bc-col-xl-8.bc-offset-xl-1 > div > div:nth-child(2) > div > ul > li:nth-child(2) > a > span"));
    public static final Target LNK_IMPULSA = Target.the("Enlace Legales")
            .locatedBy("/html/body/div[1]/footer/div[1]/div/div/div[1]/div/div[2]/div/ul/li[5]/a/span");
    public static final Target BTN_DESCUBRE_MAS_LEGALES = Target.the("Botón Descubre más de Legales")
            .locatedBy("div:nth-child(5) div:nth-child(1) div:nth-child(2) div:nth-child(4) div:nth-child(1) button:nth-child(1) span:nth-child(1)");
    public static final Target BTN_CONOCE_MAS_FATCA = Target.the("Botón Conoce más de FATCA & CRS")
            .locatedBy("//div//div[2]//div[1]//div[2]//div[4]//div[1]//button[1]//span[1]");

    public static final Target LNK_PDF_PJ = Target.the("Botón PDF de Autocertificación PJ")
            .locatedBy("/html/body/div[2]/main/div/div/section[2]/div/div/div/div/div[2]/div[2]/div/a[3]/span");
}
