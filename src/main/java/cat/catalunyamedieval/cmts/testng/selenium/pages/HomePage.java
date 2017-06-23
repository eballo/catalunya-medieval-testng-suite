package cat.catalunyamedieval.cmts.testng.selenium.pages;

import org.openqa.selenium.WebDriver;

/**
 * Selenium Page for Home Page
 * 
 * @author Enric Ballo
 *
 */
public class HomePage extends AbstractPage {

	public static final String CATALUNYA_MEDIEVAL = "Catalunya Medieval";

	public HomePage(WebDriver driverProvider) {
		super(driverProvider);
	}

	public void go(final String url) {
		get(url);
	}

	public boolean validatePageLoad() {
		return getPageSource().contains(CATALUNYA_MEDIEVAL);
	}

}
