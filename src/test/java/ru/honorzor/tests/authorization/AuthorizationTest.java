package ru.honorzor.tests.authorization;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ru.honorzor.pages.AuthorizationPage;
import ru.honorzor.tests.listener.ScreenShotListener;

@Listeners({ScreenShotListener.class})
public class AuthorizationTest {
    private final AuthorizationPage authorizationPage = new AuthorizationPage();

    private static final String EMAIL = "bxgq0bhpvj@1secmail.org";
    private static final String CORRECTPASSWORD = "7lhnGr";
    private static final String INCORRECTPASSWORD = "dsadsd";
    private static final String BASEURL = "http://test.uxcrowd.ru";


    @Test
    public void authClient() {
        authorizationPage.startDriver(BASEURL);
        authorizationPage.authClient(EMAIL, CORRECTPASSWORD);
        boolean elementAfterAuth = authorizationPage.isElementAfterAuth();
        Assert.assertTrue(elementAfterAuth);
    }
}
