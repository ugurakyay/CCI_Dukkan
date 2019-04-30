package Tests;

import PageObjets2.*;
import framework.BaseWebAutomationTest;
import org.junit.Test;

public class PaymentErorPageTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private AddProductPageObject addproduct;
    private BasketPageObject SeeBasket;
    private GoPaymentPageObject goPayment;
    private AdressChosePageObject adresPage;
    private PaymentErorPageObject paymentEror;

    public PaymentErorPageTest(){
        login = new LoginPageObject();
        addproduct = new AddProductPageObject();
        SeeBasket=new BasketPageObject();
        goPayment= new GoPaymentPageObject();
        adresPage = new AdressChosePageObject();
        paymentEror = new PaymentErorPageObject();
    }

    @Test

    public void ErorPayment () throws InterruptedException {
        login.navigateTo();
        login.Loginpage();
        addproduct.AddProduct();
        SeeBasket.GotoBasket();
        goPayment.CheckBasket();
        adresPage.ChoseAdress();
        paymentEror.PaymentEror();
    }
}
