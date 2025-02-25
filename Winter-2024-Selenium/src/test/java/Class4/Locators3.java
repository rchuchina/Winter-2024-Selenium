package Class4;

public class Locators3 {
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
     * Link (or Hyperlink):
     *  1. is a Clickable Text
     *  2. always a-tag
     *  3. Text of a-tag is called LinkText
     *  4. Value of href-attributes defines where user will go after clicking the link
     *
     *
     *  <a href="/reg/" title="Sign up for Facebook">
     *      Sign Up
     *  </a>
     *
     *  attributes of a-tag: href, title
     *  text of a-tag: "Sign Up"
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
     * 3. using tagName
     * In selectors-hub, check if tagName is unique -> //tagName
     * By locatorUsingTagName = By.tagName("tagNameValue");
     *
     * 4. using LinkText
     * In selectors-hub, check if link-text is unique -> //a[text()='Link Text Value']
     * By locatorUsingLinkText = By.linkText("Link Text Value");
     *
     * 5. using partial-LinkText
     * In selectors-hub, check if partial-link-text is unique -> //a[contains(text(), 'Partial Link Text Value')]
     * By locatorUsingLinkText = By.partialLinkText("Partial Link Text Value");
     *
     * 6. using xpath
     * In selectors-hub, create xpath to find the webElement -> //xpath-to-webElement
     * By locatorUsingXpath = By.xpath("//xpath-to-webElement");
     *
     */

    /**
     * X-path locator strategies:
     * 1. using attribute-value:
     * In selectors-hub, create xpath -> //tagName[@attributeName='attribute value']
     * --> Find the tag(tagName) in the dom, which has attribute(attributeName) and attribute's value equals to "attribute value"
     * Example : //input[@data-testid='royal-email']
     *
     * 2. using text-value:
     * In selectors-hub, create xpath -> //tagName[text()='Text Value']
     * --> Find the tag(tagName) in the dom, which has text-value equals to "Text Value"
     * Example: //button[text()='Log in']
     *
     * 3. using partial attribute-value:
     * In selectors-hub, create xpath -> //tagName[contains(@attributeName , 'partial attribute value')]
     * --> Find the tag(tagName) in the dom, which has attribute(attributeName) and attribute's value contains "partial attribute value"
     * Example :
     *
     * 4. using partial text-value:
     * In selectors-hub, create xpath -> //tagName[contains(text() , 'partial text value')]
     * --> Find the tag(tagName) in the dom, which has text-value equals to "partial text value"
     * Example: //div[contains(text() , 'entered is incorrect')]
     *
     * 5. using starting-portion attribute-value:
     * In selectors-hub, create xpath -> //tagName[starts-with(@attributeName , 'starting portion of attribute value')]
     * --> Find the tag(tagName) in the dom, which has attribute(attributeName) and attribute's value starts-with "starting portion of attribute value"
     * Example :
     *
     * 6. using starting-portion text-value:
     * In selectors-hub, create xpath -> //tagName[starts-with(text() , 'starting portion text value')]
     * --> Find the tag(tagName) in the dom, which has text-value starting with "starting portion of text value"
     * Example: //div[starts-with(text() , 'The password')]
     *
     *
     * 7. using and/or operator:
     * In selector's hub, create xpath like -> //tagName[@attributeName='attribute value' and text()='Text Value']
     * --> Find the tag(tagName) in the dom, which has attribute(attributeName) with value equals to 'attribute value' AND text-value equals to 'Text Value'
     *
     * In selector's hub, create xpath like -> //tagName[text()='Text Value1' or text()='Text Value2']
     * --> Find the tag(tagName) in the dom, which has text-value equals to 'Text Value1' or 'Text Value2'
     *
     * 8. using not-operator:
     * In selector's hub, create xpath like -> //tagName[not(text() = 'text value')]
     * --> Find the tag(tagName) in the dom, which has text NOT equals to 'text value'
     *
     * In selector's hub, create xpath like -> //tagName[not(contains(@attributeName, 'partial attr Value'))]
     * --> Find the tag(tagName) in the dom, which has attribute(attributeName) and it's value NOT contains 'partial attr Value'
     *
     * 9. using parent/grandParent/familyTree tag:
     * Reach to tag4 (under tag3) (assumption: there is nothing unique about tag4)
     * How to create xpath to reach tag4 (under tag3)?
     * //tag31[@attr22='val22']//tag4[@attr='val']
     *
     * Reach to tag4 (under tag4) (assumption: there is nothing unique about tag4)
     * How to create xpath to reach tag4 (under tag4)?
     * //tag43[text()='Text Value']//tag23[@attr22='val22']//tag4[@attr='val']
     *
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
     *
     * getAttribute() - to get the value of given-attribute of a webElement
     *
     * getText() - to get the text of the webElement
     *
     * clear() - to remove/delete existing text/content in a text-box
     *
     * isSelected() - to get if webElement is selected
     *               if webElement is selected, method returns true; otherwise returns false.
     */




}
