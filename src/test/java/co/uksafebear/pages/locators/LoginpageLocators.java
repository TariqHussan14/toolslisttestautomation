package co.uksafebear.pages.locators;


import lombok.Data;
import org.openqa.selenium.By;

@Data
public class LoginpageLocators {
    //fields

    private By usernameLocator = By.id("username");
    private By passwordLocator = By.id("password");
    //buttons

    private By loginButtonLocator = By.id("enter");
    //messages

    private By failedLogininMessage = By.xpath(".//p[@id='rejectLogin']/b");

}
