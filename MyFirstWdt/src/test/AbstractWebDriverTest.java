package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObject.HomePage;

public class AbstractWebDriverTest {
	//class for drivermanagement
	
	protected WebDriver driver; 
	protected HomePage home;

	@Before
	public void setUp(){
		driver = new FirefoxDriver();
		home =  new HomePage(driver);
	}
	@After
	public void shutDown(){
		driver.quit();
	}
	
}
