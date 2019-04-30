package Tests;

import PageObjets2.LoginPageObject;
import PageObjets2.MyAccountChangeAddresssPAgeObject;
import framework.BaseWebAutomationTest;
import org.junit.Test;

public class ChangeAddressTest extends BaseWebAutomationTest {
    private LoginPageObject login;
    private MyAccountChangeAddresssPAgeObject changeaddress;

    public ChangeAddressTest(){
        login = new LoginPageObject();
        changeaddress = new MyAccountChangeAddresssPAgeObject();
    }

    @Test
    public void myAccountAddress() throws InterruptedException {

        login.navigateTo();
        login.Loginpage();
        changeaddress.ChangeAddress();
    }

}
