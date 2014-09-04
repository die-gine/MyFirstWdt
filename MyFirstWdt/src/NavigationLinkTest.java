import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class NavigationLinkTest {
	WebDriver driver; 

	@Before
	public void testSetup(){
		driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp/");	
	}
	@After
	public void testShutDown(){
		driver.quit();
		
	}
	@Test
	public void testNavigationLink(){		
		//click on contact link
		driver.findElement(By.id("contact_link")).click();
		Assert.assertTrue(driver.findElement(By.className("subhead")).getText().equals("Contact Form"));
		driver.findElement(By.name("address_field")).sendKeys("This is address field");
		driver.findElement(By.cssSelector("[id=adoption_link]")).click();
		driver.findElement(By.linkText("HOME")).click();
		driver.findElement(By.partialLinkText("ABO")).click();
		Assert.assertTrue(driver.findElement(By.tagName("p")).getText().contains("animals"));
		driver.findElement(By.xpath("*//*[@id='contact_link']")).click();
		
	}

	
}
