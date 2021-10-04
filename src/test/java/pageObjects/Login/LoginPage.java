package pageObjects.Login;

import org.openqa.selenium.By;

public class LoginPage {

	private By btnLogin = By.xpath("//*[@class='active login_header']");
	private By btnEntrar = By.id("btn_login");

	public By getLogin() {
		return btnLogin;
	}

	public By getBtnEntrar() {
		return btnEntrar;
	}
}
