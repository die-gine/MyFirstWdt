package pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage{
	
	@FindBy(how = How.NAME, using ="nav_contact")
	private WebElement contactPageLink;
	
	public HomePage(WebDriver driver) {
		super(driver);
	}

	public ContactPage clickOnContact(){
		driver.findElement(By.xpath("//a[contains(@id,'contact_link')]")).click();
		//driver.findElement(By.id("contact_link")).click();
		return new ContactPage(driver);
	}
	
	public ContactPage navigateToContactPage(){
		contactPageLink.click();
		return PageFactory.initElements(driver, ContactPage.class);
		
	}

	public ContactPage collectionTest(){
		List<WebElement> links = driver.findElements(By.tagName("a"));
		 for(WebElement link : links){
			 if(link.getText().equals("CONTACT")){
				 link.click();
				 break;
			 }
		 }
		
		return new ContactPage(driver);
	}
	
}
