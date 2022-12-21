package automation.stepDef;

import automation.pages.HomePage;
import automation.pages.LoginPage;
import automation.pages.LogoutPage;


public class BaseSteps {


    LoginPage loginPage= new LoginPage();
    LogoutPage logoutPage=new LogoutPage();
    HomePage homePage = new HomePage();

}
