package cat.catalunyamedieval.cmts.testng.domain.religiosos;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Monestirs.
 */
public class MonestirsTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public MonestirsTest(String url) {
		this.url = url;
	}
	
	@Test
	public void testTitleMonestirs() throws Exception {

		list.goToEdificacionsMilitars("/monestirs/");
		assertEquals(list.getTitle(), "Monestirs | Catalunya Medieval");
		
	}

}
