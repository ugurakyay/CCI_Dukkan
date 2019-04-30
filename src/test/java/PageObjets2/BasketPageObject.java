package PageObjets2;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;

public class BasketPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void GotoBasket(){
        browser.findElement(By.className("shoppingBtn")).click();
    }
}
