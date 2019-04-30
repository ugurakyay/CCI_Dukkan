package Tests;

import PageObjets2.*;
import framework.BaseWebAutomationTest;
import org.junit.Test;

public class PaymentPageTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private AddProductPageObject addproduct;
    private BasketPageObject SeeBasket;
    private GoPaymentPageObject goPayment;
    private AdressChosePageObject adresPage;
    private PaymentPageObject Payment;


    public PaymentPageTest(){
        login = new LoginPageObject();
        addproduct=new AddProductPageObject();
        SeeBasket=new BasketPageObject();
        goPayment= new GoPaymentPageObject();
        adresPage = new AdressChosePageObject();
        Payment = new PaymentPageObject();
    }
    @Test
    public void Payment() throws InterruptedException {
        login.navigateTo();
        login.Loginpage();
        addproduct.AddProduct();
        SeeBasket.GotoBasket();
        goPayment.CheckBasket();
        adresPage.ChoseAdress();
        Payment.creditCart();
    }
}
