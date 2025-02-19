package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseLocators1 {

    /**
     * 1. Launch facebook.com
     * 2. Type "abcd@test.com" in login-email field
     * 3. Type "myPassword@123" in password field
     * 4. Close webpages
     */
    @Test
    public void enterLoginCredentials() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Type "abcd@test.com" in login-email field
        By loginEmailLocator = By.id("email");
        WebElement loginEmailField = driver.findElement(loginEmailLocator);
        loginEmailField.sendKeys("abcd@test.com");
        Thread.sleep(5000);

        // 3. Type "myPassword@123" in password field
        By loginPwdLocator = By.id("pass");
        WebElement loginPwdField = driver.findElement(loginPwdLocator);
        loginPwdField.sendKeys("myPassword@123");

        // 4. Close webpages
        driver.quit();

    }

    /**
     * 1. Launch facebook.com
     * 2. Verify Log in button is enabled
     * 3. Close webpages
     */
    @Test
    public void verifyLoginButtonEnabled() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Verify Log in button is enabled
        By loginButtonLocator = By.name("login");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        boolean isLoginBtnEnabled = loginButton.isEnabled();
        Assert.assertTrue(isLoginBtnEnabled, "Login button is NOT enabled");

        // 3. Close webpages
        driver.quit();
    }


}
