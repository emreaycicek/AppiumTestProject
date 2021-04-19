package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

    By userMail = By.id("etLoginEmail");
    By password = By.id("etLoginPassword");
    By loginButton = By.id("btnLoginLogin");
    By messageTitle = By.id("alertTitle");
    By okButton = By.id("android:id/button1");

    private WebDriverWait wait;
    private AndroidDriver<MobileElement> driver;

    public LoginPage(AndroidDriver<MobileElement> driver,WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public void signIn(String userMailStr,String passwordStr){
        WebElement userMailElement = wait.until(ExpectedConditions.elementToBeClickable(userMail));
        userMailElement.sendKeys(userMailStr);
        WebElement passwordElement = wait.until(ExpectedConditions.elementToBeClickable(password));
        passwordElement.sendKeys(passwordStr);
        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButtonElement.click();


    }
    public void AssertSignedIn(){
        WebElement messageTitleElement = wait.until(ExpectedConditions.elementToBeClickable(messageTitle));
        String messageTitleStr = messageTitleElement.getText();
        Assert.assertEquals(messageTitleStr,"Hoşgeldiniz");
        WebElement okButtonElement = wait.until(ExpectedConditions.elementToBeClickable(okButton));
        okButtonElement.click();
    }

}
