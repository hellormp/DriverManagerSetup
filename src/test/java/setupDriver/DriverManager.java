package setupDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class DriverManager {
    private static WebDriver driver;

    private static  void setDriver(){
        driver = new ChromeDriver(WebDriverConfig.chromeDriverOptions());
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(){
        if (driver==null){
            setDriver();
        }
        return driver;
    }

}
