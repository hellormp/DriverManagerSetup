package bestsellersPage.stepDeff;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import setupDriver.LoginFlow;

public class BestsellersPage extends LoginFlow {

    private String TITLE = "smonedal";

    public String getTITLE() {
        return driver.getTitle();
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }


    @Test
    public void BestsellersPage(){
        driver.get("https://www.bookdepository.com/");
        driver.findElement(By.xpath("(//a[text()='Bestsellers'])[1]")).click();
        Select priceRange = new Select(driver.findElement(By.xpath("//select[@id='filterPrice']")));
        priceRange.selectByVisibleText("Under €15");

        Assert.assertEquals("Under €15",driver.findElement(By.xpath("//option[@value='low']")));

    }
    @Test
    public void BeastsellersPage(){
        driver.get("https://www.bookdepository.com/");
        driver.findElement(By.xpath("(//a[text()='Bestsellers'])[1]")).click();
        Select priceRange = new Select(driver.findElement(By.xpath("//select[@id='filterPrice']")));
        priceRange.selectByIndex(1);
        Assert.assertEquals("Under €15",driver.findElement(By.xpath("//option[@value='low']")));
    }
    @Test
    public void BestsellersdPage(){
        driver.get("https://www.bookdepository.com/");
        driver.findElement(By.xpath("(//a[text()='Bestsellers'])[1]")).click();
        Select priceRange = new Select(driver.findElement(By.xpath("//select[@id='filterPrice']")));
        priceRange.selectByValue("low");
        Assert.assertEquals("Under €15",driver.findElement(By.xpath("//option[@value='low']")));
    }

}
