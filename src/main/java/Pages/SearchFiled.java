package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchFiled extends BasePage{
    public SearchFiled(WebDriver driver) {super(driver);}

    By SearchField = By.id("input-search");

    public void ClickOnTheSearchField() {
        driver.findElement(SearchField).click();
    }

    By SearchButton = By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[1]/button");

    public void ClickOnTheSearchButton() {
        driver.findElement(SearchButton).click();
    }
}
