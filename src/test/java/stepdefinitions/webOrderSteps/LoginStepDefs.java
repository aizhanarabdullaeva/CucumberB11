package stepdefinitions.webOrderSteps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;
import utils.DriverHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderpages.LoginPage;

public class LoginStepDefs {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);

    @Given("user navigates to the weborder page")
    public void user_navigates_to_the_weborder_page() {
       //driver.navigate().to(ConfigReader);
       driver.navigate().to(ConfigReader.readProperty("weborderurl"));
    }
    @When("user provides credentials")
    public void user_provides_credentials() {
loginPage.login(ConfigReader.readProperty("weborderusername"),ConfigReader.readProperty("weborderpassword"));
    }
    @Then("the user is on the home page")
    public void the_user_is_on_the_home_page() {
        Assert.assertEquals(driver.getTitle().trim(), "ORDER DETAILS - Weborder");
    }

    @When("user provides correct username and wrong password")
    public void user_provides_correct_username_and_wrong_password() {
        loginPage.login(ConfigReader.readProperty("weborderusername"), "wrongpassword");
    }
    @Then("user validates the {string} error message")
    public void user_validates_the_error_message(String expectedMessage) {
Assert.assertTrue(loginPage.validateErrorMessage(expectedMessage));
    }

    @When("user provides wrong {string} and {string}")
    public void user_provides_wrong_and(String wrongUsername, String wrongPassword) {
        loginPage.login(wrongUsername,wrongPassword);

    }
    @When("user provides empty username and password")
    public void user_provides_empty_username_and_password() {
       loginPage.login("","");
    }

}
