package drive;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public static WebDriver createChrome() {
		if (driver == null) {
			String pathDriverChorme = System.getProperty("user.dir")
					+ "\\src\\main\\java\\chromedriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", pathDriverChorme);
			driver = new ChromeDriver();
			wait = new WebDriverWait(DriverFactory.createChrome(), 12);
			driver.manage().window().maximize();
		}

		return driver;
	}
	
	public void navega(String url) {
		DriverFactory.createChrome().get(url);
	}

	public void screenshot(String status, String nomeTeste) {
		try {
			TakesScreenshot fonte = (TakesScreenshot) DriverFactory.createChrome();
			File fnt = fonte.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fnt,
					new File("Evidencias" + File.separator + status + File.separator + nomeTeste + ".jpg"));
		} catch (Exception e) {
			System.out.println("Erro na Escrita de arquivo.");
		}
	}

	public static void tempoDeEspera(int iTimeInMillis) {
		try {
			Thread.sleep(iTimeInMillis);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

	public static void encerraDriver() {

		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}


}
