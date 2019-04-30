package PageObjets2;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;
//sepet içerisinde 5 ürün var ise bunu 3 olarak güncelleyip bir sonraki adıma geçer
public class GoPaymentPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }
    @Override
    public boolean isPresent() {
        return false;
    }
    public void CheckBasket() throws InterruptedException {
        String spet_adedi = browser.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div/div/div[1]/div[2]/div[1]/div/input")).getAttribute("value");
        int result = Integer.parseInt(String.valueOf(spet_adedi));
        if (result == 5){
            browser.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div/div/div[1]/div[2]/div[1]/div/input")).clear();
            Thread.sleep(1000);
            browser.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div/div/div[1]/div[2]/div[1]/div/input")).sendKeys("3");
            Thread.sleep(3000);
            browser.findElement(By.cssSelector("#shopping-cart-form > div > div > div.clearfix.row > div > div > div.common-buttons > input.button-2.update-cart-button")).click();
            Thread.sleep(2000);
            browser.findElement(By.id("checkout")).click();
            Thread.sleep(2000);
        }
        else{
            browser.findElement(By.id("checkout")).click();
            Thread.sleep(2000);
        }
    }
}
