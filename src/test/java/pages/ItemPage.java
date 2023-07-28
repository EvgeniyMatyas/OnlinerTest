package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemPage extends BasePage{

    String tvLocator = "//a[@class='js-product-title-link']";

    public ItemPage(WebDriver driver) {
        super(driver);
    }


    public void getTextFromListTV(){
        List<WebElement> list=(driver.findElements((By.xpath(tvLocator))));
        list.get(0).getText();
    }
    public void clickFirstFromListTV(){
        List<WebElement> list = (driver.findElements(By.xpath(tvLocator)));
        list.get(0).click();
    }

    @Override
    public boolean isPageOpen() {
        return false;
    }

}
