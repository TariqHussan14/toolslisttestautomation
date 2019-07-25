package co.uksafebear;

import co.uksafebear.pages.LoginPage;
import co.uksafebear.pages.Toolspage;
import co.uksafebear.utils.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

public class Stepdefs {

    WebDriver driver;

    LoginPage loginPage;
    Toolspage toolspage;


    @Before
    public void setup() {

        //get the driver for the browser (e.g ChromeDriver)
        driver = Driver.getDiver();


        //add driver
        loginPage = new LoginPage(driver );
        toolspage = new Toolspage(driver );



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
        // this will now be replaced by assert code (this was throw new cucumber.api.pendingexcepetion
        //Assert that were on the login page
        assertEquals("We're not on the Login Page", "Login Page", loginPage.getPageTitle());
    }

    @When("I enter username {string} and Password {string}")
    public void i_enter_username_letmein(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        // remove this throw new cucumber.api.PendingException();
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickloginButton();
    }

    @Then("the user is informed that the login is successful,")
    public void the_user_is_informed_that_the_Login_is_successful() {
        // Write code here that turns the phrase above into concrete actions
        // remove this throw new cucumber.api.PendingException();
        assertThat("Login failed or that Login Successful message didn't appear", toolspage.checkforLoginSuccessfulMessage(), containsString("Login Successful"));
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
