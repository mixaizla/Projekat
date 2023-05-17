import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateTest extends BaseTest{


    /**
     * Choose product jakna za devojcice
     * Steps:
     * 1. Open Google Chrome
     * 2. Visit "https://www.suncemoje.rs/"
     * 3. Navigate to "https://www.suncemoje.rs/deca-4-13/devojcice/" by click on desktop manu for devojcice
     *
     * Expected result:
     * Verify that choosen products has been shown
     */
@Test
    public void goOnProductPageDevojcice() {
    ChromeDriver driver = openChromeDriver();
    try {
        HomePage homePage = new HomePage(driver);
        homePage.clickDesktopMenuDevojcice();
        driver.get("https://www.suncemoje.rs/deca-4-13/devojcice/");
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl.equals("https://www.suncemoje.rs/deca-4-13/devojcice/")  : "Wrong url. Actual " + currentUrl;

    }finally {
        driver.quit();
    }
}

}
