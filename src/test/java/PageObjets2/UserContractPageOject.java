package PageObjets2;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;

public class UserContractPageOject extends PageObject {
    @Override
    public void navigateTo() {browser.get(ConfigReader.getInstance().getHost());
    }
    @Override
    public boolean isPresent() {
        return false;
    }

    public void UserContract(){
        browser.findElement(By.xpath("//*[@id=\"wrapper\"]/footer/div[2]/div/div/ul/li[1]/ul/li[1]")).click();
        String HeaderCheck = browser.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[5]/div/div/div/div/div[1]/div/h1")).getText();
        System.out.println(HeaderCheck);
    }
}
