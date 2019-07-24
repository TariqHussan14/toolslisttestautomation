package co.uksafebear.pages;

import co.uksafebear.pages.locators.ToolPageLocators;
import com.sun.istack.internal.NotNull;
import lombok.RequiredArgsConstructor;
import org.openqa.selenium.WebDriver;

@RequiredArgsConstructor
public class Toolspage {

    @NotNull
    WebDriver driver;

    ToolPageLocators locators = new ToolPageLocators();


}
