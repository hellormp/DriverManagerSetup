package bestsellersPage.stepDeff;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import setupDriver.LoginFlow;

public class ActionsActionTests extends LoginFlow {

    @Test
    void writeInSerchField() {
        driver.get("https://www.bookdepository.com/");
        WebElement searchField = driver.findElement(By.xpath("//input[@aria-label='Search for books by keyword / title / author / ISBN']"));

        Actions builder = new Actions(driver);

        Action searchSend = builder
                .moveToElement(searchField)
                .keyDown(searchField, Keys.SHIFT)
                .sendKeys(searchField, "hello")
                .build();
        searchSend.perform();

        WebElement searshButton = driver.findElement(By.xpath("//button[@class='header-search-btn']"));
        searshButton.click();
        System.out.println(driver.getTitle());

    }

    @Test
    void hoverLanguageButton() {
        driver.get("https://www.bookdepository.com/");
        WebElement changeLanguageButton = driver.findElement(By.xpath("//div[@class='right-section']//div//div[@class='tbd-dropdown mob-nav-shop desktop-only dropdown']"));
        Actions hover = new Actions(driver);

        Action changeLanguageButtonHover = hover
                .moveToElement(changeLanguageButton)
                .build();
        changeLanguageButtonHover.perform();
    }

    @Test
    void changeLanguage() {
        driver.get("https://www.bookdepository.com/");
        WebElement changeLanguageButton = driver.findElement(By.xpath("//div[@class='right-section']//div" +
                "//div[@class='tbd-dropdown mob-nav-shop desktop-only dropdown']"));
        Actions he = new Actions(driver);
        he
                .moveToElement(changeLanguageButton)
                .build();
        he.perform();

//дописать

    }
}


