package utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import pages.SignUpPage;



public class BaseTests {

    public Driver driver;

    protected SignUpPage signUpPage;


    /**
     * @param browser: String
     * @param url: String
     */

    @BeforeTest(alwaysRun = true)
    @Parameters({"browser", "url"})
    public void beforeSuite(String browser, String url) {
        this.driver = new Driver(browser, url);
        this.signUpPage = new SignUpPage(this.driver.getDriver());
    }


    public SignUpPage getHomePage() {
        return this.signUpPage;
    }

    @AfterTest(alwaysRun = true)
    public void afterSuite() {
	this.signUpPage.dispose();
    }


}