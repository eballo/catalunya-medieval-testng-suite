package cat.catalunyamedieval.cmts.testng.domain.militars;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Castells.
 */
public class CastellsTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public CastellsTest(String url) {
		this.url = url;
	}
	
	@Test
	public void testTitleCastells() throws Exception {

		list.goToEdificacionsMilitars("/castells/");
		assertEquals(list.getTitle(), "Castells | Catalunya Medieval");
		
	}

}
