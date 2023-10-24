package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TryToLoginUserAndLogoutBugTest extends BasePage {
    @Test
    public void TryToLoginAndLogoutUserBug() throws InterruptedException {
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg")).click();
        driver.findElement(By.id("user-name")).sendKeys("dino");
        driver.findElement(By.id("password")).sendKeys("choochoo");
        driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > button")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > button > svg > path")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(3) > nav > div > div > div:nth-child(2) > button > svg")).getAttribute("innerHTML");
        Assert.assertFalse(element.contains("Demo Shop | build date 2021-05-21 14:04:30 GTBDT"));
    }
}
