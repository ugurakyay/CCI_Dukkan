package PageObjets2;

import framework.pageobject.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyOrdersPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void MyOrders() throws InterruptedException {
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/div[3]/div/div[1]/div[1]")).click();
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[4]/div/div[1]/aside/div/div/div[2]/ul/li[3]/a")).click();
        Thread.sleep(2000);
        String LastOrderDetail = browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[1]")).getText();
        System.out.println(LastOrderDetail);
    }
}
