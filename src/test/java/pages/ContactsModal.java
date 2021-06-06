package pages;

import elements.DropDownContacts;
import elements.TextArea;
import models.Contacts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactsModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Contact']");
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");
    public static By MailingStreet = By.id("input-878");

    public ContactsModal(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    //ATLAS //JDI
    public ContactsDetailsPage create(@org.jetbrains.annotations.NotNull Contacts contacts) {
        jse.executeScript("document.getElementById('input-376').click();");
        new DropDownContacts(driver, "Salutation").select("Dr.");
        new TextArea(driver, "Mailing Street").write(contacts.getMailingStreet());
       save();
        return new ContactsDetailsPage(driver);
    }
    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}