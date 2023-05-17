import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    @FindBy(xpath = "//form[@id = 'search_form']//input")
    WebElement searchPolje;

    @FindBy(xpath = "//button[@type = 'submit']//i")
    WebElement searchIkonica;

    @FindBy(xpath = "//div[@class='category_box clearfix']")
    WebElement Velicine;

    @FindBy(xpath = "//span[@data-hint='104/110 cm']")
    WebElement radioButtonVelicine;


    ChromeDriver driver;


    public BasePage() {
    }

    public BasePage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public static void print(String s) {
        System.out.println(s);
    }

    public BasePage enterTextIntoSearchField(String text) {
        searchPolje.sendKeys(text);

        return this;
    }

    public SearchResultsPage clickSearchIcon() {
        assert searchIkonica.isDisplayed() : "Search icon is NOT present";
        searchIkonica.click();
        return new SearchResultsPage(driver);
    }


    public boolean verifyURL(String expectedUrl) {
        print("verifyURL ( " + expectedUrl + " )");
        String currentUrl = driver.getCurrentUrl();
        return currentUrl.equals(expectedUrl);
    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            print(e.getMessage());
        }
    }

    public boolean isElementPresent(WebElement element) {
        try {
            print("isElementPresent()");
            boolean isPresent = element.isDisplayed();
            return isPresent;
        } catch (Exception e) {
            return false;
        }
    }


    public void scrollIntoView(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void clickRadioButtonVelicine() {
//        print("clickRadioButtonVelicine ( " + itemName +  ")");
        waitForElement(Velicine);
        scrollIntoView(Velicine);
        List<WebElement> itemArray = Velicine.findElements(By.xpath(".//span[@data-hint='104/110 cm']"));
        for (int i = 0; i < itemArray.size(); i++) {
            WebElement item = itemArray.get(i);
            String itemTitle = item.getAttribute("104/110 cm");
            if (itemTitle.equals(itemTitle)) {
                item.click();
                break;
            }
        }
    }



        }











