package Tests;

import PageObjets2.*;
import framework.BaseWebAutomationTest;
import org.junit.Test;

public class FooterPageTest extends BaseWebAutomationTest {
   private UserContractPageOject Contract;

   public FooterPageTest(){
       Contract=new UserContractPageOject();
   }

   @Test
    public void footerTest(){
       Contract.navigateTo();
       Contract.UserContract();




   }
}
