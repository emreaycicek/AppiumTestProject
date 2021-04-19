package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

    By closeButton = By.id("close_button");
    By accountIconButton = By.id("account_icon");
    By loginButton = By.id("llUserAccountLogin");

    private WebDriverWait wait;
    private AndroidDriver<MobileElement> driver;

    public HomePage(AndroidDriver<MobileElement> driver,WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public void closeAnimation(){

        WebElement closeButtonElement = wait.until(ExpectedConditions.elementToBeClickable(closeButton));
        closeButtonElement.click();

    }
    public void enterMenuPage(){

        WebElement accountButtonElement = wait.until(ExpectedConditions.elementToBeClickable(accountIconButton));
        accountButtonElement.click();

    }
    public void enterLoginPage(){

        WebElement loginButtonElement = wait.until(ExpectedConditions.elementToBeClickable(loginButton));
        loginButtonElement.click();

    }

    public void scrollAndGoToSuperPrice() {
        MobileElement mobileElement = driver.findElementByAndroidUIAutomator(
                "new UiScrollable(" + "new UiSelector().scrollable(true)).scrollIntoView("
                        + "new UiSelector().resourceIdMatches(\"" + "com.pozitron.hepsiburada:id/dod_all" + "\"));");
        mobileElement.click();
    }



}
