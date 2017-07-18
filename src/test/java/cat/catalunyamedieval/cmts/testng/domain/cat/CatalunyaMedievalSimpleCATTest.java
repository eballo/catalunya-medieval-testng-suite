package cat.catalunyamedieval.cmts.testng.domain.cat;

import org.testng.Assert;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for simple App.
 */
public class CatalunyaMedievalSimpleCATTest extends TestConfiguration {

	/**
	 * Test .cat
	 */
	@Test
	public void openWebCAT() {

		home.go(HTTP_WWW_CATALUNYAMEDIEVAL_CAT);
		String actualTitle = home.getTitle();
		String expectedTitle = "Catalunya Medieval | Castells, Torres, Fortificacions i altres construccions2";

		Assert.assertEquals(actualTitle, expectedTitle, "Titles differs");
		Assert.assertTrue(home.validatePageLoad(),
				"Validation Failed - catalunya medieval text does not exist in " + HTTP_WWW_CATALUNYAMEDIEVAL_CAT);

	}

}
