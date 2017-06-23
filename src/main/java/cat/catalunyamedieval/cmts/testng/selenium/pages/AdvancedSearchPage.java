/**
 * 
 */
package cat.catalunyamedieval.cmts.testng.selenium.pages;

import static org.openqa.selenium.By.id;

import org.openqa.selenium.WebDriver;

/**
 * Selenium page for Advanced Search Page
 * 
 * @author Enric Ballo
 *
 */
public class AdvancedSearchPage extends AbstractPage {

	private static final String ADVANCED_SEARCH_URL = "http://www.catalunyamedieval.es/cerca/";
	private static final String NAME_KEYWORDSEARCH = "s";
	private static final String SEARCH_BUTTON = "searchsubmit_2";

	public AdvancedSearchPage(WebDriver driverProvider) {
		super(driverProvider);
	}

	public void go() {
		get(ADVANCED_SEARCH_URL);
	}

	public void fillText(final String text) {
		input(id(NAME_KEYWORDSEARCH)).sendKeys(text);

	}

	public void selectDropDown(final String text) {
		// selenium.select("id=cat", text);
	}

	public void doSubmit() {
		input(id(SEARCH_BUTTON)).click();
		// waitForPageToLoad(WAIT_FOR_PAGE_TO_LOAD_INTERVAL_MSEC);
	}

	public boolean validatePageIsLoaded() {
		return getPageSource().contains("Resultats de la cerca");
	}

	public boolean totalResults(final int total) {
		return getPageSource().contains(" elements similars a la consulta");
	}
}
