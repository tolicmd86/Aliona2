package automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement dashboard;


    public void verifyUserIsOnHomePage(){
        dashboard.getText();
        Assert.assertEquals("Dashboard",dashboard.getText());
    }



}
