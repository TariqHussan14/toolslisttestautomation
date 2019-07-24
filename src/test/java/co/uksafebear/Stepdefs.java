package co.uksafebear;

import co.uksafebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver driver;

    @Before
    public void setup() {

        //get the driver for the browser (e.g ChromeDriver)
        driver = Driver.getDiver();
        // Navigate to the URL of our webpage
        driver.get(Driver.getURl());
    }


     @After
     public void tearDown(){

        //no code!!!!!
         try {
             Thread.sleep(Integer.parseInt(System.getProperty("sleep", "2000")));
         } catch (InterruptedException e) {
             e.printStackTrace();
         }

         driver.quit();
     }


    @Given("I am logged out,")
    public void i_am_logged_out() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("I enter username {string} and Password {string}")
    public void i_enter_username_letmein(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("the user is informed that the login is successful,")
    public void the_user_is_informed_that_the_login_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("I am logged in,")
    public void i_am_logged_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("i delete the name {string}")
    public void i_delete_the_name(String toolname) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("a message appears tool has been romved successfully")
    public void a_message_appears_tool_has_been_romved_successfully() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


}
