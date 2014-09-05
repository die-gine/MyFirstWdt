package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pageObject.ContactPage;
import pageObject.ContactResultPage;

public class LoginServiceTest extends AbstractWebDriverTest{
	@Before
	public void testSetUp(){
		System.out.println("LoginServiceTest setup"); 
	}
	@After
	public void testShutDown(){
		System.out.println("LoginServiceTest shutdown"); 	
		
	}
	@Test
	public void shouldSendContactMessage(){
		System.out.println("LoginServiceTest perform"); 	}
}
