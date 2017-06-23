package cat.catalunyamedieval.cmts.testng.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cat.catalunyamedieval.cmts.testng.selenium.pages.AdvancedSearchPage;
import cat.catalunyamedieval.cmts.testng.selenium.pages.HomePage;
import cat.catalunyamedieval.cmts.testng.selenium.pages.PageFactory;

/**
 * Test Configuration
 *
 */
public class TestConfiguration {
	
	private PageFactory pageFactory;
	
	public HomePage home;
	public AdvancedSearchPage advancedSearch;
	

	public TestConfiguration(){
		WebDriver driverProvider = new ChromeDriver();
		pageFactory = new PageFactory(driverProvider);
		
		home = pageFactory.newHome();
		advancedSearch = pageFactory.newAdvancedSearch();
	}

}
