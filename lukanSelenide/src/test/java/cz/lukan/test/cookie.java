package cz.lukan.test;

import cz.lukan.pages.HomePage;
import org.testng.annotations.Test;

public class cookie {
    HomePage home = new HomePage();

    @Test
    public void testPotvrzeníCookie() {

        home.
                open()
                .getAcceptClick().click();
    }

    @Test
    public void testZamitnutiCookies() {
        home
                .open()
                .getDeclineClick().click();
    }
}
