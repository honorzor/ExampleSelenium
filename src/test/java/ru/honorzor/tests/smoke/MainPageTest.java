package ru.honorzor.tests.smoke;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.honorzor.pages.MainPage;
import ru.honorzor.tests.listener.ScreenShotListener;

@Listeners({ScreenShotListener.class})

public class MainPageTest {
    private final MainPage mainPage = new MainPage();

    private static final String BASEURL = "http://test.uxcrowd.ru";

    private static final String REALPRODUCTTEXT = "Онлайн-инструмент для тестирования на пользователях";
    private static final String REALPRICETEXT = "Тарифы на использование UXCrowd";
    private static final String REALFAQTEXT = "Часто задаваемые вопросы";
    private static final String REALWANTTESTTEXT = "Работа дома — тестирование сайтов";
    private static final String REALLOGINTEXT = "Вход";


    @Test(priority = 1)
    public void checkProduct() {
        mainPage.startDriver(BASEURL);
        mainPage.clickProductButton();
        Assert.assertEquals(mainPage.getActualTextProductPage(), REALPRODUCTTEXT);
    }

    @Test(priority = 2)
    public void checkPrice() {
        mainPage.startDriver(BASEURL);
        mainPage.clickPriceButton();
        Assert.assertEquals(mainPage.getActualTextPricePage(), REALPRICETEXT);
    }

    @Test(priority = 3)
    public void checkFAQ() {
        mainPage.startDriver(BASEURL);
        mainPage.clickFaqButton();
        Assert.assertEquals(mainPage.getActualTextFaqPage(), REALFAQTEXT);
    }

    @Test(priority = 4)
    public void checkWantTest() {
        mainPage.startDriver(BASEURL);
       // mainPage.clickWantTestButton();
        Assert.assertEquals(mainPage.getActualTextWantTestPage(), REALWANTTESTTEXT);
    }

    @Test(priority = 5)
    public void checkLoginButton() {
        mainPage.startDriver(BASEURL);
        mainPage.clickLoginButton();
        Assert.assertEquals(mainPage.getActualTextLoginPage(), REALLOGINTEXT);
    }

}
