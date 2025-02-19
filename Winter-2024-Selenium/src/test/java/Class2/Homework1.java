package Class2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Homework1 {
    /**
     * 1. Launch facebook.com
     * 2. Verify login email field is displayed
     * 3. Verify login password field is displayed
     */

//}
//public class Homework1 {
    WebDriver driver;
    @Test
    //@BeforeClass
    public void setUp() {
        // Set ChromeDriver path if needed
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }

    //@Test(priority = 1)
    public void verifyEmailFieldDisplayed() {
        WebElement emailField = driver.findElement(By.id("email"));
        Assert.assertTrue(emailField.isDisplayed(), "Email field is not displayed");
    }

    //@Test(priority = 2)
    public void verifyPasswordFieldDisplayed() {
        WebElement passwordField = driver.findElement(By.id("pass"));
        Assert.assertTrue(passwordField.isDisplayed(), "Password field is not displayed");
    }

    //@AfterClass
    public void tearDown() {
        driver.quit();
    }
}