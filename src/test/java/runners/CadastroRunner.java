package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/featureUsuario/Cadastro.feature",
                 glue = {""},
                 plugin =  { "pretty", "com.cucumber.listener.ExtentCucumberFormatter:target/reportTestesCadastro.html"},
                 monochrome = true,
                 snippets = SnippetType.CAMELCASE,
                 dryRun = false
)

public class CadastroRunner {
	
	@AfterClass
	 public static void writeExtentReports() {
	 Reporter.loadXMLConfig(new File("./extension-config.xml"));
	
	 }

}
