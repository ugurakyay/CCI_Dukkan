package Tests;

import framework.BaseWebAutomationTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({LoginPageTest.class,ChangeAddressTest.class,SignOutTest.class})
public class TestMyAccount extends BaseWebAutomationTest {
}
