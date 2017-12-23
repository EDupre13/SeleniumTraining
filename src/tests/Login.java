package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class Login {
    WebDriver driver;

    @Test
    public void loginTestPOM() {
        // 1. Initialize driver
        driver = util.DriverFactory.open("chrome",
                "http://sdettraining.com/trguitransactions/AccountManagement.aspx");

        // 2. Enter login information (login page)
        LoginPage loginPage = new LoginPage(driver);

        // 3. Get confirmation (dashboard page)

        // 4. Close driver
        //driver.close();
    }
}
