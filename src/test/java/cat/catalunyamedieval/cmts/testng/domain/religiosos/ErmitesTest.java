package cat.catalunyamedieval.cmts.testng.domain.religiosos;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Ermites.
 */
public class ErmitesTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public ErmitesTest(String url) {
		this.url = url;
	}
	
	@Test
	public void testTitleErmites() throws Exception {

		list.goToEdificacionsReligios("/ermites/");
		assertEquals(list.getTitle(), "Ermites | Catalunya Medieval");
		
	}

}
