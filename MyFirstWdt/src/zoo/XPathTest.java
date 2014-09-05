package zoo;

import org.junit.Test;

import pageObject.ContactPage;
import test.AbstractWebDriverTest;

public class XPathTest extends AbstractWebDriverTest {

	@Test
	public void xPathTest(){
		home.navigateToWebapp().clickOnContact().fillFieldName("test");
	}
	
}
