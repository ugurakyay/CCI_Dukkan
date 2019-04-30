package PageObjects;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class StartShoppingPageObject extends PageObject {


    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void Shoping() throws InterruptedException {



        String spet_adedi = browser.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div/div/div[1]/div[2]/div[1]/div/input")).getAttribute("value");
        System.out.println(spet_adedi);

        int result = Integer.parseInt(String.valueOf(spet_adedi));

        System.out.println(spet_adedi);


        if (result == 5){
            browser.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div/div/div[1]/div[2]/div[1]/div/input")).clear();
            Thread.sleep(1000);
            browser.findElement(By.xpath("//*[@id=\"shopping-cart-form\"]/div/div/div[1]/div[2]/div[1]/div/input")).sendKeys("3");
            Thread.sleep(3000);
            browser.findElement(By.cssSelector("#shopping-cart-form > div > div > div.clearfix.row > div > div > div.common-buttons > input.button-2.update-cart-button")).click();
            Thread.sleep(2000);
            browser.findElement(By.id("checkout")).click();
            Thread.sleep(2000);
        }

        else{
            browser.findElement(By.id("checkout")).click();
            Thread.sleep(2000);
        }



    }
}
