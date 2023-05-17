import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SocialNetworkTest extends BaseTest{

    /**
     * Choose product jakna za devojcice
     * Steps:
     * 1. Open Google Chrome
     * 2. Visit "https://www.suncemoje.rs/"
     * 3. Scroll down and click on the button FB
     *
     * Expected result:
     * Verify that you are navigated to the face book page
     */



    @Test
    public void visitFBPage() {
        ChromeDriver driver = openChromeDriver();

        try {
            HomePage homePage = new HomePage(driver);
            homePage.clickButtonFB();
            driver.get("https://www.facebook.com/suncemoje.rs");
            String currentUrl = driver.getCurrentUrl();
            assert currentUrl.equals("https://www.facebook.com/suncemoje.rs")  : "Wrong url. Actual " + currentUrl;

        }finally {
//            driver.quit();
        }
    }
}
