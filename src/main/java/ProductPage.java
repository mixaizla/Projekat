import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'product-description']")
    WebElement productName;

    @FindBy(xpath = "//img[@src = 'https://www.suncemoje.rs/photo/get/25110/detail']")
    WebElement HaljinaZaDevojcice;

    @FindBy(xpath = "//p[@class='size']//span[@data-hint='104/110 cm']")
    WebElement ButtonIzaberiVelicinuPetGodina;


    public ProductPage(ChromeDriver driver) {
        super(driver);
        driver.get("https://www.suncemoje.rs/deca-4-13/devojcice");
        print("ProductPage");
    }

    public void chooseHaljinaZaDevojcice() {
        print("chooseHaljinaZaDevojcice");
        HaljinaZaDevojcice.click();

    }
    public void clickButtonIzaberiVelicinuPetGodina() {

        scrollIntoView(ButtonIzaberiVelicinuPetGodina);
        print("clicButtonIzaberiVelicinuPetGodina");
        ButtonIzaberiVelicinuPetGodina.click();
    }


    public String getItemName() {
        return productName.getText();
    }



    }






