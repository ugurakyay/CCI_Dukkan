package Tests;

import PageObjets2.SignUpPageObject;
import framework.BaseWebAutomationTest;
import org.junit.Test;

public class SignUpPageTest extends BaseWebAutomationTest {
    private SignUpPageObject signup;


    public SignUpPageTest(){

        signup= new SignUpPageObject();
    }

    @Test//signupTest
    public void SignUpTest() throws InterruptedException {
        signup.navigateTo();
        signup.SignUp();
    }

}
