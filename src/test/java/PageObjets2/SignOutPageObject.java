package PageObjets2;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;

public class SignOutPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void SignOutPage(){
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/div[3]/div/div[1]/div[1]")).click();
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[2]/div[3]/div/div[1]/div[1]/div/div/a")).click();
        System.out.println("Sign Out işlemi başarılı...");
    }
}
