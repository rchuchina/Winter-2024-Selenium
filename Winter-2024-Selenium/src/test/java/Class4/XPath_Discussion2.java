package Class4;

public class XPath_Discussion2 {
    /**
     * Types of Xpath:
     *      1. Absolute Xpath
     *          a) starts with single-slash (/)
     *          b) tells the route to reach to a particular webElement from html-tag
     *              OR
     *             tells the route to reach to a particular line in the DOM from html-tag
     *             -> not reliable bcz of any changes in the webpage can break the absolute xpath
     *          /html/body/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form/div[1]/div[1]/input
     *
     *      2. Relative Xpath
     *          a) starts with double-slash(//)
     *          b) by using tagName, attribute-value, text-value to create route to reach to a particular webElement in the DOM
     *              OR
     *             by using tagName, attribute-value, text-value to create route to reach to a particular line in the DOM
     */






    /**
     *
     * <tag1 attr11="val1" attr12="val2" attr13>
     *     <tag2 attr21="val21" attr22="val22">
     *         text value
     *     </tag2>
     *     <tag3>
     *         text value again
     *     </tag3>
     * </tag1>
     *
     * Tags directly inside tag1 -> tag2, tag3 (tag1 has 2-children: tag2, tag3)
     * tag2 and tag3 are siblings (bcz, both has same parent(tag1))
     *
     *
     *
     *
     * children of tag1 : tag2, tag3, tag4, tag5
     * siblings of tag3 : tag2, tag4, tag5 (same parent-tag1)
     * children of tag2 : tag21, tag22
     * Family tree of tag24 : tag21(parent), tag2(GrandParent), tag1(Grand-GrandParent)
     * Following-Sibling: Any sibling-tags which appears in the dom after the tag
     * Preceding-Sibling: Any sibling-tags which appears in the dom before the tag
     * Following-Siblings of tag3 -> tag4, tag5
     * Preceding-Siblings of tag3 -> tag2
     * Preceding-Sibling of tag22 -> tag21
     * Preceding-Sibling of tag21 -> None
     *
     *
     * <tag1 attr11="val1" attr12="val2" attr13>
     *     <tag2 attr21="val21" attr22="val22">
     *         <tag21 attr21="val21" attr22 attr23="val23">
     *              <tag24 attr21="val21" attr22 attr23="val23">
     *                      "Text"
     *              </tag24>
     *         </tag21>
     *         <tag22 attr22="val22" attr22 attr23="val23">
     *             "Text Value"
     *         </tag22>
     *         <tag4 attr="val">
     *              Text
     *         </tag4>
     *         text value
     *     </tag2>
     *     <tag3> -> children of tag-3 : tag31
     *         <tag31 attr22="val22" attr22 attr23="val23"> -> children of tag31 : tag22
     *             "Text Value"
     *              <tag22 attr22="val22" attr22 attr23="val23"> -> children of tag22 : tag4
     *                  <tag4 attr="val">
     *                      Text
     *                  </tag4>
     *                  "Text Value"
     *              </tag22>
     *         </tag31>
     *         text value again
     *     </tag3>
     *     <tag4>
     *         <tag41 attr22="val22" attr22 attr23="val23">
     *             "Text Value"
     *         </tag41>
     *         <tag42 attr22="val22" attr22 attr23="val23">
     *             "Text Value"
     *              <tag23 attr22="val22" attr22 attr23="val23"> -> children of tag22 : tag4
     *                  <tag4 attr="val">
     *                      Text
     *                  </tag4>
     *                  "Text Value"
     *              </tag23>
     *         </tag42>
     *         <tag43 attr22="val22" attr22 attr23="val23">
     *             "Text Value"
     *              <tag22 attr22="val22" attr22 attr23="val23"> -> children of tag22 : tag4
     *                  <tag4 attr="val">
     *                      Text
     *                  </tag4>
     *                  "Text Value"
     *              </tag22>
     *              <tag23 attr22="val22" attr22 attr23="val23"> -> children of tag22 : tag4
     *                  <tag4 attr="val">
     *                      Text
     *                  </tag4>
     *                  "Text Value"
     *              </tag23>
     *         </tag43>
     *         text again
     *     </tag4>
     *     <tag5>
     *         text value again
     *     </tag5>
     * </tag1>
     *
     *
     *
     *
     *
     *
     *
     *
     */
}
