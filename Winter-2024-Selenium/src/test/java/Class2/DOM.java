package Class2;

public class DOM {
    /**
     * DOM - Document Object Model
     *     - It's a HTML document
     *
     * Code -> generates DOM (html-document) -> creates the Webpage
     *
     * <html>
     *     <head>
     *         ...
     *         ...
     *     </head>
     *     <body>
     *         ...
     *         ...
     *     </body>
     * </html>
     */
    /**
     * <tag1>   ->  starting of tag1
     *
     * </tag1>  ->  closing of tag1
     *
     * <html>           -> starting of html-tag
     *     <head>       -> starting of head-tag
     *         ...
     *         ...
     *     </head>      -> closing of head-tag
     *     <body>       -> starting of body-tag
     *         ...
     *         ...
     *     </body>      -> closing of body-tag
     * </html>          -> closing of html-tag
     *
     * NOTE: Tag-names CANNOT have spaces (it's ALWAYS going to be one-word)
     * Examples: html, head, body, script, link, div, form, input, a, select
     *
     */

    /**
     * <tag1 abc=123 abcd=1234 attr1="val1" attr2 attr3="val2" attr4="val4">
     *     tag -> tag1
     *     attributes of tag1 -> abc, abcd
     *     abc-attribute of tag1 has value = "123"
     *     abcd-attribute of tag1 has value = "1234"
     *     attr1-attribute of tag1 has value = "val1"
     *     attr2-attribute of tag1 has NO value
     *     attr3-attribute of tag1 has value = "val2"
     *     attr4-attribute of tag1 has value = "val4"
     *
     * NOTE: Attribute-names CANNOT have spaces (it's ALWAYS going to be one-word)
     *
     * </tag1>  -> closing of tag1
     *
     * <input type="text" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt"
     *      name="email" id="email" tabindex="0" placeholder="Email address or phone number"
     *      value="" autofocus="1" autocomplete="username"
     *      aria-label="Email address or phone number">
     *
     * tag -> input
     * attributes of input-tag -> type, class, name, id, placeholder, value, aria-label
     *
     *      type-attribute of input-tag has value = "text"
     *      class-attribute of input-tag has value = "inputtext _55r1 inputtext _1kbt inputtext _1kbt"
     *      id-attribute of input-tag has value = "email"
     *      name-attribute of input-tag has value = "email"
     *      value-attribute of input-tag has value = ""
     *      aria-label-attribute of input-tag has value = "Email address or phone number"
     *
     *
     * Any text in between the starting-tag and closing-tag is called Text of tag
     *
     * <div class="_9axz">      -> starting of div-tag
     *     Log in to Facebook   -> Text of div-tag
     * </div>                   -> closing of div-tag
     *
     * <tag1 attr11="val1" attr12="val2" attr13>
     *     <tag2 attr21="val21" attr22="val22">     -> starting of tag2
     *         text value
     *     </tag2>                  -----------------> closing of tag2
     *     <tag3>
     *         text value again
     *     </tag3>
     * </tag1>
     *
     * Tags -> tag1, tag2, tag3
     * Attributes of tag2 -> attr21, attr22
     * Attributes of tag3 -> No Attributes
     * Attributes of tag1 -> attr11, attr12, attr13
     *
     * text of tag2 -> "text value"
     * text of tag3 -> "text value again"
     * text of tag1 -> no text
     */

}
