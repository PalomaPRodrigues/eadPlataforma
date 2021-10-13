package pageObjects.Footer;

import org.openqa.selenium.By;

public class FooterPage {
	
	private By btnOk = By.xpath("//a[@class='cc-btn cc-dismiss']");
	private By btnFaleConosco = By.xpath("//*[@href='#contato']");
	private By btnPolitica = By.xpath( "(//a[@href='#politica-privacidade'])[2]");
	private By btnCertificado = By.xpath("//span[@class='hidden-sm']");
	private By btnFacebook = By.xpath("//i[@class='fa fa-facebook-square']");
	private By btnYoutube = By.xpath("//a[@href='https://youtube.com/eadplataforma']");
	private By btnInstagram = By.xpath("//i[@class='fa fa-instagram']");
	private String imgFacebook = "//a[@title='EAD Plataforma']";
	private By btnEadPlataforma = By.xpath("//a[@href='https://eadplataforma.com/?src=https://palomarodrigues.eadplataforma.com/']");
	
	public By getBtnOk() {
		return btnOk;
	}
	
	public By getBtnFaleConosco() {
		return btnFaleConosco;
	}
	public By getBtnPolitica() {
		return btnPolitica;
	}
	public By getBtnCertificado() {
		return btnCertificado;
	}
	public By getBtnFacebook() {
		return btnFacebook;
	}
	public By getBtnYoutube() {
		return btnYoutube;
	}
	public By getBtnInstagram() {
		return btnInstagram;
	}
	public String getImgFacebook() {
		return imgFacebook;
	}
	public By getBtnEadPlataforma() {
		return btnEadPlataforma;
	}

}
