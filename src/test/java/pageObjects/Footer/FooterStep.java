package pageObjects.Footer;

import cucumber.api.java.pt.Dado;

public class FooterStep {
	
	private FooterLogic footerlogic;
	
	public FooterStep() {
		footerlogic = new FooterLogic();
	}
	
	@Dado("^clico eem aceitar coockies$")
	public void clicoEemAceitarCoockies()  {
	    footerlogic.clicarCoockies();
	    
	}
	
	@Dado("^clico Fale Conosco$")
	public void clicoFaleConosco() {
		footerlogic.clicarFaleConosco();
	    
	}

	@Dado("^clico Política de Privacidade$")
	public void clicoPolíticaDePrivacidade() {
		footerlogic.clicarPolitica();
	    
	}

	@Dado("^clico Consultar Certificado$")
	public void clicoConsultarCertificado() {
		footerlogic.clicarCertificado();
	    
	}

	@Dado("^clico Icone Facebook$")
	public void clicoIconeFacebook()  {
		footerlogic.clicarIconeFacebook();
	    
	}

	@Dado("^clico Icone Youtube$")
	public void clicoIconeYoutube()  {
		footerlogic.clicarIconeYoutube();
	    
	}

	@Dado("^clico Icone Instagram$")
	public void clicoIconeInstagram() {
		footerlogic.clicarIconeInstagram();
	   
	}

	@Dado("^clico Imagem Facebook$")
	public void clicoImagemFacebook()  {
		footerlogic.clicarIconeFacebook();
	    
	}

	@Dado("^clico Icone EadPlataforma$")
	public void clicoIconeEadPlataforma()  {
		footerlogic.clicarbtnEadPlataforma();
		
	    
	}

}