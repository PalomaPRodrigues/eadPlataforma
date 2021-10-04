package pageObjects.Header;

import drive.DriverFactory;

public class HeaderLogic extends DriverFactory {

	private HeaderPage headerpage;

	public HeaderLogic() {
		headerpage = new HeaderPage();
	}

	public void clicarMenu(String menu){
		tempoDeEspera(1000);
		headerpage.getBtnCurso().findElement(driver).click();
//		headerpage.getBtnForum().findElement(driver).click();
//		headerpage.getBtnCarrinho().findElement(driver).click();
//		headerpage.getBtnNotificacao().findElement(driver).click();
	}
	
}
