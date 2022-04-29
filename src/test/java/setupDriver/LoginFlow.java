package setupDriver;


import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;


public class LoginFlow extends firstTest {

    @Test
    public void LoginWithCorrectCredentials(){
        driver.get(getURL());
        LoginButtonIsEnable();

        WebElement signInJoinButton = driver.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
        signInJoinButton.click();

}
    @Test
    public void ForgotPasswordFlow(){
        LoginWithCorrectCredentials();
        String TITLE = "Book Depository Password Assistance";
        WebElement forgotPassword = driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']"));

    }
    @Test
    public void Join(){
        driver.get(getURL());
        WebElement signInJoinButton = driver.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
        signInJoinButton.click();


        WebElement nameInput = driver.findElement(By.id("ap_customer_name"));
        nameInput.sendKeys("Yarik");

        WebElement yourEmailAddressInput = driver.findElement(By.xpath("//input[@placeholder='Your email address']"));
        yourEmailAddressInput.sendKeys("petopetopalkin@gmail.com");

        WebElement createPassword = driver.findElement(By.xpath("//input[@aria-label='Create a password']"));
        createPassword.sendKeys("GJnP0DNO");

        WebElement createYourAccountButton = driver.findElement(By.xpath("//input[@id='continue']"));
        createYourAccountButton.click();

    }
    @Test
    public void CheckSuccsesfullLogin(){
        Join();
        WebElement webElement = driver.findElement(By.xpath("//strong[normalize-space()='Thank you for registering']"));
        webElement.isEnabled();
    }

    @Test(description = "DONE")
    public void LearnMore()  {
        LoginWithCorrectCredentials();
        FindlearnMoreButton();
        Assert.assertEquals("Book Depository: Free delivery worldwide on over 20 million books",driver.getTitle());

    }
    public void FindlearnMoreButton()  {
        WebElement FindLearnMoreButton = driver.findElement(By.xpath("//a[text()='Learn more']"));
            FindLearnMoreButton.isEnabled();
            FindLearnMoreButton.click();
            Screenshot screenshot = new AShot().takeScreenshot(driver);
            try {
                ImageIO.write(screenshot.getImage(), "jpg", new File("c:\\ElementScreenshot.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

        public void dasd(){
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setBrowserName("Chrome");
            desiredCapabilities.setVersion("dads");
            driver = new EdgeDriver(desiredCapabilities);

        }
    }


