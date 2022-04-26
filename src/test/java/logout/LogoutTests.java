package logout;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LogoutTests extends BaseTests {

    @Test
    public void testSuccessLogout(){
        loginPage.clickLoginPreButton1();
        loginPage.clickLoginPreButton2();
        loginPage.setToiFrame();
        loginPage.setUsername();
        loginPage.setPassword();
        loginPage.clickLoginButton();
        loginPage.waitTimePreButton1();
        loginPage.clickLoginPreButton1();
        loginPage.clickLogoutPostButton();
        loginPage.clickLoginPreButton1();
        loginPage.waitTimePreButton1();
        loginPage.clickLoginPreButton1();
        loginPage.waitTimeLabelLogInOut();
        assertEquals(loginPage.getOnPageAlertLogOutSuccesfull(),"Log In","Title not matched");
    }
}
