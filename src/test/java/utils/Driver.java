package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    private WebDriver driver;

    /**
     * @param browser: String
     * @param url: String
     */
    public Driver(String browser, String url) {
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                driver.get(url);
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
                break;

        }
    }

    /**
     * @return WebDriver
     */
    public WebDriver getDriver() {
        return this.driver;
    }
}
