package cat.catalunyamedieval.cmts.testng.domain.militars;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Torres.
 */
public class TorresTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public TorresTest(String url) {
		this.url = url;
	}
	
	@Test
	public void testTitleTorres() throws Exception {

		list.goToEdificacionsMilitars("/torres/");
		assertEquals(list.getTitle(), "Torres | Catalunya Medieval");
		
	}

}
