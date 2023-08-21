package cz.lukan.pages;

import com.microsoft.playwright.Page;

public class HomePage {
    private final Page page;
    public HomePage(Page page) {this.page = page; }
    String acceptCookie = "Accept";


    public void clickAcceptCookies() {
        page.getByText(acceptCookie).click();
    }
}
