package pageObject;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	protected WebDriver driver; 
	
	public AbstractPage(WebDriver driver){
		this.driver = driver; 
	}
	
	public WebDriver getDriver(){
		return this.driver;
	}
	public HomePage navigateToWebapp(){
		driver.navigate().to("http://www.thetestroom.com/webapp/index.html");
		return new HomePage(driver);
	}
}
