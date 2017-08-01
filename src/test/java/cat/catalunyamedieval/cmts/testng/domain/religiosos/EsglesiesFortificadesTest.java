package cat.catalunyamedieval.cmts.testng.domain.religiosos;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Esglesies Fortificades.
 */
public class EsglesiesFortificadesTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public EsglesiesFortificadesTest(String url) {
		this.url = url;
	}
	
	@Test
	public void testTitleEsglesiesFortificades() throws Exception {

		list.goToEdificacionsReligios("/esglesies-fortificades/");
		assertEquals(list.getTitle(), "Esglésies fortificades | Catalunya Medieval");
		
	}

}
