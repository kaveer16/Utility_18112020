import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Apparel extends BaseClass{
    String baseUrl = "https://demo.nopcommerce.com/";
    @Before
    public void setUp(){
        openBrowser(baseUrl);

    }
    @Test
    public void verifyUserShouldNavigateToApparelPageSuccessfully(){
        //Click On Element method
        clickOnElement(By.partialLinkText("Appar"));

        //Get Text From Element method is used to compare expected vs actual result
        String expectedHeading = "Apparel";
        String actualHeading = getTextFromElement(By.xpath("/h1[contains(text(),'Welcome, Please Sign In!')]"));
        Assert.assertEquals(expectedHeading ,actualHeading);
    }
}
