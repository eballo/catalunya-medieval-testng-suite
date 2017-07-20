package cat.catalunyamedieval.cmts.testng.domain.civils;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Torres Colomer.
 */
public class TorresColomerTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public TorresColomerTest(String url) {
		this.url = url;
	}
	@Test
	public void testTitleTorresColomer() throws Exception {

		list.goToEdificacionsCivils("/torres-colomer/");
		assertEquals(list.getTitle(), "Torres colomer | Catalunya Medieval");
		
	}

}
