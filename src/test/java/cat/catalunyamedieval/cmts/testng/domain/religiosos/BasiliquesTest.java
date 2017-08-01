package cat.catalunyamedieval.cmts.testng.domain.religiosos;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Basiliques.
 */
public class BasiliquesTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public BasiliquesTest(String url) {
		this.url = url;
	}
	
	@Test
	public void testTitleBasiliques() throws Exception {

		list.goToEdificacionsReligios("/basiliques/");
		assertEquals(list.getTitle(), "Basíliques | Catalunya Medieval");
		
	}

}
