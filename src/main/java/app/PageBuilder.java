package app;

import app.pages.HomePage;
import app.pages.LoginPage;
import app.pages.OTSframe;

public class PageBuilder {

    public static LoginPage buildLoginPage() {
        return new LoginPage("/login");
    }

    public static HomePage buildHomePage() {
        return new HomePage("/");
    }

    public static OTSframe buildOTSFrame() {
        return new OTSframe();
    }
}
