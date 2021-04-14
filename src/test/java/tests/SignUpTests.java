package tests;

import utils.BaseTests;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class SignUpTests extends BaseTests {


    @BeforeTest
    public void loadHome() {
        this.signUpPage = getHomePage();
    }


    @Test
    public void tc001_testSuccessfulSetUp(){
        signUpPage.SignUpToDemoQA();
        assertEquals(signUpPage.getHeadertext(),"Forms","You logged it's not successful!");
    }
}
