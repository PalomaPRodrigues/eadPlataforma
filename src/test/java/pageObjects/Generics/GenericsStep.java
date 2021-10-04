package pageObjects.Generics;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class GenericsStep {
	
	private GenericsLogic genericsLogic;

	public GenericsStep() {
		genericsLogic = new GenericsLogic();
	}

	@Dado("^que estou na pagina home do site$")
	public void queEstouNaPaginaHomeDoSite() {
		genericsLogic.navega();
	}

	@Entao("^valido mensagem final com sucesso \"([^\"]*)\"$")
	public void validoCadastroComSucesso(String msgFinal) {
		genericsLogic.validoMsg(msgFinal);
	}


}
