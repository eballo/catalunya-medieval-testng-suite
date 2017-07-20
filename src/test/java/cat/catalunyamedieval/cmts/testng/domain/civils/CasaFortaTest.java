package cat.catalunyamedieval.cmts.testng.domain.civils;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Casa Forta.
 */
public class CasaFortaTest extends TestConfiguration {
	
	@Factory(dataProvider = "domain")
	public CasaFortaTest(String url) {
		this.url = url;
	}

	@Test
	public void testTitleCasaForta() throws Exception {

		list.goToEdificacionsCivils("/cases-fortes/");
		assertEquals(list.getTitle(), "Cases fortes | Catalunya Medieval");
		
	}

}
