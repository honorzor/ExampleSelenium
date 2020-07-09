package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MainPageTest extends SettingsForDriver {

    @Test(priority = 1)
    public void checkProduct() {
        Assert.assertTrue(mainPage.isProductButton());
    }

    @Test(priority = 2)
    public void checkPrice() {
        Assert.assertTrue(mainPage.isPriceButton());
    }

    @Test(priority = 3)
    public void checkFAQ() {
        Assert.assertTrue(mainPage.isFaqButton());
    }

    @Test(priority = 4)
    public void checkWantTest() {
        Assert.assertTrue(mainPage.isWantTestButton());
    }

    @Test(priority = 5)
    public void checkLoginButton() {
        Assert.assertTrue(mainPage.isLoginButton());
    }

}
