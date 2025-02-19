package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Selenium_Basics {

    /**
     * Methods:
     *      get() - to launch an url
     *      maximize() - to maximize the webpage
     *      close() - to close the window which is connected with driver-variable (even if there are multiple windows opened due to automation code)
     *      quit() - to close ALL windows which were opened due to automation code
     *      getTitle() - to get the title of webpage which is connected to driver-variable
     *      getCurrentUrl() - to get the current-url of webpage which is connected to driver-variable
     *
     */

    /**
     * 1. Launch facebook.com
     */
    @Test
    public void launchFacebook() throws InterruptedException {
        // 1. Set the location of ChromeDriver
        // System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver"); // Mac
        WebDriver driver = new ChromeDriver();

        /**
         * Above 2-lines of code are responsible to create/launch blank chrome-window
         * And, driver-variable is connected with the above created/launched chrome-window.
         * Therefore, using the driver whatever method we'll execute it will be performed on the connected chrome-window.
         */

        /**
         * To launch a webpage/url
         * method: get()
         */
        String url = "https://www.facebook.com/";
        driver.get(url);

        Thread.sleep(10000);    // to pause the execution for 10000milliseconds (10-seconds)

        /**
         * To maximize the window
         * method: maximize()
         */
        driver.manage().window().maximize();

        /**
         * To close the webpage
         * method: close()
         *      will ONLY close the window which is currently connected with driver-variable
         *      even if there were multiple windows opened due to automation code.
         *
         * method: quit()
         *      will close ALL the windows which were opened due to automation code.
         */
        driver.quit();

    }

    /**
     * TC: Verify user launches correct facebook landing page
     * 1. Launch https://www.facebook.com/
     * 2. Verify user is on facebook landing page
     *      Verify page title is "Facebook – log in or sign up"
     *      Verify the current url present on webpage is "https://www.facebook.com/"
     */
    @Test
    public void verifyCorrectWebpage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.facebook.com/";
        driver.get(url);

        Thread.sleep(5000);

        /*
            Verify page title is "Facebook – log in or sign up"
                1. get the current-page-title on webpage
                2. verify current-page-title is equals to "Facebook – log in or sign up"
         */
        /**
         * To get the page-title with which driver-variable is connected
         * method: getTitle()
         * return-type: String
         */
        String foundPageTitle = driver.getTitle();
        String expectedPageTitle = "Facebook – log in or sign up";
        Assert.assertEquals(foundPageTitle, expectedPageTitle, "Page title is NOT as expected");

        /*
            Verify the current url present on webpage is "https://www.facebook.com/"
                1. get the current-url on webpage
                2. verify the current-url is equals to "https://www.facebook.com/"
         */
        /**
         * To get current url of webpage with which driver-variable is connected
         * method: getCurrentUrl()
         * return-type: String
         */
        String foundUrl = driver.getCurrentUrl();
        Assert.assertEquals(foundUrl, url, "Url is NOT as expected");

        driver.quit();
    }
}
