package PageObjects;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class Payment3DPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void Payment3D() throws InterruptedException {

        browser.findElement(By.id("CardholderName")). sendKeys(randomAlphabetic(4)+" " +randomAlphabetic(4));

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
        WebElement inputField =browser.findElement(By.id("tckn"));
        inputField.sendKeys(Keys.TAB);
        //browser.findElement(By.id("tds")).click();
        Thread.sleep(2000);
        browser.findElement(By.id("checkoutPaymentStep")).click();
        Thread.sleep(5000);
        browser.findElement(By.id("checkout")).click();
        Thread.sleep(7000);

        new WebDriverWait(browser, 20).until((ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"myFrame\"]"))));
        WebElement smsCode = browser.findElement(By.xpath("//*[@id=\"smsCode\"]"));
        smsCode.click();
        smsCode.sendKeys("283126");
        browser.findElement(By.xpath("//*[@id=\"submitBtn\"]")).click();


        Thread.sleep(3000);
        String onay_kodu = browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div/div/div/span[1]")).getText();
        System.out.println("Sipariş Durumu: "+ onay_kodu);
    }
}
