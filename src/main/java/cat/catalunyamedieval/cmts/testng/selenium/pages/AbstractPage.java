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

	public AbstractPage(WebDriver webDriver) {
		super(webDriver);
		this.webDriver = webDriver;
	}

	public void go(final String url) {
		get(url);
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

	public void get(String url) {
		webDriver.get(url);
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
