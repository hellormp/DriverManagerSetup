package setupDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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



    }
    /*2.
    Check if the Title
    * */
    @Test(priority = 2)
    public void getTitle(){
        System.out.println(driver.getTitle());
    }
    /*3.Find elements and click on them
    *
    * */
    @Test(priority = 3)
    public void findElements(){
        WebElement SearchFeild = driver.findElement(By.xpath("//input[@class='text-input']"));
        SearchFeild.sendKeys("camileo");
        WebElement SearchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
        SearchButton.click();
        WebElement AddToBasket = driver.findElement(By.xpath("//a[@data-isbn='9780007419494']"));
        AddToBasket.click();
    }
}
