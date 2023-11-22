package hu.masterfield.Tesco;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;

import java.awt.*;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TescoSteps {


    protected static WebDriver driver;

    protected static WebDriverWait wait;
    private WebElement acceptCookiesButton;
    private HomePage homePage;

    @BeforeAll
    public static void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");

        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.manage().window().setSize(new Dimension(900, 900));

    }


    @Given("I open the TESCO webshop page")
    public void iOpenTheTESCOWebshopPage() {
        driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU");
        HomePage homePage = new HomePage(driver);
        homePage.isLoaded();
    }

    @And("I accept cookies")
    public void iAcceptCookies() {
        homePage.acceptCookies();
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        homePage.validatePage();
    }


    @And("language is set to {'Magyar'}")
    public void languageIsSetTo(String language) {
        
    }

    @When("I change the language to {'English'}")
    public void iChangeTheLanguageTo(String language) {
        homePage.changeLangauge();


    }

    @Then("it shows the main page in {'English'}")
    public void itShowsTheMainPageIn(String language) {
        Label langButton = new Label();
        if (langButton.getText().equals("Magyar")) {
            assertEquals("English", langButton.getText());
            Label regButton = new Label();
            assertEquals("Regisztráció", regButton.getText());
        }
    }


    @AfterAll
    public void cleanup() {
        driver.quit();
    }
}
