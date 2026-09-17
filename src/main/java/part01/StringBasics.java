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

    /**
     * Truncates a text to a given maximum length. If the text is longer than the
     * maximum length, the text is cut to the maximum length. If the text is shorter
     * or equal to the maximum length, the text is returned as is.
     *
     * @param text      The input text to be truncated.
     * @param maxLength The maximum length of the text.
     * @return The truncated text.
     */
    public String truncate(String text, int maxLength) {
        // TODO: Fix this method

        if (text.length() > maxLength) {
            text.substring(0, maxLength);
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
        // FIXME: this seems to always return false, even when the `text` is "yes"

        if (text.toLowerCase() == "yes") {
            return true;
        }
        return false;
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
        return "fizzbuzz"; // TODO: implement this method
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
        return null; // TODO: implement this method
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
        // hint: you can split the text by newlines and use your `center` method to
        // center each line separately

        return null; // Implement this extra method if you want. It's not required.
    }
}
