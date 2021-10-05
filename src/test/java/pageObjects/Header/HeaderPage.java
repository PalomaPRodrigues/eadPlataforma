package pageObjects.Header;

import org.openqa.selenium.By;

public class HeaderPage {
	
	private By btnCurso = By.xpath("//*[@class='fa fa-laptop']");
	private By btnForum = By.xpath("//li[@class='active forum']");
	private By btnCarrinho = By.xpath("//li[@class='active carrinho']");
	private By btnNotificacao = By.xpath("//li[@class='active carrinho notificacao']");
	
	public By getBtnCurso() {
		return btnCurso;
	}
	public By getBtnForum() {
		return btnForum;
	}
	public By getBtnCarrinho() {
		return btnCarrinho;
	}
	public By getBtnNotificacao() {
		return btnNotificacao;
	}
	
	
	

	
}
