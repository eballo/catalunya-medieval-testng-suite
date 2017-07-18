package cat.catalunyamedieval.cmts.testng.configuration;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import cat.catalunyamedieval.cmts.testng.selenium.pages.AdvancedSearchPage;
import cat.catalunyamedieval.cmts.testng.selenium.pages.HomePage;
import cat.catalunyamedieval.cmts.testng.selenium.pages.PageFactory;

/**
 * Test Configuration
 *
 */
public class TestConfiguration {
	
	public static final String HTTP_WWW_CATALUNYAMEDIEVAL_ES = "http://www.catalunyamedieval.es";
	public static final String HTTP_WWW_CATALUNYAMEDIEVAL_CAT = "http://www.catalunyamedieval.cat";
	public static final String HTTP_WWW_CATALUNYAMEDIEVAL_NET = "http://www.catalunyamedieval.net";
	public static final String HTTP_WWW_CATALUNYAMEDIEVAL_COM = "http://www.catalunyamedieval.com";

	
	private PageFactory pageFactory;
	
	public HomePage home;
	public AdvancedSearchPage advancedSearch;
	
	@BeforeClass
	public void beforeSuiteConfiguration(){
		WebDriver driverProvider = new FirefoxDriver();
		pageFactory = new PageFactory(driverProvider);
		
		home = pageFactory.newHome();
		advancedSearch = pageFactory.newAdvancedSearch();
	}
	
	@AfterClass
	public void afterTestCloseSession(){
		pageFactory.getDriverProvider().quit();
	}
	
	@AfterMethod 
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException { 
		if (testResult.getStatus() == ITestResult.FAILURE) { 
			File scrFile = ((TakesScreenshot)pageFactory.getDriverProvider()).getScreenshotAs(OutputType.FILE); 
			FileUtils.copyFile(scrFile, new File("errorScreenshots\\" + testResult.getName() + "-" 
					+ Arrays.toString(testResult.getParameters()) +  ".jpg"));
		} 
	}

}
