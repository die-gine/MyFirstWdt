package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactPage extends AbstractPage {
	//vewenden einer pagefactory, lokalisieren der webelemente über anotations
	@FindBy(how = How.NAME, using ="nav_home")
	private WebElement homePageLink;
	
	public ContactPage(WebDriver driver) {
		super(driver);
	}
	public ContactPage fillFormWithData(){
		//auslesen der parameter aus property-file
		driver.findElement(By.name(property.contactFormNameField)).sendKeys(property.contactNameValue);
		driver.findElement(By.name("address_field")).sendKeys("test address");
		driver.findElement(By.name("postcode_field")).sendKeys("test plz");
		driver.findElement(By.name("email_field")).sendKeys("test mail");
		return new ContactPage(driver);
		
	}
	public ContactResultPage submitForm(){
		driver.findElement(By.id("submit_message")).click();
		return new ContactResultPage(driver);
		
	}
	public ContactPage fillFieldName(String name) {
		driver.findElement(By.name("name_field")).sendKeys(name);
		return new ContactPage(driver);
	}	
	
	public HomePage navigateToHome(){
		//pagefactory
		homePageLink.click();
		return PageFactory.initElements(driver, HomePage.class);
	}
}
