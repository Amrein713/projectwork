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
import pages.LoginPage;

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

        driver = new ChromeDriver(options);
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


    @And("language is set to {string}")
    public void languageIsSetTo(String language) {

    }

    @When("I change the language to {string}")
    public void iChangeTheLanguageTo(String language) {
        homePage.changeLangauge();
    }

    @Then("it shows the main page in {string}")
    public void itShowsTheMainPageIn(String language) {
        homePage.checkLanguage(language);
    }


    @AfterAll
    public static void cleanup() {
        driver.quit();
    }


    @Given("I am on the {string} login page")
    public void iAmOnTheLoginPage(String lang) { /* lang=English/Magyar */
        if (lang.equals("Magyar")) {
            driver.get("https://bevasarlas.tesco.hu/groceries/hu-HU");
        }
        if (lang.equals("English")) {
            driver.get("https://bevasarlas.tesco.hu/groceries/en-GB");
        }

        homePage = new HomePage(driver);

    }

    @And("I am not logged in")
    public void iAmNotLoggedIn() {
    }

    @When("I login with a my email {string} and password {string}")
    public void iLoginWithAMyEmailAndPassword( ) {
        String mail= "tesztelek713@freemail.hu"; String pw = "Cucumber1234";
    }

    @Then("I am on the products page")
    public void iAmOnTheProductsPage() {
    }

    @And("I see the basket icon")
    public void iSeeTheBasketIcon() {
    }

    @When("I login with my email {string} and password {string}")
    public void iLoginWithMyEmailAndPassword(String arg0, String arg1) {
    }

    @Then("I see the error message")
    public void iSeeTheErrorMessage() {
    }

    @When("I search for {string}")
    public void iSearchFor(String arg0) {
    }

    @Then("I can see the {string} in the search results")
    public void iCanSeeTheInTheSearchResults(String arg0) {
    }

    @Then("I got an error message")
    public void iGotAnErrorMessage() {
    }
}