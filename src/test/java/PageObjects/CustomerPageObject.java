package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;

import java.util.ArrayList;

public class CustomerPageObject extends PageObject {
    @Override
    public void navigateTo() { browser.get(ConfigReader.getInstance().getCustomer());
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void customer() throws InterruptedException {
        browser.findElement(By.id("txtLoginOutletNumber")).sendKeys("10378175");
        browser.findElement(By.id("txtLoginPassword")).sendKeys("asdf1234");
        Thread.sleep(2000);
        browser.findElement(By.id("btnLogin")).click();
        Thread.sleep(7000);
        //String PuanDurumu = browser.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[3]/div[2]/span[1]")).getText();
        //System.out.println("Kullanıcının Puan Durumu: "+ PuanDurumu);
        browser.findElement(By.xpath("//*[@id=\"header\"]/div/div/div[2]/nav/ul/li[2]/a")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div/div[2]/span[2]")).click();
        Thread.sleep(2000);
        browser.findElement(By.id("btnRedirect")).click();
        Thread.sleep(2000);
        //yeni tab
        ArrayList<String> tabs = new ArrayList<String>(browser.getWindowHandles());
        browser.switchTo().window(tabs.get(1));

        Thread.sleep(3000);

        String coladukkanı = browser.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[1]/div/span")).getText();
        System.out.println("Coca Cola Dükkanı: "+ coladukkanı);




    }

}
