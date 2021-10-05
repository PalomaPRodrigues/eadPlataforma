package pageObjects.Generics;

public class GenericsPage {

	private String txtVisivel = "//*[contains(text(),'%1$s')] | (//*[contains(text(),'%1$s')])[1] ";

	public String getTxtVisivel() {
		return txtVisivel;
		
	}
}
