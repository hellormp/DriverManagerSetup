package setupDriver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class baseTest extends startDownTest{
    private static String URL = "https://www.bookdepository.com/";

    @Ignore //this getter was created for GET the URL
    public static String getURL() {
        return URL;
    }
    @Test
    public void CheckTheLink(){
        driver.get(URL);
        String getTitle = driver.getTitle();
        if (getTitle == driver.getTitle()){
            System.out.println("ER");
        };
        System.out.println(driver.getTitle());

    }


    @Test
    public void getTitle(){
        String BASE_TITLE = "Book Depository: Free delivery worldwide on over 20 million books";
        String checkBaseTitle = driver.getTitle();
        Assert.assertEquals(BASE_TITLE,checkBaseTitle);

    }

    @Test
    public void LoginButtonIsEnable(){
        WebElement LoginButton = driver.findElement(By.xpath("(//a[@rel='nofollow'])[5]"));
        if (LoginButton.isEnabled()){
            LoginButton.click();
        }
        else {
            LoginButton.getLocation();
            LoginButton.getText();
            LoginButton.getTagName();
        }
    }

    @Ignore
    public void SearchFeild(){
        WebElement SearchFeild = driver.findElement(By.xpath("//input[@class='text-input']"));
        SearchFeild.sendKeys("camileo");
    }

    @Ignore
    public void SearchButton(){
        WebElement SearchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
        SearchButton.click();
    }

    @Ignore
    public void AddToBasket(){
        WebElement AddToBasket = driver.findElement(By.xpath("//a[@data-isbn='9780007419494']"));
        AddToBasket.click();
    }


}
