package PageObjets2;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;

public class CouponBBasketPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void AddCoupon() {
        browser.findElement(By.id("discountcouponcode")).sendKeys("testkupon3");
        browser.findElement(By.id("applydiscountcouponcode")).click();
        String CouponName = browser.findElement(By.className("clearfix")).getText();
        System.out.println(CouponName);
        String indirimTutar = browser.findElement(By.className("cart-total-left")).getText();
        System.out.println(indirimTutar);
        String OdenecekTutar = browser.findElement(By.className("totalPrice")).getText();
        System.out.println(OdenecekTutar);

    }
}
