package setupDriver;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {
    private static WebDriver driver;

    private static  void setDriver(){
        driver = new ChromeDriver(WebDriverConfig.chromeDriverOptions());
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver(){
        if (driver==null){
            setDriver();
        }
        return driver;
    }

}
