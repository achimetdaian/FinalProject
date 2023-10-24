package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonForLogoTest extends BasePage {
    @Test
    public void ClickOnTheLogoButton() throws InterruptedException {
        driver.findElement(By.cssSelector("#root > div > div:nth-child(1) > nav > a > svg > path")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(1) > div > div > div > h1 > small")).getAttribute("innerHTML");

        Assert.assertTrue(element.contains("Products"));
    }
}
