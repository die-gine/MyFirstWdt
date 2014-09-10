package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import util.PropertyManager;

public class AbstractPage {
	protected WebDriver driver; 
	protected PropertyManager property;
	
	public AbstractPage(WebDriver driver){
		property = new PropertyManager();
		property.generateProperty();
		this.driver = driver; 
	}
	
	public WebDriver getDriver(){
		return this.driver;
	}
	public HomePage navigateToWebapp(){
		driver.navigate().to("http://www.thetestroom.com/webapp/index.html");
		return PageFactory.initElements(driver,HomePage.class );
	}
}
