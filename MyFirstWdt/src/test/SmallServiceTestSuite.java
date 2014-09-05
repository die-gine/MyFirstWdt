package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ DoSomethingTest.class, LoginServiceTest.class })
public class SmallServiceTestSuite {
//automatisch erstellt durch new->other->junit->suite
}
