package tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import pages.AccountListPage;
import pages.ContactsListPage;
import pages.LoginPage;
import tests.base.TestListener;

import java.nio.charset.MalformedInputException;
import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)

public abstract class BaseTest {
    WebDriver driver;
    LoginPage loginPage;
    AccountListPage accountListPage;
    ContactsListPage contactsListPage;

    @BeforeMethod(description = "Open browser")
    public void setUp(@Optional("chrome") String browser, ITestContext testContext) throws MalformedInputException {
        System.out.println(browser);
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            driver = new ChromeDriver(options);

        } else if (browser.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            EdgeOptions options = new EdgeOptions();
            driver = new EdgeDriver(options);
        }
        testContext.setAttribute("driver", driver);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        accountListPage = new AccountListPage(driver);
        contactsListPage = new ContactsListPage(driver);
    }
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}