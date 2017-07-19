package cat.catalunyamedieval.cmts.testng.domain.net;

import org.testng.Assert;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for domain .net
 */
public class CatalunyaMedievalSimpleNETTest extends TestConfiguration {

	/**
	 * Test .net 
	 */
	@Test
	public void openWebNET() {

		home.go(HTTP_WWW_CATALUNYAMEDIEVAL_NET);
		String actualTitle = home.getTitle();
		String expectedTitle = "Catalunya Medieval | Castells, Torres, Fortificacions i altres construccions";

		Assert.assertEquals(actualTitle, expectedTitle, "Titles differs");
		Assert.assertTrue(home.validatePageLoad(),
				"Validation Failed - catalunya medieval text does not exist in " + HTTP_WWW_CATALUNYAMEDIEVAL_NET);

	}

}
