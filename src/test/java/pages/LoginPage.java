package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id='email']")
    WebElement email;

    @FindBy(xpath = "//*[@id='password']")
    WebElement password;

    @FindBy(xpath = "//*[@id='signin-button']")
    WebElement signinButton;

    public LoginPage() {
        super(driver);
    }

    public HomePage login(String mail, String pw) {
        email.sendKeys(mail);
        password.sendKeys(pw);
        signinButton.click();
        return new HomePage(driver);
    }
}
