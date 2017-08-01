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
	private final String url;

	public PageFactory(WebDriver driverProvider, String url) {
		this.driverProvider = driverProvider;
		this.url = url;
	}

	public HomePage newHome() {
		return new HomePage(driverProvider, url);
	}
	
	public ListPage newList() {
		return new ListPage(driverProvider, url);
	}

	public AdvancedSearchPage newAdvancedSearch() {
		return new AdvancedSearchPage(driverProvider, url);
	}

	public WebDriver getDriverProvider() {
		return driverProvider;
	}
	
	public String getbaseUrl(){
		return this.url;
	}

}
