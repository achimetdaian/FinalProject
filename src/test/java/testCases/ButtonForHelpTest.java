package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonForHelpTest extends BasePage {
    @Test
    public void ClickOnTheLogoButton() throws InterruptedException {
        driver.findElement(By.cssSelector("#root > div > div:nth-child(3) > nav > div > div > div:nth-child(1) > button > svg > path")).click();

        String element;
        element = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.modal-header > div > small")).getAttribute("innerHTML");

        Assert.assertTrue(element.contains("Help"));
    }
}
