package pageObjects.Generics;

public class GenericsPage {

	private String txtVisivel = "//*[contains(text(),'%1$s')]";

	public String getTxtVisivel() {
		return txtVisivel;
		
	}
}
