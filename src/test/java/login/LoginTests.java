package login;

import base.BaseTests;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessLogin(){
        loginPage.clickLoginPreButton();
        loginPage.waitTime();
        //assertTrue(loginPage.getOnPageAlert().contains("Amigos"),"Alert text is incorrect");


//        loginPage.setUsername();
//        loginPage.setPassword();
//        TimelinePage timelinePage = loginPage.clickLoginButton();
//        assertTrue(timelinePage.getOnPageAlert().contains("Marketplace"),
//                "Alert text is incorrect");
    }
}
