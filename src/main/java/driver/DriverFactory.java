package driver;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {

	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public static WebDriver createWebDriver() {
		String webdriver = System.getProperty("browser", "chrome");
		switch (webdriver) {
		case "chrome":
			return initChromeDriver();
		case "firefox":
			return initFirefoxDriver();
		case "edge":
			return initEdge();
		}
		return createWebDriver();

	}

	private static WebDriver initChromeDriver() {
		if (driver == null) {
			String pathDriverChorme = System.getProperty("user.dir")
					+ "\\src\\main\\java\\webdrivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", pathDriverChorme);
			driver = new ChromeDriver();
			wait = new WebDriverWait(DriverFactory.initChromeDriver(), 22);
			driver.manage().window().maximize();
		}

		return driver;
	}

	private static WebDriver initFirefoxDriver() {
		if (driver == null) {
			String pathDriverFirefox = System.getProperty("user.dir")
					+ "\\src\\main\\java\\webdrivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", pathDriverFirefox);
			driver = new FirefoxDriver();
			wait = new WebDriverWait(DriverFactory.initFirefoxDriver(), 12);
			driver.manage().window().maximize();
		}

		return driver;
	}

	private static WebDriver initEdge() {
		if (driver == null) {
			String pathDriverEdge = System.getProperty("user.dir") + "\\src\\main\\java\\webdrivers\\edgedriver.exe";
			System.setProperty("webdriver.edge.driver", pathDriverEdge);
			driver = new EdgeDriver();
			wait = new WebDriverWait(DriverFactory.initEdge(), 12);
			driver.manage().window().maximize();
		}

		return driver;
	}

	public void navega(String url) {
		DriverFactory.createWebDriver().get(url);
	}

	public void screenshot(String status, String nomeTeste) {
		try {
			TakesScreenshot fonte = (TakesScreenshot) DriverFactory.createWebDriver();
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
