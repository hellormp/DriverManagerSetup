package setupDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class firstTest extends startDownTest{
    private static final String URL = "https://www.bookdepository.com/";

    /*1.
    Check if the user can open the link, after navigation to link > compare the Title(url) with ER
    *
    * */
    @Test(priority = 1)
    public void CheckTheLink(){
        driver.get(URL);
        String getTitle = driver.getTitle();
        if (getTitle == driver.getTitle()){
            System.out.println("ER");
        };
        SearchFeild();
        SearchButton();
        AddToBasket();

    }
    /*2.
    Check if the Title
    * */
    @Test(priority = 2)
    public void getTitle(){
        System.out.println(driver.getTitle());
    }

    /*4.Check if the button isEnable, can be clickable.
     *
     * */
    @Test(priority = 3)
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
    /*3.Check if the elements can be found, the
     *
     * */
    @Ignore
    public void findElements(){
        SearchFeild();
        SearchButton();
        AddToBasket();

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
