package cat.catalunyamedieval.cmts.testng.domain.militars;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Epoca Carlina.
 */
public class EpocaCarlinaTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public EpocaCarlinaTest(String url) {
		this.url = url;
	}
	
	@Test
	public void testTitleEpocaCarlina() throws Exception {

		list.goToEdificacionsMilitars("/fortificacions-depoca-carlina/");
		assertEquals(list.getTitle(), "Fortificacions d’Època Carlina | Catalunya Medieval");
		
	}

}
