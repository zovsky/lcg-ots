package app;

import app.navigation.EyeBrow;
import app.navigation.Footer;
import app.navigation.NavUtility;
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

    public static EyeBrow buildEyeBrow() {
        return new EyeBrow();
    }

    public static NavUtility buildNavUtility() {
        return new NavUtility();
    }

    public static Footer buildFooter() {
        return new Footer();
    }




}
