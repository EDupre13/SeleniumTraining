package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSubmit() {
        driver.findElement(By.id("MainContent_btnLogin")).click();
    }

    public void setPassword(String password) {
        driver.findElement(By.id("MainContent_txtPassword")).sendKeys(password);
    }

    public void setUserName(String userName) {
        driver.findElement(By.id("MainContent_txtUserName")).sendKeys(userName);
    }

    public WebDriver getDriver() {
        return driver;
    }
}
