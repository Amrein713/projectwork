package hu.masterfield.Tesco;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TescoSteps {


    WebDriver driver;

@BeforeAll
public static void setup (){
    ChromeOptions options = new ChromeOptions();

}


    @Given("I open the TESCO webshop page")
    public void iOpenTheTESCOWebshopPage() {
    }

    @And("I accept cookies")
    public void iAcceptCookies() {
    }

    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
    }

    @And("language is set to {string}")
    public void languageIsSetTo(String language) {
    }

    @When("I change the language to {string}")
    public void iChangeTheLanguageTo(String language) {
    }

    @Then("it shows the main page in {string}")
    public void itShowsTheMainPageIn(String language) {
    }

@AfterAll
    public void cleanup() {
        driver.quit();
    }
}
