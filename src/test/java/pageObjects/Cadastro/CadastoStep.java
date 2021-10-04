package pageObjects.Cadastro;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class CadastoStep {

	private CadastroLogic cadastrologic;

	public CadastoStep() {
		cadastrologic = new CadastroLogic();
	}


	@Dado("^clico cadastro$")
	public void clicoCadastro() {
		cadastrologic.clicarCadastrar();

	}

	@Dado("^preencho nome \"([^\"]*)\"$")
	public void preenchoNome(String nome) {
		cadastrologic.preencherNome(nome);
	}

	@Dado("^preencho telefone \"([^\"]*)\"$")
	public void preenchoTelefone(String telefone) {
		cadastrologic.preencherTelefone(telefone);

	}

	@Dado("^preencho e-mail \"([^\"]*)\"$")
	public void preenchoEMail(String email) {
		cadastrologic.preencherEmail(email);

	}

	@Dado("^preencho senha \"([^\"]*)\"$")
	public void preenchoSenha(String senha) {
		cadastrologic.preencherSenha(senha);

	}

	@Dado("^preencho Captcha\"([^\"]*)\"$")
	public void preenchoCaptcha(String captcha) {
		cadastrologic.preencherCaptcha(captcha);

	}

	@Quando("^clico criar conta$")
	public void clicoCriarConta() {
		cadastrologic.clicarCriarConta();

	}

}