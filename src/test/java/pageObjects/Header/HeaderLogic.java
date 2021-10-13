package pageObjects.Header;

public class HeaderLogic extends driver.DriverFactory {

	private HeaderPage headerpage;

	public HeaderLogic() {
		headerpage = new HeaderPage();
	}
	
	public void clicarLogo() {
		headerpage.getBtnLogo().findElement(driver).click();
		
	}

	public void clicarCurso() {
		headerpage.getBtnCurso().findElement(driver).click();

	}

	public void ClicarForum() {
		headerpage.getBtnForum().findElement(driver).click();
	}

	public void ClicarCarrinho() {
		headerpage.getBtnCarrinho().findElement(driver).click();
	}

	public void ClicarNotificacao() {
		headerpage.getBtnNotificacao().findElement(driver).click();
	}
}
