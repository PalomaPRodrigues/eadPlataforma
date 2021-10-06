package pageObjects.Header;

import cucumber.api.java.pt.Dado;

public class HeaderStep {

	private HeaderLogic headerLogic;

	public HeaderStep() {
		headerLogic = new HeaderLogic();
	}

	@Dado("^clico no Curso$")
	public void clicoNoCurso() {
		headerLogic.clicarCurso();

	}

	@Dado("^clico no Forum$")
	public void clicoNoForum() {
		headerLogic.ClicarForum();

	}

	@Dado("^clico no Carrinho$")
	public void clicoNoCarrinho() {
		headerLogic.ClicarCarrinho();

	}

	@Dado("^clico no notificacao$")
	public void clicoNoNotificacao() {
		headerLogic.ClicarNotificacao();

	}

}