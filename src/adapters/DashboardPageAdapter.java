package adapters;

import org.openqa.selenium.WebDriver;
import pages.DashboardPage;

public class DashboardPageAdapter {

    private DashboardPage dashboardPage;

    private String confirmationMessage;

    public DashboardPageAdapter(WebDriver driver) {
        this.dashboardPage = new DashboardPage(driver);
    }

    public DashboardPageAdapter changePassword() {
        dashboardPage.changePassword();
        return this;
    }

    public DashboardPageAdapter getConfirmationMessage() {
        confirmationMessage = dashboardPage.getConfirmationMessage();
        return this;
    }

    public DashboardPageAdapter printConfirmationMessage() {
        System.out.println(confirmationMessage);
        return this;
    }
}
