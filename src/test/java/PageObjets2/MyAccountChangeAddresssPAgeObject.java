package PageObjets2;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class MyAccountChangeAddresssPAgeObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void ChangeAddress() throws InterruptedException {
        browser.findElement(By.className("account")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[4]/div/div[1]/aside/div/div/div[2]/ul/li[2]/a")).click();
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[4]/div/div[2]/div/div[2]/div[1]/div/div[2]/input[1]")).click();
        browser.findElement(By.id("Address_Address1")).clear();
        browser.findElement(By.id("Address_Address1")).sendKeys("Address değiştime"+ randomNumeric(3));
        browser.findElement(By.id("Address_Address2")).clear();
        browser.findElement(By.id("Address_Address2")).sendKeys("Testi");
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[4]/div/div[2]/form/div/div[2]/div[2]/input")).click();
        Thread.sleep(2000);
        System.out.println("Adres değişimi başarılı....");


    }
}
