package cat.catalunyamedieval.cmts.testng.configuration;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

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
	
	@BeforeSuite
	public void beforeSuiteConfiguration(){
		WebDriver driverProvider = new FirefoxDriver();
		pageFactory = new PageFactory(driverProvider);
		
		home = pageFactory.newHome();
		advancedSearch = pageFactory.newAdvancedSearch();
	}
	
	@AfterTest
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
