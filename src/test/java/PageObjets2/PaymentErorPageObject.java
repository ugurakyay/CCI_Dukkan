package PageObjets2;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class PaymentErorPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void PaymentEror() throws InterruptedException {

        browser.findElement(By.id("CardholderName")). sendKeys(randomAlphabetic(4)+" " +randomAlphabetic(4));

        browser.findElement(By.id("CardNumber")).sendKeys("4111111111111129");
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
        Thread.sleep(9000);
        browser.findElement(By.id("checkout")).click();
        Thread.sleep(2000);

        String HataMesaji = browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[3]/div")).getText();
        System.out.println("Ödeme Mesajı: " + HataMesaji);




    }
}
