package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputContacts {
    public Object JavascriptExecutor;
    WebDriver driver;
    String label;
    String inputLocator2 = "//*[contains(@class,'modal-body')]//label[text()='%s']/following::div[contains(@class, 'slds-input')]//input";

    public InputContacts(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text) {
        System.out.println(String.format("Writing text '%s' into input with label %s", text, label));
        //driver.findElement(By.xpath(String.format(inputLocator, label))).sendKeys(text);
        driver.findElement(By.xpath(String.format(inputLocator2, label))).sendKeys(text);

    }

}
