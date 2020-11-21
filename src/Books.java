import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Books extends BaseClass {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void verifyUserShouldNavigateToBooksPageSuccessfully() {
        //Click On Element method
        clickOnElement(By.partialLinkText("Books"));

        //Get Text From Element method is used to compare expected vs actual result
        String expectedHeading = "Books";
        String actualHeading = getTextFromElement(By.xpath("//h1[contains(text(),'Books')]"));
        Assert.assertEquals(expectedHeading, actualHeading);
    }


    @After
    public void tearDown() {
        //closeBrowser();
    }
}