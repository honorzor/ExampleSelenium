package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AuthorizationPage;

public class AuthorizationTest {
    private final AuthorizationPage authorizationPage = new AuthorizationPage();

    private static final String EMAIL = "bxgq0bhpvj@1secmail.org";
    private static final String PASSWORD = "7lhnGr";
    private static final String BASEURL = "http://test.uxcrowd.ru";


    @Test
    public void authClient() {
        authorizationPage.setUp(BASEURL);
        authorizationPage.authClient(EMAIL, PASSWORD);
        boolean elementAfterAuth = authorizationPage.isElementAfterAuth();
        Assert.assertTrue(elementAfterAuth);
    }
}
