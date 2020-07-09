package pages;

import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AuthorizationPage {

    @FindBy(css = "#header-lk-button")
    private WebElement loginButton; // Кнопка открытия окошка "Вход/Регистрация"

    @FindBy(css = "#login")
    private WebElement loginFiled; // Поле для ввода почты

    @FindBy(css = "[type=password]")
    private WebElement passwordField; // Поле для ввода пароля

    @FindBy(css = "#form_auth button")
    private WebElement submitButton; // Кнопка "Вход"

    @FindBy(xpath = "//*[@id=\"top\"]/div[2]/div/div[2]/div[1]/div[1]/span")
    private WebElement buttonCreateTest; //Элемент , который даёт понять нам что мы перешли на страницу профиля

    @Story(value = "Test with correct credentials")
    public void authClient(String email, String password) {
        clickLoginButton();
        fillLoginField(email);
        fillPasswordField(password);
        clickSubmitButton();
    }

    @Step(value = "Check locator")
    public boolean isElementAfterAuth() {
        return buttonCreateTest.isDisplayed();
    }

    @Step(value = "click button submit")
    private void clickSubmitButton() {
        submitButton.click();
    }

    @Step(value = "fill password {0}")

    private void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    @Step(value = "fill email {0}")
    private void fillLoginField(String email) {
        loginFiled.sendKeys(email);
    }

    @Step(value = "open window for registration or login")
    private void clickLoginButton() {
        loginButton.click();
    }
}
