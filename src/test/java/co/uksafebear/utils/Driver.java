package co.uksafebear.utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

    private static final String URl = System.getProperty("url","http:toolslist.safebear.co.uk:8080");

    private static final String BROWSER = System.getProperty("browser",  "chrome");

    public static String getURl() {

        return URl;

    }

    public static WebDriver getDiver() {

        switch (BROWSER){

            case "chrome":

                System.out.println("Executing on Chrome");
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();



            case "firefox":

                System.out.println("Executing on FIREFOX");
                WebDriverManager.firefoxdriver().setup();

                return new FirefoxDriver();

            default:
                throw new IllegalArgumentException("The Browser Type is undefined");


        }

    }

}