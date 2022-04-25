package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import strings.EspnStrings;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    private WebDriver driver;
    private EspnStrings espnStrings = new EspnStrings();

    private By loginPreButton = By.linkText(espnStrings.getElement1());

    private By usernameField = By.cssSelector(espnStrings.getElement1());
    private By passwordField = By.cssSelector(espnStrings.getElement2());

    private By onPage = By.linkText(espnStrings.getElement7());

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void setUsername(){
        driver.findElement(usernameField).sendKeys(espnStrings.getUsername());
    }

    public void setPassword(){
        driver.findElement(passwordField).sendKeys(espnStrings.getPassword());
    }

    public void clickLoginPreButton(){
        driver.findElement(loginPreButton).click();
    }

    public void getOnPageAlert(){

    }

    public void waitTime(){
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

}
