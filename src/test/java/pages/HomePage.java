package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;
import java.util.concurrent.locks.Condition;

public class HomePage extends BasePage {


    private String language;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"sticky-bar-cookie-wrapper\"]/span/div/div/div[2]/form[1]/button")
    WebElement acceptCookiesButton;

    // search text field home page
    @FindBy(xpath = "//*[@id=\"search-input\"]")
    WebElement searchField;

    @FindBy(xpath = "//*[@id=\"search-form\"]/button")
    WebElement searchButton;

    @FindBy(xpath = "//*[@id=\"utility-header-language-switch-link\"]")
    WebElement langButton;

    @FindBy(css = "#utility-header-registration-link > span")
    WebElement regButton;

    public void acceptCookies() {
        acceptCookiesButton.click();
    }

    public boolean isLoaded() {
        return isLoaded(acceptCookiesButton)
                && isLoaded(searchField) && isLoaded(searchButton);
    }

    public void validatePage() {
        if (langButton.isDisplayed()) {
            langButton.isEnabled();
        }
    }

    private void setLanguage() {
        if (langButton.getText().equals("Magyar"))
            this.language = "English";
    }


    public void changeLangauge() {
        langButton.click();
    }
}
