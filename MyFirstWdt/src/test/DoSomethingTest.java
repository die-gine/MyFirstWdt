package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DoSomethingTest extends AbstractWebDriverTest{
	@Before
	public void testSetUp(){
		System.out.println("DoSomethingTest setup"); 
	}
	@After
	public void testShutDown(){
		System.out.println("DoSomethingTestt shutdown"); 	
		
	}
	@Test
	public void shouldSendContactMessage(){
		System.out.println("DoSomethingTest perform"); 	}
}
