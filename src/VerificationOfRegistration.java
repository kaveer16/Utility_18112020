import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class VerificationOfRegistration extends BaseClass{
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);

    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageAndRegisterSuccessfully() {
        //Click On Element method
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));
        //Click On Element method
        clickOnElement(By.className("male"));
        //Using sendTextToElement method from Utility class
        driver.findElement(By.xpath(" //input[@id='FirstName']")).sendKeys("RAJ");

        Random randomGenerator = new Random();
        int randomInt= randomGenerator.nextInt(999);

        //Using sendTextToElement method from Utility class
        driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kumar");

        //Using sendTextToElement method from Utility class
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("28");
        //Using sendTextToElement method from Utility class
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("February");
        //Using sendTextToElement method from Utility class
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1988");

        //Using sendTextToElement method from Utility class
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("kriva@yahoo.com" + randomInt+"yahoo.com");
        //Using sendTextToElement method from Utility class
        driver.findElement(By.xpath("//input[@id='Company']")).sendKeys("Raj Ltd");

        //Click On Element method
        driver.findElement(By.xpath("//input[@id='Newsletter']"));

        //Using sendTextToElement method from Utility class
        driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123456");

        //Using sendTextToElement method from Utility class
        driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("123456");

        //Click On Element method
        clickOnElement(By.xpath("//input[@id='register-button']"));


        //Get Text From Element method is used to compare expected vs actual result
        String expectedHeading = "Your registration completed";
        String actualHeading = getTextFromElement(By.xpath("//div[contains(text(),'Your registration completed')]"));
        Assert.assertEquals(expectedHeading ,actualHeading);

    }
    @After
    public void tearDown(){

    }
}
