package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TryToLoginUserAndLogoutTest extends BasePage {
    @Test
    public void TryToLoginAndLogoutUser() throws InterruptedException {
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg")).click();
        driver.findElement(By.id("user-name")).sendKeys("dino");
        driver.findElement(By.id("password")).sendKeys("choochoo");
        driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > button")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > button > svg > path")).click();

        String element;
        element = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("Hello guest!"));
    }
}
