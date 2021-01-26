package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class ProductPage {
    private final WebDriver driver;

    @FindBy(xpath = "//div[@id='detailBullets_feature_div']//span[contains(.,'Item model number')]/following-sibling::span")
    private WebElement itemModelNumber;

    @FindBy(xpath = "//div[@id='detailBullets_feature_div']//span[contains(.,'ASIN')]/following-sibling::span")
    private WebElement ASIN;

    public ProductPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public HashMap<String,String> getProductDetails(){
        HashMap<String, String> productDetails = new HashMap<String, String>();

        productDetails.put("MODEL_NUMBER", itemModelNumber.getText());
        productDetails.put("ASIN", ASIN.getText());

        return productDetails;
    }
}
