package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UseLocators3 {

    /**
     * 1. Launch cnn.com/weather
     * 2. Enter "10010" in search box
     * 3. Verify Current-Temp-Value is greater than Feels-Like-Temp-Value
     *
     * search-input xpath -> //input[@placeholder='Search by location']
     * Current-Temp-Value xpath -> //span[contains(@class,'current-temp')]
     * Feels-Like-Temp-Value xpath -> //span[contains(@class,'current-feels')]
     *
     */
    @Test
    public void verifyCurrentTempGreaterThanFeelsLike() throws InterruptedException {
        // 1. Launch cnn.com/weather
        System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe"); // Windows
        //System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.cnn.com/weather";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Enter "10010" in search box
        By weatherSearchInputLocator = By.xpath("//input[@placeholder='Search by location']");
        WebElement weatherSearchInput = driver.findElement(weatherSearchInputLocator);
        weatherSearchInput.clear();
        weatherSearchInput.sendKeys("10010");
        weatherSearchInput.sendKeys("\n\n");
        Thread.sleep(5000);

        By currentTempValueLocator = By.xpath("//span[contains(@class,'current-temp')]");
        WebElement currentTempValueElement = driver.findElement(currentTempValueLocator);
        String currentTempValue = currentTempValueElement.getText();
        System.out.println("currentTempValue -> " + currentTempValue);  // "40"
        int currentTempValueInt = Integer.valueOf(currentTempValue);    // 40

        By feelsLikeTempValueLocator = By.xpath("//span[contains(@class,'current-feels')]");
        WebElement feelsLikeTempValueElement = driver.findElement(feelsLikeTempValueLocator);
        String feelsLikeTempValue = feelsLikeTempValueElement.getText();
        System.out.println("feelsLikeTempValue -> " + feelsLikeTempValue);  // "35"
        int feelsLikeTempValueInt = Integer.valueOf(feelsLikeTempValue);    // 35

        boolean isCurrTempGreaterFeelsLikeTemp = currentTempValueInt > feelsLikeTempValueInt;
        Assert.assertTrue(isCurrTempGreaterFeelsLikeTemp, "Current temp value is NOT greater than Feels-like temp value");

        driver.quit();
    }

    /**
     * 1. Launch facebook.com
     * 2. Click on Create new account button
     * 3. Verify Female radio-button is NOT selected
     * 4. Verify Male radio-button is NOT selected
     * 5. Verify Not Specified radio-button is NOT selected
     */
    @Test
    public void verifyGenderRadioButtonDefault() throws InterruptedException {
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

        // 3. Verify Female radio-button is NOT selected
        By femaleRadioBtnLocator = By.xpath("//label[text()='Female']//input");
        WebElement femaleRadioBtn = driver.findElement(femaleRadioBtnLocator);
        boolean isFemaleRadioBtnSelected = femaleRadioBtn.isSelected();
        Assert.assertFalse(isFemaleRadioBtnSelected, "Female radio button is selected");

        driver.quit();
    }

}
