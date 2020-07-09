package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.AuthorizationPage;

public class SettingsForDriver {

    public WebDriver driver;
    public WebDriverWait webDriverWait;
    public AuthorizationPage authorizationPage;

    @BeforeClass
    public void signUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ioann\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        webDriverWait = new WebDriverWait(driver, 10);
        authorizationPage = PageFactory.initElements(driver,AuthorizationPage.class);
    }

    @AfterClass
    public void closeSession() {
        driver.quit();
    }
}
