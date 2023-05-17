import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchResultsPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'product']")
    WebElement sesirZaDevojcicu;

    @FindBy(xpath = "//button[@class='add-to-cart-button']")
    WebElement buttonDodajUKorpu;
    @FindBy(xpath = "//span[@class='size-box']")
    WebElement buttonIzaberiVelicinu;
    @FindBy(xpath = "//a[@href='basket/checkout']")
    WebElement buttonShoppingCart;

    @FindBy(xpath = "//i[@title='Prikaži sadržaj korpe']")
    WebElement shoppingCartBadge;

    public SearchResultsPage(ChromeDriver driver) {

        super(driver);
        driver.get("https://www.suncemoje.rs/odeca-za-decu");
    }

    public String getSingleItemName() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'product']")));
        return sesirZaDevojcicu.getText();
    }

    public void clickSesirZaDevojcicu() {
        print("clicSesirZaDevojcicu");
        sesirZaDevojcicu.click();
    }


    public void clickButtonIzaberiVelicinu() {
        print("clicButtonIzaberiVelicinu");
        buttonIzaberiVelicinu.click();
    }

    public String getNumberFromShoppingCartBadge() {
        waitForElement(shoppingCartBadge);
        print("getNumberFromShoppingCartBadge");
        return shoppingCartBadge.getText();
    }



    public void clickButtonDodajUKorpu() {
        print("clicButtonDodajUKorpu");
        buttonDodajUKorpu.click();
    }

    public void clickButtonShoppingCart() {
        print("clicButtonShoppingCart");
        buttonShoppingCart.click();
    }
}
