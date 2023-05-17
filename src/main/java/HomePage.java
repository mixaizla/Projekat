import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage {

    @FindBy(xpath = "//a[@title='Odeća za devojčice']")
    WebElement DesktopMenuDevojcice;


    @FindBy(xpath = "//a[@alt='Facebook stranica Sunce moje']")
    WebElement buttonFB;



    public HomePage(ChromeDriver driver) {
        super(driver);
        driver.get("https://www.suncemoje.rs/");
        print("HomePage");
    }

    public void clickDesktopMenuDevojcice() {
        print("clickDesktopMenuDevojcice");
        DesktopMenuDevojcice.click();

    }

    public void clickButtonFB() {
        driver.get("https://www.suncemoje.rs/");
        scrollIntoView(buttonFB);
        print("clickButtonFB");
        buttonFB.click();
    }



    public void sortItemsByVelicine(String velicine) {
        print("sortItemsByVelicine ( " + 5 + " )");

    }




}