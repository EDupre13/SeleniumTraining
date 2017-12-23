package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    public static WebDriver open(String browserType) {
        String btLowerCase = browserType.toLowerCase();

        switch (btLowerCase) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver",
                        "/Users/edupre/Desktop/SeleniumCourse/Software/geckodriver");
                return new FirefoxDriver();
            default:
                System.setProperty("webdriver.chrome.driver",
                        "/Users/edupre/Desktop/SeleniumCourse/Software/chromedriver");
                return new ChromeDriver();
        }
    }

    public static WebDriver open(String browserType, String url) {
        WebDriver driver;

        String btLowerCase = browserType.toLowerCase();

        switch (btLowerCase) {
            case "firefox":
                System.setProperty("webdriver.gecko.driver",
                        "/Users/edupre/Desktop/SeleniumCourse/Software/geckodriver");
                driver = new FirefoxDriver();
                driver.get(url);
                break;
            default:
                System.setProperty("webdriver.chrome.driver",
                        "/Users/edupre/Desktop/SeleniumCourse/Software/chromedriver");
                driver = new ChromeDriver();
                driver.get(url);
        }

        return driver;
    }
}
