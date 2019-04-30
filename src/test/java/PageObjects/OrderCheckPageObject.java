package PageObjects;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;

public class OrderCheckPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void ordernocheck() throws InterruptedException {

        browser.findElement(By.xpath("/html/body/div[9]/header/div/div[2]/div[3]/div/div[1]/div[1]/i")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("/html/body/div[9]/header/div/div[2]/div[3]/div/div[1]/div[2]/a[1]")).click();
        Thread.sleep(2000);
        String siparişNo = browser.findElement(By.xpath("/html/body/div[9]/div[2]/div[4]/div/div[2]/div/div[2]/div/div[1]/div[1]/strong")).getText();
        System.out.println(siparişNo);
        String GirisTipi = browser.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/div[3]/div/div[1]/div[1]/div/div/a")).getText();

        if ("Puanınız:".equals(GirisTipi)){
            String MüşteriTipi = browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[4]/div/div[2]/div/div[2]/div/div[1]/ul/li[3]/span")).getText();
            System.out.println("Sipariş Puan Tutarı: " + MüşteriTipi);
            System.out.println("Müşteri Tipi: Customer");
        }

        else {
            String MüşteriTipi = browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[4]/div/div[2]/div/div[2]/div/div[1]/ul/li[3]/span")).getText();
            System.out.println("Sipariş Puan Tutarı: " + MüşteriTipi);
            System.out.println("Müşteri Tipi: Consumer");


        }


    }
}
