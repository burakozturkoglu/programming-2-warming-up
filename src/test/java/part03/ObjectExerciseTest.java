package part03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ObjectExerciseTest {

    // Some test data
    private Person rachel = new Person("Rachel", 28);
    private Person monica = new Person("Monica", 29);
    private Person ross = new Person("Ross", 33);
    private Person phoebe = new Person("Phoebe", 32);
    private Person joey = new Person("Joey", 29);
    private Person chandler = new Person("Chandler", 31);

    // The object we are testing
    private ObjectExercise solution = new ObjectExercise();

    @Test
    void getNamesReturnsTheNamesOfPeopleInAList() {
        List<Person> people = List.of(rachel, monica, ross);
        List<String> names = solution.getNames(people);

        assertEquals(List.of("Rachel", "Monica", "Ross"), names);
    }

    @Test
    void getNamesReturnsAnEmptyListWhenThereAreNoPeople() {
        List<Person> empty = List.of();
        assertEquals(List.of(), solution.getNames(empty));
    }

    @Test
    void getOldestReturnsTheOnlyPersonWhenThereIsOnlyOne() {
        List<Person> people = List.of(rachel);
        assertEquals(rachel, solution.getOldest(people));
    }

    @Test
    void getOldestReturnsTheOldestPersonFromGivenList() {
        List<Person> people = List.of(rachel, ross, monica);
        assertEquals(ross, solution.getOldest(people));
    }

    @Test
    void getOldestReturnsNullWhenTheGivenListIsEmpty() {
        List<Person> empty = List.of();
        assertEquals(null, solution.getOldest(empty));
    }

    @Test
    void generateNamesStringReturnsEmptyStringWhenThereAreNoPeople() {
        List<Person> empty = List.of();
        assertEquals("", solution.generateNamesString(empty));
    }

    @Test
    void generateNamesStringRetrnsTheNameWhenThereIsOnlyOnePerson() {
        List<Person> onePerson = List.of(rachel);
        assertEquals("Rachel", solution.generateNamesString(onePerson));
    }

    @Test
    void generateNamesStringJoinsTheNamesOfTwoPeople() {
        List<Person> twoPeople = List.of(rachel, monica);
        assertEquals("Rachel and Monica", solution.generateNamesString(twoPeople));
    }

    @Test
    void generateNamesStringJoinsTheNamesOfThreePeople() {
        List<Person> threePeople = List.of(rachel, monica, ross);
        assertEquals("Rachel, Monica and Ross", solution.generateNamesString(threePeople));
    }

    @Test
    void generateNamesStringShowsNumberOfPeopleWhenThereAreFourOrMoreInTheList() {
        List<Person> fourPeople = List.of(rachel, monica, ross, phoebe);
        assertEquals("Rachel, Monica and 2 others", solution.generateNamesString(fourPeople));

        List<Person> sixPeople = List.of(rachel, monica, ross, phoebe, joey, chandler);
        assertEquals("Rachel, Monica and 4 others", solution.generateNamesString(sixPeople));
    }
}
