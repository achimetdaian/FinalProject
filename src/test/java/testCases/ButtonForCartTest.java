package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonForCartTest extends BasePage {

    @Test
    public void CartButtonTest() throws InterruptedException {

        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg > path")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div.text-center.container")).getAttribute("innerHTML");

        Assert.assertTrue(element.contains("How about adding some products in your cart?"));
    }

}
