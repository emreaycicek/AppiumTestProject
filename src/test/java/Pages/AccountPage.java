package Pages;

import Collections.AccountPageCollection;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AccountPage {

    By nameText = By.id("etUserFirstName");
    By updateButton = By.id("btnOkSend");
    By infoButton = By.id("android:id/button1");
    By homePage = By.xpath("//android.widget.ImageView[@content-desc=\"navigationItem_0\"]");

    private WebDriverWait wait;
    private AndroidDriver<MobileElement> driver;

    public AccountPage(AndroidDriver<MobileElement> driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }

    public void changeNameText() {

        WebElement nameTextElement = wait.until(ExpectedConditions.elementToBeClickable(nameText));
        nameTextElement.clear();
        nameTextElement.sendKeys(AccountPageCollection.firstName);
        WebElement updateButtonElement = wait.until(ExpectedConditions.elementToBeClickable(updateButton));
        updateButtonElement.click();
        WebElement infoButtonElement = wait.until(ExpectedConditions.elementToBeClickable(infoButton));
        infoButtonElement.click();

    }
    public void goHomePage(){
        WebElement homePageElement = wait.until(ExpectedConditions.elementToBeClickable(homePage));
        homePageElement.click();
    }

    public void AssertUserFirstName(){
        WebElement nameTextElement = wait.until(ExpectedConditions.elementToBeClickable(nameText));
        String nameTextStr = nameTextElement.getText();
        Assert.assertEquals(AccountPageCollection.firstName,nameTextStr);
    }

}
