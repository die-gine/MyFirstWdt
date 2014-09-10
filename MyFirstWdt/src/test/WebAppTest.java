package test;

import org.junit.Test;

import pageObject.HomePage;

public class WebAppTest extends AbstractWebDriverTest{
	
	@Test
	public void shouldPerformSimpleClick(){
		home.navigateToWebapp().navigateToContactPage().navigateToHome();
		
	}

}
