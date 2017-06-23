package cat.catalunyamedieval.cmts.testng;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;


/**
 * Unit test for simple App.
 */
public class CatalunyaMedievalSimpleTest extends TestConfiguration{

	private static final String HTTP_WWW_CATALUNYAMEDIEVAL_ES = "http://www.catalunyamedieval.es";
	private static final String HTTP_WWW_CATALUNYAMEDIEVAL_CAT = "http://www.catalunyamedieval.cat";
	private static final String HTTP_WWW_CATALUNYAMEDIEVAL_NET = "http://www.catalunyamedieval.net";
	private static final String HTTP_WWW_CATALUNYAMEDIEVAL_COM = "http://www.catalunyamedieval.com";

	/**
	 * Test .es
	 */
	@Test
	public void openWebES() {
		
		home.go(HTTP_WWW_CATALUNYAMEDIEVAL_ES);
		String actualTitle = home.getTitle();
		String expectedTitle = "Catalunya Medieval | Castells, Torres, Fortificacions i altres construccions"; 
		
		Assert.assertEquals(actualTitle, expectedTitle, "Titles differs");
		Assert.assertTrue( home.validatePageLoad(), "Validation Failed - catalunya medieval text does not exist in "+HTTP_WWW_CATALUNYAMEDIEVAL_ES);
		
	}
	
	/**
	 * Test .cat
	 */
	@Test
	public void openWebCAT() {
		home.go(HTTP_WWW_CATALUNYAMEDIEVAL_CAT);
		Assert.assertTrue( home.validatePageLoad(), "Validation Failed - catalunya medieval text does not exist in "+HTTP_WWW_CATALUNYAMEDIEVAL_CAT);
	}
	
	/**
	 * Test .net
	 */
	@Test
	public void openWebNET() {
		home.go(HTTP_WWW_CATALUNYAMEDIEVAL_NET);
		Assert.assertTrue( home.validatePageLoad(), "Validation Failed - catalunya medieval text does not exist in "+HTTP_WWW_CATALUNYAMEDIEVAL_NET);
	}
	
	/**
	 * Test .com
	 */
	@Test
	public void openWebCOM() {
		home.go(HTTP_WWW_CATALUNYAMEDIEVAL_COM);
		Assert.assertTrue( home.validatePageLoad(), "Validation Failed - catalunya medieval text does not exist in "+HTTP_WWW_CATALUNYAMEDIEVAL_COM);
	}
	
	@AfterTest
	public void closeBrowser(){
		home.close();
	}
	
}
