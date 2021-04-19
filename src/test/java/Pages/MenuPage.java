package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MenuPage {

    By accountName = By.id("tvUserAccountUsername");

    private WebDriverWait wait;
    private AndroidDriver<MobileElement> driver;

    public MenuPage(AndroidDriver<MobileElement> driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public void enterAccountPage(){

        WebElement accountNameElement = wait.until(ExpectedConditions.elementToBeClickable(accountName));
        accountNameElement.click();

    }


}
