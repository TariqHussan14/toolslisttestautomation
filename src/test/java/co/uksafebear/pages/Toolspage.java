package co.uksafebear.pages;

import co.uksafebear.pages.locators.ToolPageLocators;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class Toolspage {

    @NonNull
    WebDriver driver;

    ToolPageLocators locators = new ToolPageLocators();


    public String checkforLoginSuccessfulMessage(){

      return driver.findElement(locators.getSuccessfulLoginMesage()).getText();
    }

}

