package cat.catalunyamedieval.cmts.testng.domain.civils;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Ponts.
 */
public class PontsTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public PontsTest(String url) {
		this.url = url;
	}
	@Test
	public void testTitlePonts() throws Exception {

		list.goToEdificacionsCivils("/ponts/");
		assertEquals(list.getTitle(), "Ponts | Catalunya Medieval");
		
	}

}
