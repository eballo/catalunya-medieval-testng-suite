package cat.catalunyamedieval.cmts.testng.domain.es.militars;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Torres.
 */
public class TorresESTest extends TestConfiguration {

	@Test
	public void testTitleTorres() throws Exception {

		list.go(HTTP_WWW_CATALUNYAMEDIEVAL_ES + "/edificacions-de-caracter-militar/torres/");
		assertEquals(list.getTitle(), "Torres | Catalunya Medieval");
		
	}

}
