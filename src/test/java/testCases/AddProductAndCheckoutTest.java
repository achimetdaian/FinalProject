package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductAndCheckoutTest extends BasePage {
    @Test
    public void AddProductAndCheckout() throws InterruptedException {
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg > path")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > a.btn.btn-success")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div > div > div > div > h1 > small")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("Your information"));
    }
}
