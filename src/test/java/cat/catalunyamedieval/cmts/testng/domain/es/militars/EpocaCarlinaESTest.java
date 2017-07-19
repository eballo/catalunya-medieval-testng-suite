package cat.catalunyamedieval.cmts.testng.domain.es.militars;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Epoca Carlina.
 */
public class EpocaCarlinaESTest extends TestConfiguration {

	@Test
	public void testTitleEpocaCarlina() throws Exception {

		list.go(HTTP_WWW_CATALUNYAMEDIEVAL_ES + "/edificacions-de-caracter-militar/fortificacions-depoca-carlina/");
		assertEquals(list.getTitle(), "Fortificacions d’Època Carlina | Catalunya Medieval");
		
	}

}
