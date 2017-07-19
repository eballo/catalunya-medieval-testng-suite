package cat.catalunyamedieval.cmts.testng.domain.es.militars;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Muralles.
 */
public class MurallesESTest extends TestConfiguration {

	@Test
	public void testTitleMuralles() throws Exception {

		list.go(HTTP_WWW_CATALUNYAMEDIEVAL_ES + "/edificacions-de-caracter-militar/muralles/");
		assertEquals(list.getTitle(), "Muralles | Catalunya Medieval");
		
	}

}
