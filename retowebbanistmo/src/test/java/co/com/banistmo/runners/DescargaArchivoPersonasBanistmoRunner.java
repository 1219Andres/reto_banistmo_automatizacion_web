package co.com.banistmo.runners;


import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // Apunta a la carpeta src/test/resources/features
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME, value = "co.com.banistmo.stepsdefinitions")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME, value = "io.cucumber.core.plugin.SerenityReporterParallel,pretty")
public class DescargaArchivoPersonasBanistmoRunner {
}
