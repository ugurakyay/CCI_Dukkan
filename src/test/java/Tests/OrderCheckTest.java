package Tests;

import PageObjects.OrderCheckPageObject;
import PageObjets2.LoginPageObject;
import PageObjets2.MyOrdersPageObject;
import framework.BaseWebAutomationTest;
import org.junit.Test;

public class OrderCheckTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private MyOrdersPageObject order;

    public OrderCheckTest(){
        login = new LoginPageObject();
        order = new MyOrdersPageObject();
    }

    @Test

    public void OrderList() throws InterruptedException {
        login.navigateTo();
        login.Loginpage();
        order.MyOrders();

    }
}
