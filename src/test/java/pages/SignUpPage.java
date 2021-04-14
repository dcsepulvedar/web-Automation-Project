package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BasePage;

public class SignUpPage extends BasePage {

    /**
     * Constructor
     *
     * @param driver : WebDriver
     */
    public SignUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    /**
     * Web Elements
     */


    @FindBy(xpath = "//div[@class='card-body']/*[text()='Forms']")
    private WebElement formsButton;

    @FindBy(xpath = "//div[@class='main-header']")
    private WebElement headertext;



    /**
     * Actions Methods
     */



    public void clickFormsButton() {
        isElementVisible(formsButton);
        formsButton.click();
    }

    public String getHeadertext(){
        isElementVisible(headertext);
        return headertext.getText();
    }


    /**
     * This method will be exposed in test case to sign Up in the application
     */
    public void SignUpToDemoQA(){
        this.clickFormsButton();
        this.getHeadertext();

    }
    }
