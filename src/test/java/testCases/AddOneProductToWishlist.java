package testCases;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddOneProductToWishlist extends BasePage {

    @Test
    public void AddFirstProductToWishlist() throws InterruptedException {

        driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div:nth-child(1) > div > div.text-muted.text-center.card-footer > button:nth-child(3) > svg > path")).click();
        driver.findElement(By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > svg > path")).click();

        String element;
        element = driver.findElement(By.cssSelector("#root > div > div:nth-child(2) > div:nth-child(2) > div.row.row-cols-xl-4.row-cols-lg-3.row-cols-md-2.row-cols-sm-2.row-cols-1 > div > div > div.text-center.card-body > a")).getAttribute("innerHTML");
        System.out.println(element);
        Assert.assertTrue(element.contains("Awesome Granite Chips"));
    }
}