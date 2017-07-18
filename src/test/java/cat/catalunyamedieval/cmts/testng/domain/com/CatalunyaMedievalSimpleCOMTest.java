package cat.catalunyamedieval.cmts.testng.domain.com;

import org.testng.Assert;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for simple App.
 */
public class CatalunyaMedievalSimpleCOMTest extends TestConfiguration {

	/**
	 * Test .com
	 */
	@Test
	public void openWebCOM() {

		home.go(HTTP_WWW_CATALUNYAMEDIEVAL_COM);
		String actualTitle = home.getTitle();
		String expectedTitle = "Catalunya Medieval | Castells, Torres, Fortificacions i altres construccions";

		Assert.assertEquals(actualTitle, expectedTitle, "Titles differs");
		Assert.assertTrue(home.validatePageLoad(),
				"Validation Failed - catalunya medieval text does not exist in " + HTTP_WWW_CATALUNYAMEDIEVAL_COM);

	}

}