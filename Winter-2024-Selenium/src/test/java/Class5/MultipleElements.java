package Class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class MultipleElements {
    /**
     * 1. Launch facebook.com
     * 2. Verify the number of links on the page is more than 20
     */
    @Test
    public void verifyLinkCount() throws InterruptedException {
        // 1. Launch facebook.com
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Verify the number of links on the page is more than 20
        By linksLocator = By.tagName("a");
        List<WebElement> allLinksElement = driver.findElements(linksLocator);   // [we1, we2, we3, we4, we5, ...]
        boolean isMoreThan20 = allLinksElement.size() > 20;
        Assert.assertTrue(isMoreThan20, "Number of links are NOT more than 20");

        driver.quit();
    }

    /**
     * How to handle auto-suggestion:
     *  1. Observe if data that user is seeing is present as an attribute's-value or text-value in the dom
     *  2. Create a locator that find all the auto-suggestion webElements (or lines in the dom related to auto-suggestion webElements)
     *  3. using findElements()-method, find all the auto-suggestion webElements
     *  4. Apply a for-loop
     *      a) pick autoSuggestionElement from list found in #3
     *      b) apply getAttribute()-method or getText()-method based on #1
     *      c) if above-value is equals to which user wants to click/select
     *          click the autoSuggestion-webElement
     *          break the loop
     */

    /**
     * 1. Launch hotels.com
     * 2. Enter "Tan" in search input box
     * 3. Select "Taneytown" from auto-suggestion
     */
    @Test
    public void autoSuggestion() throws InterruptedException {
        // 1. Launch hotels.com
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
        WebDriver driver = new ChromeDriver();
        String url = "https://www.hotels.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Enter "Tan" in search input box
        By whereToBoxLocator = By.xpath("//button[@data-stid='destination_form_field-menu-trigger']");
        driver.findElement(whereToBoxLocator).click();

        By whereToInputLocator = By.xpath("//input[@data-stid='destination_form_field-menu-input']");
        driver.findElement(whereToInputLocator).sendKeys("Tan");
        Thread.sleep(5000);

        // 3. Select "Tannersville" from auto-suggestion
        By autoSuggestionsLocator = By.xpath("//button[@data-stid='destination_form_field-result-item-button']");
        List<WebElement> allAutoSuggestions = driver.findElements(autoSuggestionsLocator);
        for (WebElement suggestion : allAutoSuggestions) {
            String suggestionValue = suggestion.getAttribute("aria-label");
            if (suggestionValue.startsWith("Taneytown")) {
                suggestion.click();
                break;
            }
        }
    }

    /**
     * How to handle Calendar:
     *  1. Observe if date that user is seeing is present as an attribute's-value or text-value in the dom
     *  2. Create a locator that find all the date-webElements (or lines in the dom related to date-webElements)
     *  3. using findElements()-method, find all the date-webElements
     *  4. Apply a for-loop
     *      a) pick date-webElement from list found in #3
     *      b) apply getAttribute()-method or getText()-method based on #1
     *      c) if above-value is equals to date which user wants to click/select
     *          click the date-webElement
     *          break the loop
     */

    /**
     * 1. Launch hotels.com
     * 2. Select Mar-5 as Check-in date
     * 3. Select Mar-14 as Check-out date
     * 4. Click Done button
     */
    @Test
    public void calendar() throws InterruptedException {
        // 1. Launch hotels.com
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
        WebDriver driver = new ChromeDriver();
        String url = "https://www.hotels.com/";
        driver.get(url);
        Thread.sleep(1000);

        // 2. Select Mar-5 as Check-in date
        By dateButtonLocator = By.xpath("//label[text()='Dates']/following-sibling::button");
        driver.findElement(dateButtonLocator).click();
        Thread.sleep(1000);

        By allMarchDatesLocator = By.xpath("//span[text()='March 2025']/following-sibling::table//div[starts-with(@class,'uitk-date-number')]");
        List<WebElement> allMarchDateElements = driver.findElements(allMarchDatesLocator);

        for (WebElement marchDateElement : allMarchDateElements) {
            String dateText = marchDateElement.getText();
            if (dateText.equalsIgnoreCase("5")) {
                marchDateElement.click();
                break;
            }
        }

        // 3. Select Mar-14 as Check-out date
        List<WebElement> allMarchDateElements1 = driver.findElements(allMarchDatesLocator);
        for (WebElement marchDateElement : allMarchDateElements1) {
            String dateText = marchDateElement.getText();
            if (dateText.equalsIgnoreCase("14")) {
                marchDateElement.click();
                break;
            }
        }

        // 4. Click Done button
        By dateDoneBtnLocator = By.xpath("//button[@data-stid='apply-date-selector']");
        driver.findElement(dateDoneBtnLocator).click();

    }

}
