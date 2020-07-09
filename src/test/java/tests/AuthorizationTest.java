package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AuthorizationTest extends SettingsForDriver {
    private final static String EMAIL = "bxgq0bhpvj@1secmail.org";
    private final static String PASSWORD = "7lhnGr";

    @Test
    public void authClient() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        authorizationPage.authClient(EMAIL, PASSWORD);
        boolean elementAfterAuth = authorizationPage.isElementAfterAuth();
        Assert.assertTrue(elementAfterAuth);
    }
}
