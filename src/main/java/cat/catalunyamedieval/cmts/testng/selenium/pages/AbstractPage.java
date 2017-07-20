/**
 * 
 */
package cat.catalunyamedieval.cmts.testng.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.seleniumhq.selenium.fluent.FluentWebDriver;

/**
 * 
 * Abstract Page
 * 
 * @author Enric Ballo
 *
 */
public class AbstractPage extends FluentWebDriver {

	/** Identifier for PageLoad. */
	public static final String WAIT_FOR_PAGE_TO_LOAD_INTERVAL_MSEC = "120000";
	private WebDriver webDriver;
	private String url;

	public AbstractPage(WebDriver webDriver, String url) {
		super(webDriver);
		this.webDriver = webDriver;
		this.url = url;
	}

	/**
	 * domain + urlSufix
	 * 
	 * @param urlSufix
	 */
	public void goTo(final String urlSufix) {
		webDriver.get(url + urlSufix);
	}

	public void found(String text) {
		// textIsVisible(text);
	}

	public void found(List<String> texts) {
		for (String text : texts) {
			found(text);
		}
	}

	public void notFound(String text) {
		// textIsNotVisible(text);
	}
	
	public WebDriver getDriver(){
		return webDriver;
	}

	public String getPageSource() {
		return webDriver.getPageSource();
	}

	public String getTitle() {
		return webDriver.getTitle();
	}

	public void close() {
		webDriver.quit();
	}
}
