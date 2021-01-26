package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.concurrent.TimeUnit;

public class SharedDriver extends EventFiringWebDriver {
    private static final WebDriver driver;

    private static final Thread CLOSE_THREAD = new Thread() {
        @Override
        public void run() {
            driver.quit();
        }
    };

    static{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Runtime.getRuntime().addShutdownHook(CLOSE_THREAD);
    }


    public SharedDriver() {
        super(driver);
    }
}
