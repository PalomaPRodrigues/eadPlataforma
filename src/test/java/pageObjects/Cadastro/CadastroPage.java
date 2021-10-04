package pageObjects.Cadastro;

import org.openqa.selenium.By;

public class CadastroPage {
	
	private By btnCadastrar = By.xpath("//*[@class='active cadastro_pg_inicial']");
	private By cmpNome= By.xpath("//input[@id='nome']");
	private By cmpTelefone= By.id("telefone");
	private By cmpEmail = By.id("email");
	private By cmpSenha = By.id("senha");
	private By cmpCaptcha = By.id("e-captcha");
	private String btncriarConta = "//*[@class='btn btn-lg btn-custom btn-block']";
	
	public By getCadastrar() {
		return btnCadastrar;
	}
	
	public By getNome() {
		return cmpNome;
	}
	
	public By getTelefone() {
		return cmpTelefone;
	}

	public By getEmail() {
		return cmpEmail;
	}

	public By getSenha() {
		return cmpSenha;
	}
	
	public By getCaptcha() {
		return cmpCaptcha;
	}
	
	public String getCriarConta() {
		return btncriarConta;
	}

}
