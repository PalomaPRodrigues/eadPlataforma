package pageObjects.Header;

import cucumber.api.java.pt.Quando;

public class HeaderStep {

	private HeaderLogic headerLogic;

	public HeaderStep() {
		headerLogic = new HeaderLogic();
	}


	@Quando("^clico no \"([^\"]*)\"$")
	public void clicoNo(String menu) {
		headerLogic.clicarMenu(menu);

	}

}
