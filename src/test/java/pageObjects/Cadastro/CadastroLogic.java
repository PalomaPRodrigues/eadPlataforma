package pageObjects.Cadastro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CadastroLogic extends driver.DriverFactory{
	
	private CadastroPage cadastroPage;
	
	public CadastroLogic() {
		cadastroPage = new CadastroPage();
	}
	
	public void clicarCadastrar() {
		cadastroPage.getCadastrar().findElement(driver).click();
	}
	
	public void preencherNome(String nome) {
		cadastroPage.getNome().findElement(driver).sendKeys(nome);
		tempoDeEspera(500);
	}
	
	public void preencherTelefone(String telefone) {
		cadastroPage.getTelefone().findElement(driver).sendKeys(telefone);
		tempoDeEspera(500);
	}
	
	public void preencherEmail(String email) {
		cadastroPage.getEmail().findElement(driver).sendKeys(email);
		tempoDeEspera(500);
	}
	
	public void preencherSenha(String senha) {
		cadastroPage.getSenha().findElement(driver).sendKeys(senha);
		tempoDeEspera(500);
	}
	
	public void preencherCaptcha(String captcha) {
		cadastroPage.getCaptcha().findElement(driver).sendKeys(captcha);
		tempoDeEspera(500);
	}
	
	public void clicarCriarConta() {
		WebElement btnCriarConta = driver.findElement(By.xpath(cadastroPage.getCriarConta()));
		Actions actions = new Actions(driver);
		actions.click(btnCriarConta).build().perform();
		tempoDeEspera(500);
	}
}
