package bestsellersPage.stepDeff;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import setupDriver.LoginFlow;

public class BestsellersPage extends LoginFlow {


    @Test(description = "DONE")
    public void priceRangeSelector(){
        driver.get("https://www.bookdepository.com/");
        driver.findElement(By.xpath("(//a[text()='Bestsellers'])[1]")).click();
        Select priceRange = new Select(driver.findElement(By.xpath("//select[@id='filterPrice']")));
        priceRange.selectByVisibleText("Under €15");
        Assert.assertEquals(true,priceRange.isMultiple());

    }
    @Test(description = "DONE")
    public void availabilitySelector(){
        driver.get("https://www.bookdepository.com/");
        driver.findElement(By.xpath("(//a[text()='Bestsellers'])[1]")).click();
        Select availability = new Select(driver.findElement(By.xpath("//select[@id='filterAvailability']")));
        availability.selectByIndex(1); //In stock (68290)

        //Assert.assertEquals("Under €15",driver.findElement(By.xpath("//option[@value='low']")));
    }
    @Test(description = "DONE")
    public void languageSelector(){
        driver.get("https://www.bookdepository.com/");
        driver.findElement(By.xpath("(//a[text()='Bestsellers'])[1]")).click();
        Select language = new Select(driver.findElement(By.xpath("//select[@id='filterLang']")));
        language.selectByValue("454"); //Ukrainian(18)

        //Assert.assertEquals("Under €15",driver.findElement(By.xpath("//option[@value='low']")));
    }
    @Test(description = "DONE")
    public void format(){
        driver.get("https://www.bookdepository.com/");
        driver.findElement(By.xpath("(//a[text()='Bestsellers'])[1]")).click();
        Select format = new Select(driver.findElement(By.xpath("//select[@id='filterFormat']")));
        format.selectByVisibleText("Audio");//Audio
        //Assert.assertEquals("Under €15",driver.findElement(By.xpath("//option[@value='low']")));
    }

}
