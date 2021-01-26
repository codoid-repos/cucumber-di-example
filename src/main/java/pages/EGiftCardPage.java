package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class EGiftCardPage {
    private final WebDriver driver;

    public EGiftCardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectNewestArrivals(){
        driver.findElement(By.id("a-autoid-0-announce")).click();
        driver.findElement(By.xpath("//a[.='Newest Arrivals']")).click();
    }

    public void selectFirstProduct(){
        driver.findElement(By.xpath("//span[@data-component-type='s-product-image']/a")).click();
    }
}
