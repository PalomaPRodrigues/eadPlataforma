package pageObjects.Login;

public class LoginLogic extends driver.DriverFactory {
	
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
