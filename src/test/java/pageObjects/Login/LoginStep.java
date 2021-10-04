package pageObjects.Login;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class LoginStep {
	
	private LoginLogic loginLogic;
	
	public LoginStep() {
		loginLogic = new LoginLogic();
	}
	
	@Dado("^clico Login$")
	public void clicoLogin() {
		loginLogic.clicarLogin();
	    
	}
	
	@Quando("^seleciono entrar$")
	public void selecionoEntrar()  {
		loginLogic.clicarEntrar();
	   
	}

}
