package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TVPage extends BasePage{
    String tvNameLocator = "//h1[@class='catalog-masthead__title js-nav-header']";
    public TVPage(WebDriver driver) {
        super(driver);
    }
    public void getTVName() {
        driver.findElement(By.xpath(tvNameLocator)).getText();


    }

    @Override
    public boolean isPageOpen() {
        return false;
    }}
