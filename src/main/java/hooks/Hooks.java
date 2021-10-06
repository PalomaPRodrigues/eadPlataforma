package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

	public class Hooks extends driver.DriverFactory{
		@Before
		public static void inicializaBrowser(Scenario teste) {
			System.out.println("inicio do teste: " + teste.getName());
		}
		

		@After
		public static void finalizarTeste(Scenario teste) {
			new driver.DriverFactory().screenshot(teste.getStatus(), teste.getName());
			System.out.println("Teste finalizado. Status de Teste: " + teste.getStatus());
			encerraDriver();
		}

}
