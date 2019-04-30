package PageObjects;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;

import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;

public class AddAdressPageObject extends PageObject {


    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void addAdres() throws InterruptedException {

        //adres giriş sayfası ( yeni adres) //*[@id="billing-address-select"]/option[2]

        String AdresKontrol = browser.findElement(By.xpath("//*[@id=\"billing-address-select\"]/option[2]")).getText();

        if ("Yeni Adres".equals(AdresKontrol)){
            browser.findElement(By.id("billing-address-select")).click();
            browser.findElement(By.xpath("//*[@id=\"billing-address-select\"]/option[2]")).click();
            Thread.sleep(2000);
            browser.findElement(By.id("Title")).sendKeys(randomAlphabetic(3));
            Thread.sleep(2000);
            browser.findElement(By.id("FirstName")).sendKeys("Tests");
            browser.findElement(By.id("LastName")).sendKeys("Automation");
            browser.findElement(By.id("Email")).sendKeys("automation@mail.com");
            browser.findElement(By.xpath("//*[@id=\"CitizenshipNumber\"]")).sendKeys("31576447074");
            Thread.sleep(3000);
            browser.findElement(By.xpath("//*[@id=\"CountryId\"]")).click();
            Thread.sleep(2000);
            browser.findElement(By.xpath("//*[@id=\"CountryId\"]/option[2]")).click();
            Thread.sleep(2000);
            browser.findElement(By.xpath("//*[@id=\"StateProvinceId\"]")).click();
            Thread.sleep(2000);
            browser.findElement(By.xpath("//*[@id=\"StateProvinceId\"]/option[34]")).click();
            Thread.sleep(2000);
            browser.findElement(By.id("Town")).sendKeys(randomAlphabetic(5));
            Thread.sleep(1000);
            browser.findElement(By.id("Address1")).sendKeys(randomAlphabetic(5));
            Thread.sleep(1000);
            browser.findElement(By.id("Address2")).sendKeys(randomAlphabetic(5));
            Thread.sleep(1000);
            browser.findElement(By.id("DoorNumber")).sendKeys(randomNumeric(2));
            Thread.sleep(1000);
            browser.findElement(By.id("ZipPostalCode")).sendKeys(randomNumeric(5));
            browser.findElement(By.id("PhoneNumber")).sendKeys(randomNumeric(9));
            browser.findElement(By.xpath("//*[@id=\"newAddressForm\"]/div/div/div[14]/input[2]")).click();
            Thread.sleep(3000);
            browser.findElement(By.id("billing-address-select")).click();
            Thread.sleep(2000);
            browser.findElement(By.xpath("//*[@id=\"billing-address-select\"]/option[2]")).click();
            Thread.sleep(3000);
            browser.findElement(By.id("shipping-address-select")).click();
            Thread.sleep(3000);
            browser.findElement(By.xpath("//*[@id=\"shipping-address-select\"]/option[2]")).click();
            Thread.sleep(3000);
            browser.findElement(By.id("checkoutShippingStep")).click();
            Thread.sleep(4000);

        }

        else {
            Thread.sleep(2000);
            browser.findElement(By.xpath("//*[@id=\"billing-address-select\"]/option[2]")).click();
            Thread.sleep(3000);
            browser.findElement(By.id("shipping-address-select")).click();
            Thread.sleep(3000);
            browser.findElement(By.xpath("//*[@id=\"shipping-address-select\"]/option[2]")).click();
            Thread.sleep(3000);
            browser.findElement(By.id("checkoutShippingStep")).click();
            Thread.sleep(4000);

        }

    }
}
