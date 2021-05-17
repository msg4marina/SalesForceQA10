package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        isOpened = loginPage
                .login("msg4marina-kbe6@force.com", "1marinamaslova")
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");
    }
}