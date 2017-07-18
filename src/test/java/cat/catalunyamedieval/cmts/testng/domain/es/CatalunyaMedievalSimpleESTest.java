package cat.catalunyamedieval.cmts.testng.domain.es;

import org.testng.Assert;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for simple App.
 */
public class CatalunyaMedievalSimpleESTest extends TestConfiguration {

	/**
	 * Test .es
	 */
	@Test
	public void openWebES() {

		home.go(HTTP_WWW_CATALUNYAMEDIEVAL_ES);
		String actualTitle = home.getTitle();
		String expectedTitle = "Catalunya Medieval | Castells, Torres, Fortificacions i altres construccions";

		Assert.assertEquals(actualTitle, expectedTitle, "Titles differs");
		Assert.assertTrue(home.validatePageLoad(),
				"Validation Failed - catalunya medieval text does not exist in " + HTTP_WWW_CATALUNYAMEDIEVAL_ES);

	}

}
