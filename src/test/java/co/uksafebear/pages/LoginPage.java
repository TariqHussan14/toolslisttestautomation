package co.uksafebear.pages;

import co.uksafebear.pages.locators.LoginpageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

import java.security.PublicKey;

@RequiredArgsConstructor
public class LoginPage {


    @NonNull
    WebDriver driver;

    LoginpageLocators locators = new LoginpageLocators();

    public String getPageTitle(){

        return driver.getTitle();

    }

    public void enterUsername(String username){

        driver.findElement(locators.getUsernameLocator()).sendKeys(username);

    }

    public void enterPassword(String password){

        driver.findElement(locators.getPasswordLocator()).sendKeys();
    }

    public void clickloginButton(){

        driver.findElement(locators.getLoginButtonLocator()).click();

    }

    public String checkForFailedLoginWarning(){

        return driver.findElement(locators.getFailedLogininMessage()).getText();
    }
}
