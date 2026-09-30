package part03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * First, implement the missing parts in Person class. Then, implement the
 * methods in this class.
 *
 * You can use the JUnit test provided to verify that your implementation works
 * as expected. You can also write a main method to test your implementations.
 */
public class ObjectExercise {

	public static void main(String[] args) {
        ObjectExercise demo = new ObjectExercise();

        Person rachel = new Person("Rachel", 28);
        Person monica = new Person("Monica", 27);
        Person ross = new Person("Ross", 29);
        Person chandler = new Person("Chandler", 29);
        Person joey = new Person("Joey", 28);
        Person phoebe = new Person("Phoebe", 30);

        List<Person> people = Arrays.asList(rachel, monica, ross);
        System.out.println("Names: " + demo.getNames(people));

        System.out.println("Oldest Person: " + demo.getOldest(people));

        System.out.println("0 Person: '" + demo.generateNamesString(Arrays.asList()) + "'");
        System.out.println("1 Person: " + demo.generateNamesString(Arrays.asList(rachel)));
        System.out.println("2 People: " + demo.generateNamesString(Arrays.asList(rachel, monica)));
        System.out.println("3 People: " + demo.generateNamesString(Arrays.asList(rachel, monica, ross)));
        System.out.println("6 People: " + demo.generateNamesString(Arrays.asList(rachel, monica, ross, chandler, joey, phoebe)));
    }
	
    // NOTE! The Person class needs fixing too. Make sure that the Person class is
    // complete before implementing these methods.

    /**
     * Returns the names of the people in the list. This method takes a list of
     * Person objects and returns a list of their names. If the list is empty, an
     * empty list is returned.
     *
     * @param people A list of Person objects to get the names from.
     * @return A list of names of the people in the list.
     */
    public List<String> getNames(List<Person> people) {
    	List<String> names = new ArrayList<>();

        if (people == null) {
            return names;
        }

        for (Person p : people) {
            if (p != null) {
                names.add(p.getName());
            }
        }

        return names;
    }

    /**
     * Returns the oldest person in the list. This method takes a list of Person
     * objects and returns the oldest person in the list.
     *
     * If the list is empty, null is returned. In case there are multiple people
     * with the same age, any of them can be returned.
     *
     * @param people List of Person objects to find the oldest person from.
     * @return The oldest person in the list.
     */
    public Person getOldest(List<Person> people) {
    	if (people == null || people.isEmpty()) {
            return null;
        }

        Person oldest = people.get(0);
        for (Person p : people) {
            if (p != null && p.getAge() > oldest.getAge()) {
                oldest = p;
            }
        }

        return oldest;
    }

    /**
     * Generates a formatted string from a list of Person objects, representing
     * their names. This method takes a list of Person objects and generates a
     * string that represents the names of the people in the list.
     *
     * The formatting of the resulting string depends on the number of people in the
     * list:
     *
     * - If the list is empty, an empty string is returned.
     * - If the list contains only one person, their name is returned ("Rachel").
     * - If the list contains two people, their names are joined with "and" in
     * between ("Rachel and Monica").
     * - If the list contains three people, all names are included and a comma is
     * used between first two names ("Rachel, Monica and Ross")
     * - If the list contains more than three people, the names of the first two
     * people are listed, followed by "and X others", where X is the number of
     * remaining people ("Rachel, Monica and 4 others").
     *
     * @param people A list of Person objects to generate the names string from.
     * @return A formatted string representing the names of people in the list.
     */
    public String generateNamesString(List<Person> people) {
        // Let's use the getNames method we implemented earlier!
        List<String> names = getNames(people);

        switch (names.size()) {
            case 0:
                return "";
            case 1:
                return names.get(0);
            case 2:
                return names.get(0) + " and " + names.get(1);
            case 3:
                return names.get(0) + ", " + names.get(1) + " and " + names.get(2);
            default:
                return names.get(0) + ", " + names.get(1) + " and " + (names.size() - 2) + " others";
        }
    }
}