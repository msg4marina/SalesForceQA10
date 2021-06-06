package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownContacts {
    WebDriver driver;
    String label;
    String locator = "//*[contains(@class,'modal-body')]//div[text()='%s']" +
            "/ancestor::div[contains(@class, 'slds-combobox_container')]//input";
    public DropDownContacts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }
    public void select(String option) {
        driver.findElement(By.xpath(String.format(locator, label))).click();
    }
}