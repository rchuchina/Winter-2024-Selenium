package Class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseLocators2 {

    /**
     * 1. Launch facebook.com
     * 2. Verify empty login-email field text is "Email address or phone number"
     * 3. Verify empty login-password field text is "Password"
     * 4. Verify login button text is "Log in"
     * 5. Close webpages
     */
    @Test
    public void verifyLoginEmptyFields() throws InterruptedException {
        // 1. Launch facebook.com
        //mac
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //Window
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Verify empty login-email field text is "Email address or phone number"
        By loginEmailLocator = By.name("email");
        WebElement loginEmailField = driver.findElement(loginEmailLocator);
        String foundEmptyLoginEmailText = loginEmailField.getAttribute("placeholder");
        Assert.assertEquals(foundEmptyLoginEmailText, "Email address or phone number", "Empty login-email field text is NOT as expected");

        // 3. Verify empty login-password field text is "Password"
        By loginPwdLocator = By.id("pass");
        WebElement loginPwdField = driver.findElement(loginPwdLocator);
        String foundEmptyLoginPwdText = loginPwdField.getAttribute("placeholder");
        Assert.assertEquals(foundEmptyLoginPwdText, "Password" , "Empty login-password field text is NOT as expected");

        // 4. Verify login button text is "Log in"
        By loginBtnLocator = By.tagName("button");
        WebElement loginButton = driver.findElement(loginBtnLocator);
        String foundLoginBtnText = loginButton.getText();
        Assert.assertEquals(foundLoginBtnText, "Log in", "Login button text is NOT as expected");

        // 5. Close webpages
        driver.quit();
    }

    /**
     * 1. Launch facebook.com
     * 2. Click on Create new account button
     * 3. Verify SignUp button is enabled
     * 4. Close webpages
     */
    @Test
    public void verifySignUpButton() throws InterruptedException {
        // 1. Launch facebook.com
       //mac
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        //Window
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Click on Create new account button
        By createNewAccountLocator = By.linkText("Create new account");
        WebElement createNewAccountLink = driver.findElement(createNewAccountLocator);
        createNewAccountLink.click();
        Thread.sleep(5000);

        // 3. Verify SignUp button is enabled
        By signUpBtnLocator = By.name("websubmit");
        WebElement signUpBtn = driver.findElement(signUpBtnLocator);
        boolean isSignUpBtnEnabled = signUpBtn.isEnabled();
        Assert.assertTrue(isSignUpBtnEnabled, "Sign up button is NOT enabled");

        // 4. Close webpages
        driver.quit();

    }

    /**
     * 1. Launch facebook.com
     * 2. Click on "Consumer Health Privacy" link
     * 3. Verify page title starts with "Health policy"
     * 4. Close webpages
     */
    @Test
    public void verifyHealthPolicyTitle() throws InterruptedException {
        // 1. Launch facebook.com
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Click on "Consumer Health Privacy" link
        By healthPrivacyLinkLocator = By.partialLinkText("Health Pri");
        WebElement healthPrivacyLink = driver.findElement(healthPrivacyLinkLocator);
        healthPrivacyLink.click();
        Thread.sleep(5000);

        // 3. Verify page title starts with "Health policy"
        String pageTitle = driver.getTitle();
        boolean isPageTitleStartsCorrectly = pageTitle.startsWith("Health policy");
        Assert.assertTrue(isPageTitleStartsCorrectly, "start of Health Privacy page title is NOT as expected");

        // 4. Close webpages
        driver.quit();
    }

    /**
     * 1. Launch facebook.com
     * 2. Type "abcd@test.com" in login-email field
     * 3. Type "myPassword@123" in password field
     * 4. Click "Log in" button
     * 5. Verify error message is displayed (The password that you've entered is incorrect.)
     * 6. Close webpages
     *
     */
    @Test
    public void enterLoginInfo() throws InterruptedException {
        // 1. Launch facebook.com
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Type "abcd@test.com" in login-email field
        By loginEmailLocator = By.xpath("//input[@data-testid='royal-email']");
        WebElement loginEmail = driver.findElement(loginEmailLocator);
        loginEmail.sendKeys("abcd@test.com");
        Thread.sleep(5000);

        // 3. Type "myPassword@123" in password field
        By loginPwdLocator = By.xpath("//input[@aria-label='Password']");
        WebElement loginPwd = driver.findElement(loginPwdLocator);
        loginPwd.sendKeys("myPassword@123");

        // 4. Click "Log in" button
        By loginBtnLocator = By.xpath("//button[text()='Log in']");
        WebElement loginBtn = driver.findElement(loginBtnLocator);
        loginBtn.click();
        Thread.sleep(5000);

        // 5. Verify error message is displayed (The password that you've entered is incorrect.)
        By loginErrorLocator = By.xpath("//div[contains(text() , 'entered is incorrect')]");
        WebElement loginError = driver.findElement(loginErrorLocator);
        boolean isLoginErrorDisplayed = loginError.isDisplayed();
        Assert.assertTrue(isLoginErrorDisplayed, "Login error is NOT displayed");

        // 6. Close webpages
        driver.quit();

    }



}
