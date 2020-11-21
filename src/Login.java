import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login extends BaseClass {
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully(){
        //Click On Element method
        clickOnElement((By.linkText("Log in")));

        //Get Text From Element method is used to compare expected vs actual result
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = getTextFromElement(By.xpath("/h1[contains(text(),'Welcome, Please Sign In!')]"));
        Assert.assertEquals(expectedMessage, actualMessage);

    }
    @After
    public void tearDown(){
        //closeBrowser();

    }
}
