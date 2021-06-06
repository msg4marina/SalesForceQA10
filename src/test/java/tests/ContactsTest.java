package tests;
import models.Contacts;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
public class ContactsTest extends BaseTest {

    @Test (description = "new contact should be added")
    public void newContactShouldBeAdded() {
        boolean isOpened = loginPage
                .open()
                .isPageOpened();
        assertTrue(isOpened, "Страница логина не открылась");
        isOpened = loginPage
                .login("msg4marina-yjl6@force.com", "1234567Maslova")
                .isPageOpened();
        assertTrue(isOpened, "Home Page не открылась");

        Contacts contacts = new  Contacts("NextTest",  "Pobediteley avenue, 18");

        contactsListPage
                .open()
                .clickNew()
                .create(contacts)
                .openDetailsTab()
                .validateContacts(contacts);
    }
}