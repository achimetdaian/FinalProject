package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginLocatorsPage extends BasePage{
    public LoginLocatorsPage(WebDriver driver) {
        super(driver);
    }
    By InputUserName = By.id("user-name");

    public void ClickOnInputUsername() {
        driver.findElement(InputUserName).click();
    }

    By InputPassword = By.id("password");

    public void ClickOnInputPassword() {
        driver.findElement(InputPassword).click();
    }

    By ButtonLogin = By.cssSelector("body > div.fade.modal.show > div > div > div.login_wrapper > div > form > button");

    public void ClickOnLoginButton() {
        driver.findElement(ButtonLogin).click();
    }
}
