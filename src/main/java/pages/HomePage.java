package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private final WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goToEGiftCardPage(){
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("nav-hamburger-menu")).click();
        driver.findElement(By.xpath("//div/parent::a[.='Gift Cards']")).click();
        driver.findElement(By.linkText("eGift cards")).click();
    }

}
