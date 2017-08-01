package cat.catalunyamedieval.cmts.testng.domain;

import org.testng.Assert;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for simple App.
 */
public class CatalunyaMedievalSimpleTest extends TestConfiguration {
	
	@Factory(dataProvider = "domain")
	public CatalunyaMedievalSimpleTest(String url) {
		this.url = url;
	}

	/**
	 * Test .es
	 */
	@Test
	public void openWebES() {

		home.goToHomePage();
		String actualTitle = home.getTitle();
		String expectedTitle = "Catalunya Medieval | Castells, Torres, Fortificacions i altres construccions";

		Assert.assertEquals(actualTitle, expectedTitle, "Titles differs");
		Assert.assertTrue(home.validatePageLoad(),
				"Validation Failed - catalunya medieval text does not exist in " + HTTP_WWW_CATALUNYAMEDIEVAL_ES);

	}

}
