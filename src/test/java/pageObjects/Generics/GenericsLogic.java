package pageObjects.Generics;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drive.DriverFactory;

public class GenericsLogic extends DriverFactory {

	private GenericsPage genericsPage;

	public GenericsLogic() {
		genericsPage = new GenericsPage();

	}

	public void navega() {
		navega("https://iasmin.eadplataforma.com/");
	}

	public void validoMsg(String msgFinal) {
		String cmpValidacao = String.format(genericsPage.getTxtVisivel(), msgFinal);
		tempoDeEspera(6000);
		WebElement xpathMsg = driver.findElement(By.xpath(cmpValidacao));
		assertTrue(xpathMsg.isDisplayed());
	}

}
