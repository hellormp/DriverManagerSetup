package setupDriver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class startDownTest {

    protected WebDriver driver = DriverManager.getDriver();

    @AfterTest
    public void browserDown(){
        driver.close();
        driver.quit();
    }
}