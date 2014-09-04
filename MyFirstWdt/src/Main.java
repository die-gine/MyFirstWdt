import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
	public static void main(String[] args){
		//create instance of webriver
		WebDriver driver = new FirefoxDriver(); 
		
		//go to the webpage
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		
		//click to about link
		driver.findElement(By.id("about_link")).click();
		
		//check that the about page has title
		String title = driver.getTitle();
		
		if (title.equals("About Zoo")){
			System.out.println("check: " + title);	
		}else{
			System.out.println("failed: " + title);
		}
		//close the driver{}
		driver.close();
		
		
	}

}
