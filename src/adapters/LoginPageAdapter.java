package adapters;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;

public class LoginPageAdapter {

    private LoginPage loginPage;

    public LoginPageAdapter(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
    }

    public DashboardPageAdapter clickSubmit() {
        loginPage.clickSubmit();
        return new DashboardPageAdapter(loginPage.getDriver());
    }

    public LoginPageAdapter setPassword(String password) {
        loginPage.setPassword(password);
        return this;
    }

    public LoginPageAdapter setUserName(String userName) {
        loginPage.setUserName(userName);
        return this;
    }
}
