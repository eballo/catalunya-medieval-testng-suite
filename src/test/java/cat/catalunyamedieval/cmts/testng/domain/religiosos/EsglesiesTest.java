package cat.catalunyamedieval.cmts.testng.domain.religiosos;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Esglesies.
 */
public class EsglesiesTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public EsglesiesTest(String url) {
		this.url = url;
	}
	
	@Test
	public void testTitleEsglesies() throws Exception {

		list.goToEdificacionsReligios("/esglesies/");
		assertEquals(list.getTitle(), "Esglésies | Catalunya Medieval");
		
	}

}
