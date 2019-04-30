package PageObjets2;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;
//Login olur.
public class LoginPageObject extends PageObject {
    @Override
    public void navigateTo() {browser.get(ConfigReader.getInstance().getHost());
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void Loginpage() throws InterruptedException {
        browser.findElement(By.className("ico-login")).click();
        browser.findElement(By.className("email")).sendKeys("ugur.akyay@cci.com.tr");
        browser.findElement(By.className("password")).sendKeys("654321");
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[4]/div/div/div[1]/div[2]/form/div[3]/input")).click();
        Thread.sleep(2000);
        String dogrulama = browser.findElement(By.className("row")).getText();
        System.out.println(dogrulama);
        System.out.println("Login işlemi başarılı...");
    }
}
