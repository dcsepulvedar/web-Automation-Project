package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePage {


    public WebDriver driver;
    private WebDriverWait wait;

    /**
     * Constructor
     * @param pageDriver: WebDriver
     */
    public BasePage(WebDriver pageDriver) {
        PageFactory.initElements(pageDriver, this);
        this.driver = pageDriver;

    }

    /**
     * @return WebDriver
     */
    public WebDriver getDriver() {
        return this.driver;
    }


    /**
     * Wait for the element
     */

     public boolean isElementVisible(WebElement element){
        try{

            WebDriverWait wait = new WebDriverWait(driver, 15);

             ExpectedCondition<WebElement> cond1 = ExpectedConditions.elementToBeClickable(element);
             ExpectedCondition<WebElement> cond2 = ExpectedConditions.visibilityOf(element);
             ExpectedCondition<Boolean> cond = ExpectedConditions.and(cond1, cond2);

             wait.until(cond);
            return true;
        }catch(Exception e){
            return false;
        }
    }

    /**
     * Wait for Iframe insisibility
     */

    public boolean isIframeInvisible(WebElement element){
        try{
            WebDriverWait wait = new WebDriverWait(driver,1000, 1000);
            wait.until(ExpectedConditions.invisibilityOf(element));
            return true;

        }catch(Exception e){
            return false;
        }
    }

    /**
     * Page Refresh
     */
    public void PageRefresh(){
        driver.get(driver.getCurrentUrl());
    }


    /**
     * Defines actions to do when tests finish
     */
    public void dispose() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }
}
