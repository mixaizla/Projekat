import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChooseProductTest extends BaseTest{

    /**
     * Choose product jakna za devojcice
     * Steps:
     * 1. Open Google Chrome
     * 2. Navigate to "https://www.suncemoje.rs/deca-4-13/devojcice"
     * 3. Choose product Haljina za devojcice
     *
     * Expected result:
     * Verify that choosen product has been shown
     */

    @Test
    public void chooseJaknaZaDevojcice() {
        ChromeDriver driver = openChromeDriver();
        try {
            ProductPage  productPage = new ProductPage(driver);
            productPage.chooseHaljinaZaDevojcice();

            String currentUrl = driver.getCurrentUrl();
            assert currentUrl.equals("https://www.suncemoje.rs/product/detail/25110")  : "Wrong url. Actual " + currentUrl;

        }finally {
//            driver.quit();
        }
    }


}
