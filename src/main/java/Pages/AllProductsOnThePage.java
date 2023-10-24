package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AllProductsOnThePage extends BasePage{

    public AllProductsOnThePage(WebDriver driver) { super(driver);}

    By FirstProduct = By.linkText("Awesome Granite Chips");

    public void ClickOnTheFirstProduct() {
        driver.findElement(FirstProduct).click();
    }

    By SecondProduct = By.linkText("Awesome Metal Chair");

    public void ClickOnTheSecondProduct() {
        driver.findElement(SecondProduct).click();
    }

    By ThirdProduct = By.linkText("Awesome Soft Shirt");

    public void ClickOnThirdProduct() { driver.findElement(ThirdProduct).click(); }

    By FourthProduct = By.linkText("Gorgeous Soft Pizza");

    public void ClickOnTheFourthProduct() { driver.findElement(FourthProduct).click(); }

    By FifthProduct = By.linkText("Incredible Concrete Hat");

    public void ClickOnTheFifthProduct() { driver.findElement(FifthProduct).click(); }

    By SixthProduct = By.linkText("Licensed Steel Gloves");

    public void ClickOnTheSixthProduct() { driver.findElement(SixthProduct).click(); }

    By SeventhProduct = By.linkText("Practical Metal Mouse");

    public void ClickOnTheSeventhProduct() { driver.findElement(SeventhProduct).click(); }

    By EighthProduct = By.linkText("Practical Wooden Bacon");

    public void ClickOnTheEighthProduct() { driver.findElement(EighthProduct).click(); }

    By NinthProduct = By.linkText("Practical Wooden Bacon");

    public void ClickOnTheNinthProduct() { driver.findElement(NinthProduct).click(); }

    By TenthProduct = By.linkText("Refined Frozen Mouse");

    public void ClickOnTheTenthProduct() { driver.findElement(TenthProduct).click(); }
}


