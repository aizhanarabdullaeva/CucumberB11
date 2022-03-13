package stepdefinitions.webOrderSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.weborderpages.CreateGroupOrderPage;
import pages.weborderpages.LoginPage;
import pages.weborderpages.OrderPage;
import utils.ConfigReader;
import utils.DriverHelper;

public class OrderStepDefs {
    WebDriver driver = DriverHelper.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    OrderPage orderPage = new OrderPage();
    CreateGroupOrderPage createGroupOrderPage = new CreateGroupOrderPage();
    @Given("the user is on the webOrder homepage")
    public void the_user_is_on_the_web_order_homepage() {
        driver.get(ConfigReader.readProperty("weborderurl"));
        loginPage.login(ConfigReader.readProperty("weborderusername"),ConfigReader.readProperty("weborderpassword"));

    }
    @When("the user selects {string} options")
    public void the_user_selects_options(String deliveryOption) {
       orderPage.getDeliveryOption(deliveryOption);

    }
    @When("the user is on the groupOrderPage")
    public void the_user_is_on_the_group_order_page() {
        orderPage.clickGroupOrder();
        orderPage.clickNextButton();
        Assert.assertTrue(createGroupOrderPage.validationOfUrl(driver));
    }
    @When("the user sends invitation note {string}")
    public void the_user_sends_invitation_note(String invitee) {
        createGroupOrderPage.inviteNoteSendKeys(invitee);

    }
    @When("the user sends invite list {string} and {string}")
    public void the_user_sends_invite_list_and(String invitedPerson1, String invitedPerson2) {
createGroupOrderPage.inviteListSendKeys(invitedPerson1+","+invitedPerson2);

    }
    @Then("the user validates the {string} address")
    public void the_user_validates_the_address(String officeAddress) {
        Assert.assertTrue(createGroupOrderPage.validationOfAddress(officeAddress));
        createGroupOrderPage.clickCreateGroupOrderButton();

    }
    @Then("the user validates {string} text")
    public void the_user_validates_text(String expectedTitleOfPage) throws InterruptedException {
Assert.assertEquals(createGroupOrderPage.validationOfTitle(), expectedTitleOfPage);
    }
    @Then("the user validates total participants is {int}")
    public void the_user_validates_total_participants_is(int expectedNumberOfParticipants) {
Assert.assertEquals(createGroupOrderPage.validationOfNumberOfParticipants(),expectedNumberOfParticipants);
    }

}
