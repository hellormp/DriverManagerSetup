package ChromeDriverSetup;

import org.junit.Ignore;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.jupiter.api.TestMethodOrder;
import io.github.bonigarcia.wdm.WebDriverManager;

class ChromeTest {


    WebDriver driver;

    @BeforeAll
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void setupTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterEach
    public void driverDown() {
        driver.quit();
    }
    @Ignore

    @Order(1)
    @Test
    public void openDriver() {

        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String title = driver.getTitle();
        System.out.println(title);

    }
    @Order(2)
    @Test
    public void findSmth (){
        driver.getCurrentUrl();

    }


}