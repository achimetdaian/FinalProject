package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddressInformationCompleteAddressTest extends BasePage {
    @Test
    public void AddressInformationCompleteAddress() throws InterruptedException {
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(2) > svg > path")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg > path")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(3) > a.btn.btn-success")).click();
        driver.findElement(By.cssSelector("#first-name")).sendKeys("Achimet");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Daian");
        driver.findElement(By.cssSelector("#address")).sendKeys("daian@yahoo.com");
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > form > div > div:nth-child(2) > button")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > a.btn.btn-success")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.text-center")).getAttribute("innerHTML");
        Assert.assertTrue(element.contains("Thank you for your order!"));
    }
}
