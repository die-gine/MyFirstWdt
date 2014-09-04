package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactResultPage extends AbstractPage{

	public ContactResultPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public String returnConfirmationMessage(){
		String message = driver.findElement(By.tagName("p")).getText();
		return message; 
	}
}
