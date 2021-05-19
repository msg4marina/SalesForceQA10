package pages;

import elements.DropDown;
import elements.Input;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Account']");
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");

    public AccountModal(WebDriver driver) {
        super(driver);
    }

    public boolean isPageOpened() {
        return isExist(MODAL_TITLE);
    }

    //ATLAS //JDI
    public AccountDetailsPage create(Account account) {
        new Input(driver, "Account Name").write(account.getAccountName());
        new Input(driver, "Phone").write(account.getPhone());
        new Input(driver, "Website").write(account.getWebsite());
        new DropDown(driver, "Type").select("Analyst");
        new DropDown(driver, "Industry").select("Banking");
        //
/*        new Input(driver, "Employees").write(phone);
        new Input(driver, "Billing City").write(phone);
        new Input(driver, "Billing State/Province").write(phone);
        new Input(driver, "Billing Zip/Postal Code").write(phone);
        new Input(driver, "Billing Country").write(phone);
        new Input(driver, "Shipping City").write(phone);
        new Input(driver, "Shipping State/Province").write(phone);
        new Input(driver, "Shipping Zip/Postal Code").write(phone);
        new Input(driver, "Shipping Country").write(phone);*/
        save();
        return new AccountDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}