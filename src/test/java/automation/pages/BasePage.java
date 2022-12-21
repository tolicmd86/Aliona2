package automation.pages;

import automation.utils.ConfigReader;
import automation.utils.DriverUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.logging.Logger;

public class BasePage {

    WebDriver driver = DriverUtils.getDriver();


    Logger logger= Logger.getLogger("Oh");

    public void openWebSite(){
        driver.get(ConfigReader.getProperty("browser"));
    }

    public BasePage(){
        PageFactory.initElements(driver,this);

    }

}
