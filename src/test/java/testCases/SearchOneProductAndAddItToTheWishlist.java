package testCases;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchOneProductAndAddItToTheWishlist extends BasePage {

    @Test
    public void SearchOneProductAndAddItToThoWishlist() throws InterruptedException {
        driver.findElement(By.id("input-search")).sendKeys("Awesome Metal Chair");
        driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div[1]/form/div[1]/button")).click();
        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > svg > path")).click();

        WebElement Element = driver.findElement(By.linkText("Awesome Metal Chair"));
        String actualResultText = Element.getText();
        String expectedElement = "Awesome Metal Chair";

        Assert.assertEquals(actualResultText, expectedElement, "Ceva nu a mers!");

//        String element;
//        element = driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > svg")).getAttribute("innerHTML");
//
//        Assert.assertTrue(element.contains("Awesome Metal Chair"));
    }
}
