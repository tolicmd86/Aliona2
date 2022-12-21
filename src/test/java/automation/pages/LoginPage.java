package automation.pages;

import automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

 @FindBy(xpath = "//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")
    WebElement  login;
@FindBy(xpath = "//input[@name='username']")
WebElement username;
@FindBy(xpath = "//input[@type='password']")
WebElement loginPassword;
@FindBy(xpath = "//button[@type='submit']")
WebElement submitButton;



    public void verifyLoginPage(){
        Assert.assertTrue("Login",login.isDisplayed());

    }

    public void doLogin(){
        username.sendKeys(ConfigReader.getProperty("loginUsername"));
        loginPassword.sendKeys(ConfigReader.getProperty("loginPassword"));
    }
    public void submitButton(){
        submitButton.click();
    }

}
