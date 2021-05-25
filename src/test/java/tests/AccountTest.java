package tests;
import models.Account;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class AccountTest extends BaseTest {

    @Test
    public void accountShouldBeCreated() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        isOpened = loginPage
                .login("legal.verdegrano-nhse@force.com", "2Password")
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");

        //FACTORY
        //BUILDER
        //RANDOM DATA
        Account account = new Account("NextTest", "+3758778676", "tut.by", "beginner",
                "Masherova str.29", "Pobediteley avenue, 18");

        accountListPage
                .open()
                .clickNew()
                .create(account)
                .openDetailsTab()
                .validateAccount(account);
    }
}