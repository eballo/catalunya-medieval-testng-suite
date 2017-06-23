package cat.catalunyamedieval.cmts.testng.selenium.pages;

import org.openqa.selenium.WebDriver;

/**
 * Page Factory
 * 
 * @author Enric Ballo
 *
 */
public class PageFactory {

	private final WebDriver driverProvider;

	public PageFactory(WebDriver driverProvider) {
		this.driverProvider = driverProvider;
	}

	public HomePage newHome() {
		return new HomePage(driverProvider);
	}

	public AdvancedSearchPage newAdvancedSearch() {
		return new AdvancedSearchPage(driverProvider);
	}

}
