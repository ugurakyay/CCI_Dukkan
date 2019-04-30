package PageObjets2;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class PaymentPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void creditCart() throws InterruptedException {

        //kartlı ödeme alanı
        String OdemeSayfasi = browser.findElement(By.xpath("//*[@id=\"opcPaymentTab\"]/div/div/div/div/div[1]/div/h1")).getText();
        if ("Ödeme Bilgileriniz".equals(OdemeSayfasi)) {
            browser.findElement(By.id("CardholderName")).sendKeys(randomAlphabetic(4) + " " + randomAlphabetic(4));
            browser.findElement(By.id("CardNumber")).sendKeys("5528790000000008");
            browser.findElement(By.id("ExpireMonth")).click();
            Thread.sleep(2000);
            browser.findElement(By.xpath("//*[@id=\"ExpireMonth\"]/option[12]")).click();
            Thread.sleep(3000);
            browser.findElement(By.id("ExpireYear")).click();
            Thread.sleep(2000);
            browser.findElement(By.xpath("//*[@id=\"ExpireYear\"]/option[7]")).click();
            browser.findElement(By.id("CreditCardCvv2")).sendKeys(randomNumeric(3));
            Thread.sleep(2000);
            browser.findElement(By.id("tckn")).sendKeys("31576447074");
            browser.findElement(By.id("tds")).click();
            Thread.sleep(2000);
            browser.findElement(By.id("checkoutPaymentStep")).click();
            Thread.sleep(5000);
            browser.findElement(By.id("checkout")).click();
            Thread.sleep(7000);
            String onay_kodu = browser.findElement(By.className("approvedItem")).getText();
            System.out.println("Sipariş Durumu: " + onay_kodu);
        }
        else {
            browser.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
            String SiparisOnay = browser.findElement(By.className("approvedItem")).getText();
            System.out.println("sipariş bilgileri: "+SiparisOnay);
        }

    }
}
