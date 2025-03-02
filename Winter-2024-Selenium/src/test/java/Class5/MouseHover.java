package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseHover {

    /**
     * How to perform mouse-Hover action in automation.
     * --> By the help of Actions-Class
     *
     * Steps:
     *  1. find the locator for the webElement on which you want to perform mouseHover-action
     *  2. find the webElement using the locator
     *  3. create an object of Actions-Class, and input the driver-variable in it.
     *  4. using moveToElement()-method perform mouseHover action
     */

    /**
     * 1. Launch https://classroomessentialsonline.com/
     * 2. Move mouse on "Classroom" menu option
     * 3. Click "Desk & Study Carrels" option
     * 4. Verify Desks & Study Carrels heading is displayed
     */
    @Test
    public void mouseHoverSample() throws InterruptedException {
        // 1. Launch facebook.com
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
        WebDriver driver = new ChromeDriver();
        String url = "https://classroomessentialsonline.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Move mouse on "Classroom" menu option
        By classroomMenuLocator = By.linkText("Classroom");
        WebElement classroomMenu = driver.findElement(classroomMenuLocator);
        Actions actions = new Actions(driver);
        actions.moveToElement(classroomMenu).build().perform();
        Thread.sleep(5000);

        // 3. Click "Desk & Study Carrels" option
        By deskStudyCarrelsLocator = By.xpath("//ul[@aria-labelledby='classroom-menu']//a[@title='Desks & Study Carrels']");
        WebElement deskStudyCarrels = driver.findElement(deskStudyCarrelsLocator);
        deskStudyCarrels.click();
        Thread.sleep(5000);

        // 4. Verify Desks & Study Carrels heading is displayed
        By headingLocator = By.xpath("//h1[text()='Desks & Study Carrels']");
        WebElement headingElement = driver.findElement(headingLocator);
        boolean isHeadingDisplayed = headingElement.isDisplayed();
        Assert.assertTrue(isHeadingDisplayed, "Heading is NOT displayed");

        driver.quit();

    }

}
