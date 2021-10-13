package pageObjects.Footer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import driver.DriverFactory;

public class FooterLogic extends DriverFactory {

	private FooterPage footerPage;

	public FooterLogic() {
		footerPage = new FooterPage();
	}

	public void clicarCoockies() {
		footerPage.getBtnOk().findElement(driver).click();
		tempoDeEspera(500);

	}

	public void clicarFaleConosco() {
	footerPage.getBtnFaleConosco().findElement(driver).click();
	}

	public void clicarPolitica() {
		footerPage.getBtnPolitica().findElement(driver).click();
	}

	public void clicarCertificado() {
		footerPage.getBtnCertificado().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void clicarIconeFacebook() {
		footerPage.getBtnFacebook().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void clicarIconeYoutube() {
		footerPage.getBtnYoutube().findElement(driver).click();
		tempoDeEspera(500);
		}

	public void clicarIconeInstagram() {
		footerPage.getBtnInstagram().findElement(driver).click();
		tempoDeEspera(500);
	}

	public void clicarImgFacebook() {
		driver.switchTo().frame(0);
		tempoDeEspera(5000);
		WebElement procurabtn = driver.findElement(By.xpath(footerPage.getImgFacebook()));
		Actions actions = new Actions(driver);
		actions.click(procurabtn).build().perform();

	}

	public void clicarbtnEadPlataforma() {
		footerPage.getBtnEadPlataforma().findElement(driver).click();
		tempoDeEspera(1000);
	}

}
