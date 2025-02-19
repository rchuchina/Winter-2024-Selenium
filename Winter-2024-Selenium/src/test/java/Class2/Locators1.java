package Class2;

public class Locators1 {
    /**
     * Link to install SelectorsHub
     *
     * https://chromewebstore.google.com/detail/selectorshub-xpath-helper/ndgimibanhlabgdgjcpbbndiehljcpfh?hl=en
     */

    /**
     * In general, Locators can be defined as a route to reach to the line in the DOM which is related to the webElement which we want to find.
     *
     * Technically, Locators can be defined as data of By-datatype
     * By -> a class which has methods to generate locators (based on given/input info) to reach to the desired webElement.
     *
     * Steps to interact with a webElement:
     * 1. Find the unique address to reach to webElement (using DOM)
     *      OR
     *    Find the unique way to reach to the exact line in the DOM linked with webElement with which we want to interact.
     * 2. Depending upon the unique way from step-1, we use the specific method from By-Class to create locator.
     * 3. Use the created locator with findElement()-method to find the webElement.
     * 4. Once the webElement is found, then interact with it using desired method.
     *
     */

    /**
     * To find a specific webElement using locator
     * method: findElement()
     * return-type: WebElement
     */

    /**
     * Locator strategies:
     *
     * 1. using id-attribute (id-attribute's value is ALWAYS going to be unique)
     * In selectors-hub, check if id-attribute has unique value -> //*[@id='idValue']
     * By locatorUsingId = By.id("idValue");
     *
     * 2. using name-attribute
     * In selectors-hub, check if name-attribute has unique value -> //*[@name='nameValue']
     * By locatorUsingName = By.name("nameValue");
     *
     */

    /**
     * Method to interact with webElement:
     * sendKeys() - to type in a webElement
     *
     * isEnabled() - to get if webElement is enabled
     *               if webElement is enabled, method returns true; otherwise returns false.
     *
     * isDisplayed() - to get if webElement is displayed
     *               if webElement is displayed, method returns true; otherwise returns false.
     *
     * click() - to click on a webElement
     */


}
