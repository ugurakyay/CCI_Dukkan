package PageObjects;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;

public class AddBasketProductPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void AddBasket() throws InterruptedException {
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[5]/div[1]/div[2]/div/div[1]")).click();
        Thread.sleep(3000);
        browser.findElement(By.className("buttonProduct")).click();
        String sepet = browser.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/div[3]/div/div[2]/a/span")).getAttribute("textContent");
        System.out.println("Sepet içerisindeki ürün sayısı: "+ sepet);
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/div[3]/div/div[2]/a")).click();
        Thread.sleep(4000);

    }



}
