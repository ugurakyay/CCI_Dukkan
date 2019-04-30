package PageObjets2;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;

public class AddProductPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void AddProduct() throws InterruptedException {
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[5]/div[1]/div[2]/div/div[1]")).click();
        Thread.sleep(2000);
        browser.findElement(By.className("buttonProduct")).click();
        String SepetDurumu = browser.findElement(By.className("cart-qty")).getText();
        System.out.println("Sepet içerisindeki ürün sayısı: " +SepetDurumu);

    }
}
