package cat.catalunyamedieval.cmts.testng.selenium.pages;

import org.openqa.selenium.WebDriver;

/**
 * Selenium Page for List Page
 * 
 * @author Enric Ballo
 *
 */
public class ListPage extends AbstractPage {

	private static final String EDIFICACIONS_DE_CARACTER_MILITAR = "/edificacions-de-caracter-militar";
	private static final String EDIFICACIONS_DE_CARACTER_CIVIL = "/edificacions-de-caracter-civil";
	private static final String EDIFICACIONS_DE_CARACTER_RELIGIOS = "/edificacions-de-caracter-religios";
	private static final String EDIFICACIONS_D_INTERES = "/edificacions-dinteres";

	public ListPage(WebDriver driverProvider, String url) {
		super(driverProvider, url);
	}

	/**
	 * goes to the url domain + caracter militar + edifici
	 * 
	 * @param edifici
	 */
	public void goToEdificacionsMilitars(String edifici) {
		goTo(EDIFICACIONS_DE_CARACTER_MILITAR + edifici);
	}

	/**
	 * goes to the url domain + caracter civil + edifici
	 * 
	 * @param edifici
	 */
	public void goToEdificacionsCivils(String edifici) {
		goTo(EDIFICACIONS_DE_CARACTER_CIVIL + edifici);
	}

	/**
	 * goes to the url domain + caracter religios + edifici
	 * 
	 * @param edifici
	 */
	public void goToEdificacionsReligios(String edifici) {
		goTo(EDIFICACIONS_DE_CARACTER_RELIGIOS + edifici);
	}

	/**
	 * goes to the url domain + caracter interes + edifici
	 * 
	 * @param edifici
	 */
	public void goToEdificacionsdInteres(String edifici) {
		goTo(EDIFICACIONS_D_INTERES + edifici);
	}

}
