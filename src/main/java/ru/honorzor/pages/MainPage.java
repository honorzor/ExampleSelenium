package ru.honorzor.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.honorzor.driver.DriverManager;

public class MainPage {

    private final WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), 10);

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

    //Header's

    @FindBy(css = "[class= \"info-title\"]")
    private WebElement headerWantTest;

    @FindBy(css = "[class= \"aos-init aos-animate\"]")
    private WebElement headerPrice;

    @FindBy(css = "[class= \"nl--bold nl-faq-header\"]")
    private WebElement headerFAQ;

    @FindBy(css = "[class= \"section-start__text-header\"]")
    private WebElement headerProduct;

    @FindBy(css = "[class=\"modal-lk-title\"]")
    private WebElement headerLogin;



    @Step(value = "get actual text from login page")
    public String getActualTextLoginPage() {
        wait.until(ExpectedConditions.visibilityOf(headerLogin));
        return headerLogin.getText();
    }

    @Step(value = "click login button")
    public void clickLoginButton() {
        loginButton.click();
    }

    @Step(value = "get actual text from price page")
    public String getActualTextWantTestPage() {
        wait.until(ExpectedConditions.visibilityOf(headerWantTest));
        return headerWantTest.getText();
    }

    @Step(value = "click wantTest button")
    public void clickWantTestButton() {
        wantTestButton.click();
    }

    @Step(value = "get actual text from price page")
    public String getActualTextFaqPage() {
        wait.until(ExpectedConditions.visibilityOf(headerFAQ));
        return headerFAQ.getText();
    }

    @Step(value = "click faq button")
    public void clickFaqButton() {
        faqButton.click();
    }

    @Step(value = "get actual text from price page")
    public String getActualTextPricePage() {
        wait.until(ExpectedConditions.visibilityOf(headerPrice));
        return headerPrice.getText();
    }

    @Step(value = "click price button")
    public void clickPriceButton() {
        priceButton.click();
    }

    @Step(value = "get actual text from product page")
    public String getActualTextProductPage() {
        wait.until(ExpectedConditions.visibilityOf(headerProduct));
        return headerProduct.getText();
    }

    @Step(value = "click product button")
    public void clickProductButton() {
        productButton.click();
    }

    @Step(value = "start ru.honorzor.pages.driver")
    public void startDriver(String url) {
        DriverManager.getDriver().get(url);
    }

}
