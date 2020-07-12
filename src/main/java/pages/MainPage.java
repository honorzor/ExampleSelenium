package pages;

import driver.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {


    public MainPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(css = "#header-lk-button")
    private WebElement loginButton;

    @FindBy(css = ".nl-header-link[ng-tr=\"NLHEA.NLHEA1\"]")
    private WebElement productButton;

    @FindBy(css = ".nl-header-link[ng-tr=\"NLHEA.NLHEA2\"]")
    private WebElement priceButton;

    @FindBy(css = ".nl-header-link[ng-tr=\"NLHEA.NLHEA3\"]")
    private WebElement faqButton;

    @FindBy(css = ".nl-header-link[ng-tr=\"NLHEA.NLHEA4\"]")
    private WebElement wantTestButton;


    @Step(value = "check enable login button")
    public boolean isLoginButton() {
        return loginButton.isEnabled();
    }

    @Step(value = "check enable wantTest button")
    public boolean isWantTestButton() {
        return wantTestButton.isEnabled();
    }

    @Step(value = "check enable faq button")
    public boolean isFaqButton() {
        return faqButton.isEnabled();
    }

    @Step(value = "check enable price button")
    public boolean isPriceButton() {
        return priceButton.isEnabled();
    }

    @Step(value = "check enable product button")
    public boolean isProductButton() {
        return productButton.isEnabled();
    }

    @Step(value = "start driver")
    public void setUp(String url) {
        DriverManager.getDriver().get(url);
    }
}
