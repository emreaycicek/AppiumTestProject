package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class BasketPage {

    By productName = By.className("android.widget.Image");

    private WebDriverWait wait;
    private AndroidDriver<MobileElement> driver;

    public BasketPage(AndroidDriver<MobileElement> driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public void AssertProductInBasket(){
        wait.until(ExpectedConditions.elementToBeClickable(productName));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String productNameText = driver.findElement(productName).getText();
        Assert.assertEquals(SuperPricePage.name,productNameText);
    }







}
