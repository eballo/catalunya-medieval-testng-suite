package cat.catalunyamedieval.cmts.testng.domain.civils;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Palaus.
 */
public class PalausTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public PalausTest(String url) {
		this.url = url;
	}

	@Test
	public void testTitlePalaus() throws Exception {

		list.goToEdificacionsCivils("/palaus/");
		assertEquals(list.getTitle(), "Palaus | Catalunya Medieval");
		
	}

}
