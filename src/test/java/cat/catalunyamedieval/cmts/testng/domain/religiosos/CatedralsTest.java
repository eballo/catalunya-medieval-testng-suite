package cat.catalunyamedieval.cmts.testng.domain.religiosos;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import cat.catalunyamedieval.cmts.testng.configuration.TestConfiguration;

/**
 * Unit test for list Catedrals.
 */
public class CatedralsTest extends TestConfiguration {

	@Factory(dataProvider = "domain")
	public CatedralsTest(String url) {
		this.url = url;
	}
	
	@Test
	public void testTitleCatedrals() throws Exception {

		list.goToEdificacionsReligios("/catedrals/");
		assertEquals(list.getTitle(), "Catedrals | Catalunya Medieval");
		
	}

}
