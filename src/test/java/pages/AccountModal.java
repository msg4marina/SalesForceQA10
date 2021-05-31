package pages;

import elements.DropDown;
import elements.Input;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModal extends BasePage {
    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Account']");
    public static final By SAVE_BUTTON = By.cssSelector("[title=Save]");
    //добавить локатор на текстовое поле дискрипшн



    public static final By DESCRIPTION = By.xpath("//textarea[contains(text(),'32000')]");




    //добавить локатор на текстовое поле BillingStreet
    public static final By BILLINGSTREET = By.xpath("//div[text()='Billing Street']");
    //добавить локатор на текстовое поле ShippingStreet
    public static final By SHIPPINGSTREET = By.xpath("//div[text()'Shipping Street']");


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
        new DropDown(driver, "Type").select("Other");
        new DropDown(driver, "Industry").select("Other");
        new Input(driver, "Description").write(account.getDescription());
        new Input(driver, "BillingStreet").write(account.getBillingStreet());
        new Input(driver, "ShippingStreet").write(account.getBillingStreet());

        save();
        return new AccountDetailsPage(driver);
    }

    public void save() {
        driver.findElement(SAVE_BUTTON).click();
    }
}