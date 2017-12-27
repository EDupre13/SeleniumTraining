package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public void changePassword() {
        driver.findElement(By.xpath("/html/body/form/div[3]/div[2]/div/div[2]/ul/li[1]/a")).click();
    }

    public String getConfirmationMessage() {
        return driver.findElement(By.id("conf_message")).getText();
    }
}
