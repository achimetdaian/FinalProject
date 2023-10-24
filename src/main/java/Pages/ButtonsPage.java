package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ButtonsPage extends BasePage {

    public ButtonsPage(WebDriver driver) {
        super(driver);
    }

    By LoginButton = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > span > span > button > svg");

    public void ClickOnLoginPage() {
        driver.findElement(LoginButton).click();
    }

    By WishlistButtons = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(2) > svg > path");
    public void ClickOnWishlistButton() {
        driver.findElement(WishlistButtons).click();
    }

    By CartButton = By.cssSelector("#responsive-navbar-nav > div:nth-child(2) > span > a:nth-child(1) > svg > path");
    public void ClickOnCartButton() {
        driver.findElement(CartButton).click();
    }

    By LogoButton = By.cssSelector("#root > div > div:nth-child(1) > nav > a > svg > path");
    public void ClickOnLogoButton() {
        driver.findElement(LogoButton).click();
    }

    By HelpButton = By.cssSelector("#root > div > div:nth-child(3) > nav > div > div > div:nth-child(1) > button > svg > path");
    public void ClickOnHelpButton() {
        driver.findElement(HelpButton).click();
    }

    By ResetButton = By.cssSelector("#root > div > div:nth-child(3) > nav > div > div > div:nth-child(2) > button > svg");
    public void ClickOnResetButton() {
        driver.findElement(ResetButton).click();
    }

}
