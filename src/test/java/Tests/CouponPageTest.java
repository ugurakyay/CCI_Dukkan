package Tests;

import PageObjets2.*;
import framework.BaseWebAutomationTest;
import org.junit.Test;

public class CouponPageTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private AddProductPageObject addproduct;
    private BasketPageObject SeeBasket;
    private GoPaymentPageObject goPayment;
    private CouponBBasketPageObject couponshop;
    private AdressChosePageObject adresPage;
    private PaymentPageObject Payment;

    public CouponPageTest(){
        login = new LoginPageObject();
        addproduct=new AddProductPageObject();
        SeeBasket=new BasketPageObject();
        goPayment= new GoPaymentPageObject();
        couponshop = new CouponBBasketPageObject();
        adresPage = new AdressChosePageObject();
        Payment = new PaymentPageObject();
    }


    @Test
    public void shopbyCoupon() throws InterruptedException {
        login.navigateTo();
        login.Loginpage();
        addproduct.AddProduct();
        SeeBasket.GotoBasket();
        couponshop.AddCoupon();
        goPayment.CheckBasket();
        adresPage.ChoseAdress();
        Payment.creditCart();
    }
}
