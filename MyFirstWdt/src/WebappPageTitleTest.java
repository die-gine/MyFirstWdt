import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class WebappPageTitleTest {
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
	public void testTitleAbout(){		
		//click to about link
		driver.findElement(By.id("about_link")).click();
		
		//check that the about page has title
		Assert.assertTrue(driver.getTitle().equals("About Zoo"));	

	}
	@Test
	public void testTitleContact(){		
		//click to about link
		driver.findElement(By.id("contact_link")).click();
		
		//check that the about page has title
		Assert.assertTrue(driver.getTitle().equals("Contact"));	

	}
	
}
