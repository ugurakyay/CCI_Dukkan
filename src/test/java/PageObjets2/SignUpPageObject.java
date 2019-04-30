package PageObjets2;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;

import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
//siteye signup olur
public class SignUpPageObject extends PageObject {
    @Override
    public void navigateTo() {browser.get(ConfigReader.getInstance().getHost());
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void SignUp() throws InterruptedException {
        browser.findElement(By.className("ico-register")).click();
        browser.findElement(By.className("name")).sendKeys("LoginPageTest");
        browser.findElement(By.className("surname")).sendKeys("Automation");
        browser.findElement(By.className("email")).sendKeys("TestAutomation"+ randomNumeric(4)+"@xmail.com");
        String SignInMail = browser.findElement(By.className("email")).getText();
        System.out.println(SignInMail);
        browser.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("654321");
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("654321");
        browser.findElement(By.id("checkbox01")).click();
        browser.findElement(By.id("checkbox02")).click();
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/div[1]/form/div[8]/input")).click();
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div/form/div/div[2]/div[2]/input")).click();
        Thread.sleep(2000);
        String dogrulama = browser.findElement(By.className("row")).getText();
        System.out.println(dogrulama);
    }

}
