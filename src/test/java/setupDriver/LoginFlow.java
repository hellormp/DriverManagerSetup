package setupDriver;


import org.openqa.selenium.*;
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
        WebElement forgotPassword = driver.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']"));
        //a[@id='auth-fpp-link-bottom']




        return;
    }
    @Test
    public void Join(){
        driver.get(getURL());
        WebElement signInJoinButton = driver.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
        signInJoinButton.click();

        getWait(10);

        WebElement nameInput = driver.findElement(By.xpath("//form[@id='ap_register_form']/div/input"));
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


    }


