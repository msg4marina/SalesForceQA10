package tests;
import io.qameta.allure.Step;
import org.testng.annotations.Test;
import tests.base.Retry;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Step ("Open Salesforce site and create new login")
    @Test (retryAnalyzer = Retry.class, description = "login")
    public void login() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        isOpened = loginPage
                .login("msg4marina-yjl6@force.com", "1234567Maslova")
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");
    }


}