package PageObjects;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;



public class CustomerAdresPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void customeradres() throws InterruptedException {

        String alışverişTutarı = browser.findElement(By.xpath("/html/body/div[9]/div[2]/div[4]/div[3]/form/div[1]/div/div/div/div/div[2]/div/div[2]/div/div[1]")).getText();
        String BakiyeDurumu = browser.findElement(By.xpath("/html/body/div[9]/div[2]/div[4]/div[3]/form/div[1]/div/div/div/div/div[1]/div/div/span")).getText();

        int bakiye = Integer.parseInt(String.valueOf(BakiyeDurumu));
        int Tutar = Integer.parseInt(String.valueOf(alışverişTutarı));
        if (Tutar > bakiye){

            browser.findElement(By.xpath("//*[@id=\"checkoutPaymentStepForOutlet\"]")).click();
            browser.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
            Thread.sleep(2000);
            String bakiye_durumu = browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div[3]/div")).getText();
            System.out.println("işlem_durumu: " + bakiye_durumu);

        }

        else {
            browser.findElement(By.xpath("//*[@id=\"checkoutPaymentStepForOutlet\"]")).click();
            Thread.sleep(2000);
            browser.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
        }

    }
}
