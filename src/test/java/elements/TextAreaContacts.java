package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextAreaContacts {
    WebDriver driver;
    String label;
    String textAreaLocator = "//*[contains(@class,'actionBody')]//div[text()='%s']/ancestor::div" +
            "[contains(@class, 'slds-textarea')]//textarea";

    public TextAreaContacts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.println(String.format("Writing text '%s' into input with label %s", text, label));
        driver.findElement(By.xpath(String.format(textAreaLocator, label))).sendKeys(text);
    }
}