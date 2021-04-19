package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperPricePage {

    By firstProduct = By.id("com.pozitron.hepsiburada:id/view_product");
    By productImg = By.id("productImage");
    By addBasket = By.id("product_detail_add_to_cart_text");
    By basket = By.xpath("//android.widget.FrameLayout[@content-desc=\"Sepet\"]");
    By productName = By.id("productName");

    private WebDriverWait wait;
    private AndroidDriver<MobileElement> driver;

    public SuperPricePage(AndroidDriver<MobileElement> driver, WebDriverWait wait){

        this.driver = driver;
        this.wait = wait;
    }
    public static String name;
    public void enterFirstProduct(){

        WebElement firstProductElement = wait.until(ExpectedConditions.elementToBeClickable(firstProduct));
        firstProductElement.click();
        name = driver.findElement(productName).getText();
    }
    public void enterProductImage(){

        WebElement productImgElement = wait.until(ExpectedConditions.elementToBeClickable(productImg));
        productImgElement.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void goBack(){
        driver.navigate().back();
    }

    public void addToBasket(){

        WebElement addBasketElement = wait.until(ExpectedConditions.elementToBeClickable(addBasket));
        addBasketElement.click();
        driver.navigate().back();
    }
    public void goToBasketPage(){

        WebElement basketElement = wait.until(ExpectedConditions.elementToBeClickable(basket));
        basketElement.click();
    }



}
