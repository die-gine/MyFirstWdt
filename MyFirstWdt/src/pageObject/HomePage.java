package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage{

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public ContactPage clickOnContact(){
		driver.findElement(By.id("contact_link")).click();
		return new ContactPage(driver);
	}
	
}
