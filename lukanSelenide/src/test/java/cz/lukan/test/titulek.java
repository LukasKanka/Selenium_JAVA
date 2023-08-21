package cz.lukan.test;

import cz.lukan.pages.HomePage;
import org.testng.annotations.Test;

public class titulek {
    HomePage home = new HomePage();

    @Test
    public void testTitulsPage() {
        home
                .open()
                .titulek();
    }
}
