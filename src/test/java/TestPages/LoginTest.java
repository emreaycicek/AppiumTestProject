package TestPages;

import Collections.LoginPageCollection;
import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.MenuPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseSetup {


    @Test
    public void Control(){

        new HomePage(driver,wait).closeAnimation();
        new HomePage(driver,wait).enterMenuPage();
        new HomePage(driver,wait).enterLoginPage();
        new LoginPage(driver,wait).signIn(LoginPageCollection.userMail,LoginPageCollection.password);
        new LoginPage(driver,wait).AssertSignedIn();
        new MenuPage(driver,wait).enterAccountPage();
        new AccountPage(driver,wait).changeNameText();
        new AccountPage(driver,wait).goHomePage();
        new HomePage(driver,wait).enterMenuPage();
        new MenuPage(driver,wait).enterAccountPage();
        new AccountPage(driver,wait).AssertUserFirstName();

    }

}
