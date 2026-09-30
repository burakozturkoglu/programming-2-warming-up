package part01;

/**
 * The class contains empty methods and methods with known issues that need to
 * be fixed.
 *
 * Your task is to implement the empty methods and fix the methods with issues.
 * Use the JUnit test provided to verify that your implementation works as
 * expected. You can also write a main method to test your implementations.
 *
 * Do not change the signatures of the methods already provided. However, you
 * are free to add new methods.
 */
public class StringBasics {
	
	public static void main(String[] args) {
        StringBasics demo = new StringBasics();

        // 1. Test truncate
        System.out.println("Truncate 'Hello' (max 2): " + demo.truncate("Hello", 2)); 
        System.out.println("Truncate 'Hello' (max 5): " + demo.truncate("Hello", 5)); 

        // 2. Test parseYesOrNo
        System.out.println("parseYesOrNo('YES'): " + demo.parseYesOrNo("YES")); 
        System.out.println("parseYesOrNo('no'): " + demo.parseYesOrNo("no"));   

        // 3. Test getFizzBuzz
        System.out.println("FizzBuzz 3: " + demo.getFizzBuzz(3));  
        System.out.println("FizzBuzz 5: " + demo.getFizzBuzz(5));   
        System.out.println("FizzBuzz 15: " + demo.getFizzBuzz(15)); 
        System.out.println("FizzBuzz 7: " + demo.getFizzBuzz(7));  

        // 4. Test center
        System.out.println("Center 'Java' (width 8): '" + demo.center("Java", 8) + "'"); 
        // 5. Test centerMultiLine
        String multiLineText = "Java\n21";
        System.out.println("Center MultiLine:");
        System.out.println(demo.centerMultiLine(multiLineText, 8));
    }

    /**
     * Truncates a text to a given maximum length. If the text is longer than the
     * maximum length, the text is cut to the maximum length. If the text is shorter
     * or equal to the maximum length, the text is returned as is.
     *
     * @param text      The input text to be truncated.
     * @param maxLength The maximum length of the text.
     * @return The truncated text.
     */    public String truncate(String text, int maxLength) {

    	 if (text == null || maxLength < 0) {
             return text;
         }

         if (text.length() > maxLength) {
             return text.substring(0, maxLength);
         }

         return text;
    }

    /**
     * Parses a text and returns `true` if it matches the string "yes"
     * (case-insensitive). All other inputs return `false`.
     *
     * @param text The input text to be parsed.
     * @return `true` if the text is "yes" (case-insensitive), otherwise `false`
     */
    public boolean parseYesOrNo(String text) {
    	return "yes".equalsIgnoreCase(text);
    }

    /**
     * Returns the FizzBuzz result for a given number.
     *
     * If the number is divisible by three, the result is "fizz". If the number is
     * divisible by five, the result is "buzz". If the number is divisible by both
     * three and five, the result is "fizzbuzz". Otherwise, the result is the number
     * as a string.
     *
     * See more at https://en.wikipedia.org/wiki/Fizz_buzz
     *
     * @param number The input number to be evaluated.
     * @return "fizz", "buzz", "fizzbuzz" or the given number as a string.
     */
    public String getFizzBuzz(int number) {
    	if (number % 3 == 0 && number % 5 == 0) {
            return "fizzbuzz";
        } else if (number % 3 == 0) {
            return "fizz";
        } else if (number % 5 == 0) {
            return "buzz";
        } else {
            return String.valueOf(number);
        }
    }

    /**
     * Returns a new string with the given text centered inside. Spaces are added to
     * the left and right sides of the text to make it centered. The total width of
     * the returned string must be equal to the given width.
     *
     * If the given text is longer than the given width, the text is returned as is.
     *
     * If the whitespace padding on the left and right sides are not equal, you
     * can add the extra space to either side, as long as the total width is equal
     * to the given width. You can assume that the text only contains a single line.
     *
     * @param text  The input text to be centered, for example "Java".
     * @param width The width of the string, for example 6.
     * @return The text centered in a string of the given width: " Java ".
     */
    public String center(String text, int width) {
    	if (text == null) {
            text = "";
        }

        int totalPadding = width - text.length();

        // If the text is longer than or equal to width, return as is
        if (totalPadding <= 0) {
            return text;
        }

        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding;

        return " ".repeat(leftPadding) + text + " ".repeat(rightPadding);
    }

    /**
     * THIS IS AN EXTRA EXERCISE, AND IT'S ONLY TESTED IN THE JUNIT TESTS IF IT
     * RETURNS A NON-NULL VALUE. IF YOU WANT TO SKIP THIS METHOD, JUST KEEP IT AS IS
     * AND RETURN NULL.
     *
     * Returns the given text centered in a string of a given width. Unlike the
     * `center` method, this method can handle multi-line text. Each line needs to
     * be centered separately.
     *
     * For example, given the two-line text "center\nstring" and the width 8, this
     * method should generate and return " center \n string ".
     *
     * Same rules as in the `center` method apply for each line. If a line is longer
     * than the given width, the line is kept as is. If the whitespace padding on
     * the left and right sides are not equal, you can add the extra space to either
     * side.
     *
     * @param text      The input text to be centered.
     * @param lineWidth The width for each line in the returned string.
     * @return The text formatted so that each line is centered separately.
     */
    public String centerMultiLine(String text, int lineWidth) {
    	if (text == null) {
            return null;
        }

        String[] lines = text.split("\n", -1);

        for (int i = 0; i < lines.length; i++) {
            lines[i] = center(lines[i], lineWidth);
        }

        return String.join("\n", lines);
    }
}
