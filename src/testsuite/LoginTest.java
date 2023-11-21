package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setUp(){openBrowser(baseUrl);}
    @Test
    public void userShouldLoginSucessfullyWithValidCredentials(){
        //Find the Username button element and send the input
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        //Find the Password button element and send the input
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        //Find the Login button element and click
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String expectedDisplayMessage = "Dashboard";
        // Find the dashboard element and get the text
        String actualDisplayMessage = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();

        Assert.assertEquals(expectedDisplayMessage,actualDisplayMessage);

    }
    @After
    public void tearDown(){closeBrowser();}
}
