package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public static final By TV_TITTLE =By.xpath("//h1[text()='Телевизоры']");
    String spanLocator = "//div[@class ='project-navigation__flex']//span[text() = '%s']";

    @Override
    public boolean isPageOpen() {
        return isExist(TV_TITTLE);

}
    public MainPage open(){
        driver.get(BASE_URL);
        return this;
}
public MainPage clickOnTheButton(String text) {
    driver.findElement(By.xpath(String.format(spanLocator,text))).click();
    return new MainPage(driver);
}

}
