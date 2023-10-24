package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TryToLoginUserWrongUsernameAndPasswordTest extends BasePage {
    @Test
    public void TryToLoginWithWrongUserAndPass() throws InterruptedException{
    driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg")).click();
        driver.findElement(By.id("user-name")).sendKeys("ddino");
        driver.findElement(By.id("password")).sendKeys("cchoochoo");
        driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > button")).click();

    String element;
    element = driver.findElement(By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > p")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("Incorrect username or password!"));
    }
}
