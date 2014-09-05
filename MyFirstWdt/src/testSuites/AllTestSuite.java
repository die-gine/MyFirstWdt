package testSuites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import test.ContactMessageTest;
import test.DoSomethingTest;
import test.LoginServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	DoSomethingTest.class,
	ContactMessageTest.class,
	LoginServiceTest.class	
})

public class AllTestSuite {

}
