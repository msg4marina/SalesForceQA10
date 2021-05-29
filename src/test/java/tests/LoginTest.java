package tests;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test (retryAnalyzer = Retry.class)
    public void login() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        isOpened = loginPage
                .login("legal.verdegrano-nhse@force.com", "2Password")
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");
    }


}