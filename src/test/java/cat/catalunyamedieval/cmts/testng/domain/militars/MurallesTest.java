package cat.catalunyamedieval.cmts.testng.domain.militars;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Muralles.
 */
public class MurallesTest extends TestConfiguration {
	
	@Factory(dataProvider = "domain")
	public MurallesTest(String url) {
		this.url = url;
	}
	
	@Test
	public void testTitleMuralles() throws Exception {

		list.goToEdificacionsMilitars("/muralles/");
		assertEquals(list.getTitle(), "Muralles | Catalunya Medieval");
		
	}

}
