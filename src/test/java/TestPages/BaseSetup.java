package TestPages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.MobileActions;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseSetup {

    protected AndroidDriver<MobileElement> driver;
    protected WebDriverWait wait;
    private DesiredCapabilities dc;
    protected MobileActions mobileActions;

    @BeforeMethod
    public void setUp () throws MalformedURLException {

        dc = new DesiredCapabilities();
        dc.setCapability("deviceName", "Pixel_3a_API_30_x86");
        dc.setCapability("udid", "emulator-5554");
        dc.setCapability("platformName", "Android");
        dc.setCapability("platformVersion", "11.0");
        dc.setCapability("appPackage", "com.pozitron.hepsiburada");
        dc.setCapability("appActivity","com.hepsiburada.ui.startup.SplashActivity");
        dc.setCapability("noReset","false");

        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        wait = new WebDriverWait(driver, 10);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        mobileActions = new MobileActions(driver);

    }


    @AfterMethod
    public void teardown(){

        driver.quit();
    }
}