package pageObjects.Login;

import drive.DriverFactory;

public class LoginLogic extends DriverFactory {
	
	private LoginPage loginPage;
	
	public LoginLogic() {
		loginPage = new LoginPage();
	}
	
	public void clicarLogin() {
		loginPage.getLogin().findElement(driver).click();
	}
	
	public void clicarEntrar() {
		loginPage.getBtnEntrar().findElement(driver).click();
	}

}
