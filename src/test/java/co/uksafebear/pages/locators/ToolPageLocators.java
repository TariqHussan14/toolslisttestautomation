package co.uksafebear.pages.locators;

import lombok.Data;
import lombok.NonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@Data
public class ToolPageLocators {

    private By successfulLoginMesage = By.xpath(".//body/div[@class = 'container']/p/b");

}
