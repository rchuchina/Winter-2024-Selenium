package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown_Discussion {
    /**
     * Dropdowns
     *      -> it is an element with selected-tag in the dom
     *      -> All the values in the dropdown (or within select-tag) are always going to be with option-tag
     *      -> To handle/automate dropdown, we use Select-Class (from Selenium)
     *
     *      option-tag:
     *          -> option-tag may have value-attribute or text-value
     *          -> user will see on the website either the data of value-attribute or text-value of option-tag
     *
     *      Steps to interact with a dropdown:
     *      1. find the locator for dropdown (or Select-tag)
     *      2. using the locator, find the dropdown-webElement
     *      3. Create an object of Select-Class and input dropdown-webElement
     *      4. using selectByVisibleText()-method with Select-Class-object, select the desired value from dropdown.
     */

    /**
     * 1. Launch facebook.com
     * 2. Click Create new account button
     * 3. Select Jul in month dropdown
     */
    @Test
    public void selectMonthFromDropdown() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Click on Create new account button
        By createNewAccountBtnLocator = By.xpath("//form[@data-testid='royal_login_form']//a[contains(@data-testid,'registration')]");
        WebElement createNewAccountBtn = driver.findElement(createNewAccountBtnLocator);
        createNewAccountBtn.click();
        Thread.sleep(5000);

        // 3. Select Jul in month dropdown
        By monthDropdownLocator = By.id("month");
        WebElement monthDropdownElement = driver.findElement(monthDropdownLocator);
        Select monthDropdown = new Select(monthDropdownElement);
        monthDropdown.selectByVisibleText("Jul");


    }


}
