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
        Account account = new Account("Test", "+375293350019", "tut.by");

        accountListPage
                .open()
                .clickNew()
                .create(account)
                .openDetailsTab()
                .validateAccount(account);
    }
}