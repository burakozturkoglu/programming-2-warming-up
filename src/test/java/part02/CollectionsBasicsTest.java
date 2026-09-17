package part02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CollectionsBasicsTest {

    private CollectionsBasics solution = new CollectionsBasics();

    @Test
    void testMaximum() {
        List<Integer> numbers = List.of(1, 2, 300, 4, 5);

        assertEquals(300, solution.maximum(numbers));
    }

    @Test
    void testSum() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        assertEquals(15, solution.sum(numbers));
    }

    @Test
    void testMultiply() {
        List<Integer> numbers = List.of(-1, 0, 100, 42);

        List<Integer> multipliedByTwo = solution.multiply(numbers, 2);
        assertEquals(List.of(-2, 0, 200, 84), multipliedByTwo);

        List<Integer> multipliedByTen = solution.multiply(numbers, 10);
        assertEquals(List.of(-10, 0, 1000, 420), multipliedByTen);
    }

    @Test
    void testRange() {
        // The end value is not included in the list
        assertEquals(List.of(1, 2, 3, 4, 5), solution.range(1, 6));

        // The range can start at any number
        assertEquals(List.of(5, 6, 7, 8, 9), solution.range(5, 10));

        // The range will be empty if the end value is less than or equal to start
        assertEquals(List.of(), solution.range(10, 9));

        // Negative numbers should be supported, too
        assertEquals(List.of(-5, -4, -3, -2, -1), solution.range(-5, 0));
    }

    @Test
    void testConcatenateFooBarBaz() {
        String result = solution.concatenateStrings(List.of("foo", "bar", "baz"));

        assertEquals("foobarbaz", result);
    }

    @Test
    void testConcatenateProgrammingLanguages() {
        String result = solution.concatenateStrings(List.of("Java", "Python", "TypeScript"));

        assertEquals("JavaPythonTypeScript", result);
    }

    @Test
    void testGetLengthsOfProgrammingLanguages() {
        List<String> strings = List.of("Java", "Python", "TypeScript");

        assertEquals(List.of(4, 6, 10), solution.getLengths(strings));
    }

    @Test
    void testGetLengthsOfTools() {
        List<String> strings = List.of("VS Code", "Eclipse", "Git", "Gradle", "JUnit");

        assertEquals(List.of(7, 7, 3, 6, 5), solution.getLengths(strings));
    }

    @Test
    void testFindingIndicesOfSubstrings() {
        // Finds all occurrences of "X" in the string
        assertEquals(List.of(0, 2, 4), solution.indicesOf("X.X.X...", "X"));

        // If the substring is not found, an empty list is returned
        assertEquals(List.of(), solution.indicesOf("abcdefg", "Y"));

        // The substrings can be of any length and they may overlap
        assertEquals(List.of(1, 3), solution.indicesOf("banana", "ana"));
    }
}
