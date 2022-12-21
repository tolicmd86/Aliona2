package automation.utils;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverUtils {
    static WebDriver driver;

    public static void createDriver(){

        switch (ConfigReader.getProperty("browser")) {
            case "firefox":

                driver = new FirefoxDriver();
                break;
            case "edge":

                driver = new EdgeDriver();
                break;
            default:

                driver = new ChromeDriver();

        }

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        // open the browser
        //driver.get(ConfigReader.getProperty("app.url"));

    }
    public static WebDriver getDriver(){
        return driver;
    }


}
