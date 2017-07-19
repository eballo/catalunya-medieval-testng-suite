package cat.catalunyamedieval.cmts.testng.domain.es.militars;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list castells.
 */
public class CastellsESTest extends TestConfiguration {

	@Test
	public void testTitleCastells() throws Exception {

		list.go(HTTP_WWW_CATALUNYAMEDIEVAL_ES + "/edificacions-de-caracter-militar/castells/");
		assertEquals(list.getTitle(), "Castells | Catalunya Medieval");
		
	}

}
