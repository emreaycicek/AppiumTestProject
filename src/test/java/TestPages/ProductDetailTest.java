package TestPages;

import Collections.LoginPageCollection;
import Pages.*;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ProductDetailTest extends BaseSetup {


    @Test
    public void Control(){

        new HomePage(driver,wait).closeAnimation();
        new HomePage(driver,wait).scrollAndGoToSuperPrice();
        new SuperPricePage(driver,wait).enterFirstProduct();
        new SuperPricePage(driver,wait).enterProductImage();
        mobileActions.horizontalSwipeByPercentage(0.8, 0.2, 0.5);
        mobileActions.horizontalSwipeByPercentage(0.8, 0.2, 0.5);
        new SuperPricePage(driver,wait).goBack();
        new SuperPricePage(driver,wait).addToBasket();
        new SuperPricePage(driver,wait).goBack();
        new SuperPricePage(driver,wait).goToBasketPage();
        new BasketPage(driver,wait).AssertProductInBasket();


    }

}
