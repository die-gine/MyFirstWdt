package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage extends AbstractPage {

	public ContactPage(WebDriver driver) {
		super(driver);
	}
	public ContactPage fillFormWithData(){
		driver.findElement(By.name("name_field")).sendKeys("test name");
		driver.findElement(By.name("address_field")).sendKeys("test address");
		driver.findElement(By.name("postcode_field")).sendKeys("test plz");
		driver.findElement(By.name("email_field")).sendKeys("test mail");
		return new ContactPage(driver);
		
	}
	public ContactResultPage submitForm(){
		driver.findElement(By.id("submit_message")).click();
		return new ContactResultPage(driver);
		
	}
}