package Tests;

import PageObjets2.LoginPageObject;
import PageObjets2.SignOutPageObject;
import PageObjets2.SignUpPageObject;
import framework.BaseWebAutomationTest;
import org.junit.Test;

public class SignOutTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private SignOutPageObject signOut;

    public SignOutTest(){
        login = new LoginPageObject();
        signOut = new SignOutPageObject();
    }

    @Test
    public void signOut() throws InterruptedException {
        login.navigateTo();
        login.Loginpage();
        signOut.SignOutPage();
    }
}
