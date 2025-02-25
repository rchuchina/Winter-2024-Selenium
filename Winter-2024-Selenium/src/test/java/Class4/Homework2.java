package Class4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Homework2 {

        /**
     * 1. Launch facebook.com
     * 2. Click on Messenger link
     * 3. Verify "Log in" button is enabled
     * 4. Verify "Keep me signed in" checkbox is NOT selected                             git status
         *
     * 5. Click on "log in" button
     * 6. Verify "Forgotten your password?" heading is displayed
     * 7. Click on X
     * 8. Verify "Forgotten your password?" heading is NOT displayed
     */
    @Test
    public  void   verifyKeepForgotPassNot() throws InterruptedException {
        //public static void main(String[] args) throws InterruptedException {
            // Set the path to your WebDriver
            //System.setProperty("web driver.chrome.driver", "path/to/chromedriver");
            System.setProperty("web driver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
            // Launch Chrome browser
            WebDriver driver = new ChromeDriver();

            try {
                // 1. Launch facebook.com
                driver.get("https://www.facebook.com");
                driver.manage().window().maximize();

                // 2. Click on Messenger link
                WebElement messengerLink = driver.findElement(By.linkText("Messenger"));
                messengerLink.click();

                // 3. Verify "Log in" button is enabled
                WebElement loginButton = driver.findElement(By.name("login"));
                if (loginButton.isEnabled()) {
                    System.out.println("Log in button is enabled");
                } else {
                    System.out.println("Log in button is NOT enabled");
                }

                // 4. Verify "Keep me signed in" checkbox is NOT selected
                WebElement keepMeSignedInCheckbox = driver.findElement(By.name("persistent"));
                if (!keepMeSignedInCheckbox.isSelected()) {
                    System.out.println("'Keep me signed in' checkbox is NOT selected");
                } else {
                    System.out.println("'Keep me signed in' checkbox IS selected");
                }

                // 5. Click on "Log in" button
                loginButton.click();

                // 6. Verify "Forgotten your password?" heading is displayed
                Thread.sleep(2000); // Wait for page to load
                //WebElement forgotPasswordHeading = driver.findElement(By.xpath("//h2[contains(text(),'Forgotten your password?')]"));
                 WebElement forgotPassword = driver.findElement(By.xpath("//h2[contains(text(),'Forgotten password?')]"));
                //if (forgotPasswordHeading.isDisplayed()) {
                 if (forgotPassword.isDisplayed()) {
                    //System.out.println("'Forgotten your password?' heading is displayed");
                    System.out.println("'Forgot password?' heading is displayed");
                } else {
                    //System.out.println("'Forgotten your password?' heading is NOT displayed");
                    System.out.println("'Forgotten password?' heading is NOT displayed");
                }

                // 7. Click on X to close the pop-up
                WebElement closeButton = driver.findElement(By.xpath("//button[@aria-label='Close']"));
                closeButton.click();

                // 8. Verify "Forgotten your password?" heading is NOT displayed
                Thread.sleep(1000); // Wait for pop-up to close
                //if (driver.findElements(By.xpath("//h2[contains(text(),'Forgotten your password?')]")).isEmpty()) {
                if (driver.findElements(By.xpath("//h2[contains(text(),'Forgotten password?')]")).isEmpty()) {
                    //System.out.println("'Forgotten your password?' heading is NOT displayed");
                    System.out.println("'Forgotten password?' heading is NOT displayed");
                } else {
                    //System.out.println("'Forgotten your password?' heading is STILL displayed");
                    System.out.println("'Forgotten password?' heading is STILL displayed");
                }
            } finally {
                // Close the browser
                driver.quit();
            }
        }


    /**
     * 1. Launch facebook.com
     * 2. Click Create new account button
     * 3. Select Jul in month dropdown
     * 4. Select 10 in date dropdown
     * 5. Select 2000 in year dropdown
     */

    @Test
    public  void   verifyDropdownMonthDateYear() throws InterruptedException {
            //public  void main(String[] args) {
            // Set the path to your ChromeDriver
            //System.setProperty("web driver.chrome.driver", "path/to/chromedriver");
            System.setProperty("web driver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
            // Launch the Chrome browser
            WebDriver driver = new ChromeDriver();

            try {
                // 1. Launch facebook.com
                driver.get("https://www.facebook.com");

                // Maximize the browser window
                driver.manage().window().maximize();

                // 2. Click Create new account button
                WebElement createAccountBtn = driver.findElement(By.xpath("//a[text()='Create new account']"));
                createAccountBtn.click();

                // Pause to allow modal to load
                Thread.sleep(2000);

                // 3. Select Jul in month dropdown
                WebElement monthDropdown = driver.findElement(By.id("month"));
                Select month = new Select(monthDropdown);
                month.selectByVisibleText("Jul");

                // 4. Select 10 in date dropdown
                WebElement dayDropdown = driver.findElement(By.id("day"));
                Select day = new Select(dayDropdown);
                day.selectByVisibleText("10");

                // 5. Select 2000 in year dropdown
                WebElement yearDropdown = driver.findElement(By.id("year"));
                Select year = new Select(yearDropdown);
                year.selectByVisibleText("2000");

                // Optional: Pause to see the results
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close the browser
                driver.quit();
            }
        }


    /**
     * 1. Launch facebook.com
     * 2. Click on Create new account button
     * 3. Verify Female radio-button is NOT selected
     * 4. Verify Male radio-button is NOT selected
     * 5. Verify Not Specified radio-button is NOT selected
     */
    @Test
    public  void   verifyGenderRadioButtonDefault() throws InterruptedException {
       //public static void main(String[] args) {
            // Set up WebDriver path (if needed)
           // System.setProperty("web driver.chrome.driver", "path/to/chromedriver");
              System.setProperty("web driver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
            // Launch Chrome browser
            WebDriver driver = new ChromeDriver();

            try {
                // 1. Launch facebook.com
                driver.get("https://www.facebook.com/");

                // 2. Click on Create new account button
                WebElement createAccountButton = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
                createAccountButton.click();

                // Pause to allow elements to load
                Thread.sleep(2000);

                // 3. Verify Female radio-button is NOT selected
                WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value='1']"));
                System.out.println("Female radio button selected: " + femaleRadioButton.isSelected());

                // 4. Verify Male radio-button is NOT selected
                WebElement maleRadioButton = driver.findElement(By.xpath("//input[@value='2']"));
                System.out.println("Male radio button selected: " + maleRadioButton.isSelected());

                // 5. Verify Not Specified radio-button is NOT selected
                WebElement notSpecifiedRadioButton = driver.findElement(By.xpath("//input[@value='-1']"));
                System.out.println("Not Specified radio button selected: " + notSpecifiedRadioButton.isSelected());

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close browser
                driver.quit();
            }
        }
    //}

    /**
     * 1. Launch google.com
     * 2. Search tesla
     * 3. Click on Wikipedia link of Tesla
     * 4. Verify heading "Tesla, Inc." is displayed
     * 5. Verify "96 languages" text is displayed on language dropdown (this is NOT a dropdown)
     */
    @Test
    public  void   verifyTeslaInc96Lang() throws InterruptedException {
      //  public static void main(String[] args) {
            // Set up WebDriver
            //System.setProperty("web driver.chrome.driver", "path/to/chromedriver");
             System.setProperty("web driver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            try {
                // 1. Launch Google
                driver.get("https://www.google.com");

                // Accept cookies if prompted (Optional, depends on region)
                try {
                    WebElement acceptCookies = driver.findElement(By.xpath("//button[text()='Accept all']"));
                    acceptCookies.click();
                } catch (Exception ignored) {}

                // 2. Search Tesla
                WebElement searchBox = driver.findElement(By.name("q"));
                searchBox.sendKeys("Tesla");
                searchBox.submit();

                // 3. Click on Wikipedia link of Tesla
                wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Tesla, Inc. - Wikipedia"))).click();

                // 4. Verify heading "Tesla, Inc." is displayed
                WebElement heading = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstHeading")));
                if (heading.getText().equals("Tesla, Inc.")) {
                    System.out.println("Heading verification PASSED");
                } else {
                    System.out.println("Heading verification FAILED");
                }

                // 5. Verify "96 languages" text is displayed
                WebElement languageInfo = driver.findElement(By.xpath("//div[contains(text(),'96 languages')]"));
                if (languageInfo.isDisplayed()) {
                    System.out.println("Language text verification PASSED");
                } else {
                    System.out.println("Language text verification FAILED");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // Close browser
                driver.quit();
            }
        }
    }


