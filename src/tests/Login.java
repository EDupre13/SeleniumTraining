package tests;

import adapters.LoginPageAdapter;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class Login {
    WebDriver driver;

    String userName = "tim@testemail.com";
    String password = "trpass";

    @Test
    public void loginTestPOM() {
        // 1. Initialize driver
        driver = util.DriverFactory.open("chrome",
                "http://sdettraining.com/trguitransactions/AccountManagement.aspx");

        // 2. Enter login information (login page)
        LoginPageAdapter loginPageAdapter = new LoginPageAdapter(driver);
        loginPageAdapter.setUserName(userName)
                .setPassword(password)
                .clickSubmit()
                .changePassword()
                .getConfirmationMessage()
                .printConfirmationMessage();

        // 3. Get confirmation (dashboard page)

        // 4. Close driver
        //driver.close();
    }
}
