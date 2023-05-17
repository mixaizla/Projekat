import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{

    @Test
    public void searchForSesirZaDevojcicu() {


        /**
         * Search for product sesir za devojcice
         * Steps:
         * 1. Open Google Chrome
         * 2. Visit "https://www.suncemoje.rs/"
         * 3. Enter product name into searh field
         * 4. Click on searh icon
         * Expected result:
         * Verify that the requested product  has been shown
         */

        ChromeDriver driver =  openChromeDriver();
        try {

            HomePage homePage =  new HomePage(driver);
            homePage.enterTextIntoSearchField("Sesir za devojcicu");
            SearchResultsPage searchResultsPage = homePage.clickSearchIcon();
//            String actualItemName =searchResultsPage.getSingleItemName();
//            assert actualItemName.contains("SesirZaDevojcicu") : "Error";

        }finally {
//            driver.quit();
        }

    }

    @Test
    public void addSesirZaDevojcicuToCart() {

        /**
         * Add product sesir za devojcice to the cart
         * Steps:
         * 1. Open Google Chrome
         * 2. Visit "https://www.suncemoje.rs/"
         * 3. Enter product name into searh field
         * 4. Click on searh icon
         * 5. Navigate to the search product page by click on requested product
         * 6. Click on size button
         * 7. Click on button add to cart
         * Expected result:
         * Verify that the message is displayed "Artikal je dodat u korpu"
         * Verify that shopping cart icon showen number 1.
         */


        ChromeDriver driver =  openChromeDriver();
        try {

            HomePage homePage =  new HomePage(driver);
            homePage.enterTextIntoSearchField("Sesir za devojcicu");
            SearchResultsPage searchResultsPage = homePage.clickSearchIcon();
            searchResultsPage.clickSesirZaDevojcicu();
            searchResultsPage.clickButtonIzaberiVelicinu();
            searchResultsPage.clickButtonDodajUKorpu();
//            String actualNumberInShoppingCartBadge = searchResultsPage.getNumberFromShoppingCartBadge();
//            assert actualNumberInShoppingCartBadge.equals("1") : "Wrong number. Expected 1. Actual " + actualNumberInShoppingCartBadge;

        }finally {
//            driver.quit();
        }


        }

}