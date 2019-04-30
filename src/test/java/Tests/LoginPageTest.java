package Tests;

import PageObjets2.*;
import framework.BaseWebAutomationTest;
import org.junit.Test;


public class LoginPageTest extends BaseWebAutomationTest {
    private LoginPageObject login;
    private AddProductPageObject addproduct;
    private BasketPageObject SeeBasket;
    private GoPaymentPageObject goPayment;

    private CouponBBasketPageObject couponshop;

    public LoginPageTest(){

        login = new LoginPageObject();

    }

    @Test//logintest

    public void LoginTest() throws InterruptedException {
        login.navigateTo();
        login.Loginpage();

    }




}
