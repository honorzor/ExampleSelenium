package pages;

import driver.DriverManager;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthorizationPage {

    public AuthorizationPage() {
        PageFactory.initElements(DriverManager.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"header-lk-button\"]")
    private WebElement openWindowAuth; // Кнопка открытия окошка "Вход/Регистрация"

    @FindBy(xpath = "//*[@id=\"login\"]")
    private WebElement fieldEmail; // Поле для ввода почты клиента.

    @FindBy(xpath = "//*[@id=\"form_auth\"]/input[2]")
    private WebElement fieldPassword; // Поле для ввода пароля клиента.

    @FindBy(xpath = "//*[@id=\"form_auth\"]/button")
    private WebElement enterButton; // Кнопка "Войти" в профиль клиента.

    @FindBy(xpath = "//*[@id=\"logout\"]")
    private WebElement logoutButton; // Кнопка "Выйти" в профиль клиента.

    @Story(value = "Test with correct credentials")
    public void authClient(String email, String password) {
        openFormAuth();
        fillLoginField(email);
        fillPasswordField(password);
        clickEnterButton();
    }

    @Step(value = "Check locator")
    public boolean isElementAfterAuth() {
        return logoutButton.isDisplayed();
    }

    @Step(value = "click button submit")
    private void clickEnterButton() {
        enterButton.click();
    }

    @Step(value = "fill password {0}")
    private void fillPasswordField(String password) {
        fieldPassword.sendKeys(password);
    }

    @Step(value = "fill email {0}")
    private void fillLoginField(String email) {
        fieldEmail.sendKeys(email);
    }

    @Step(value = "open window for registration or login")
    private void openFormAuth() {
        openWindowAuth.click();
    }

    @Step(value = "start driver")
    public void setUp(String url) {
        DriverManager.getDriver().get(url);
    }

}
