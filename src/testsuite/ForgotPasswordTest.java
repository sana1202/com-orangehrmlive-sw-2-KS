package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {

    String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setUp(){openBrowser(baseUrl);}
    @Test
    public void userShouldNavigateToForgetPasswordPageSuccessfully(){
        // Find the Forgot Your Password element and click
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();

        String expectedResetPasswordMessage = "Reset Password";
        // Fidn the Reset Password message element and get text
        String actualResetPasswordMessage = driver.findElement(By.xpath("//h6[text()='Reset Password']")).getText();
        //compares the expected with the actual message
        Assert.assertEquals(expectedResetPasswordMessage,actualResetPasswordMessage);

        driver.quit();
    }
    @After
    public void tearDown(){closeBrowser();}
}
