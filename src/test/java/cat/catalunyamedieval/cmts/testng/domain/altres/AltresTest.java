package cat.catalunyamedieval.cmts.testng.domain.altres;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Altres Edificacions
 */
public class AltresTest extends TestConfiguration {
	
	@Factory(dataProvider = "domain")
	public AltresTest(String url) {
		this.url = url;
	}

	@Test(enabled=false)
	public void testTitleCasaForta() throws Exception {

		list.goToEdificacionsdInteres("/altres/");
		assertEquals(list.getTitle(), "Altres Edificacions d'interés | Catalunya Medieval");
		
	}

}
