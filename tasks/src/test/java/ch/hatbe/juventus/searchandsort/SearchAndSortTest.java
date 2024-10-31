package ch.hatbe.juventus.searchandsort;

import ch.hatbe.juventus.object.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchAndSortTest {
    private SearchAndSort searchAndSort;

    @BeforeEach
    public void setUp() {
        searchAndSort = new SearchAndSort();
    }

    @Test
    public void testSort() {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Hans", "Muster", null, 30, false));
        persons.add(new Person("Peter", "Keller", null, 25, false));
        persons.add(new Person("Peter", "Kuster", null, 28, true));
        persons.add(new Person("Lisa", "Muster", null, 22, true));

        persons.sort(new PersonNameComparator());

        assertEquals("Hans", persons.get(0).getFirstName());
        assertEquals("Lisa", persons.get(1).getFirstName());
        assertEquals("Peter", persons.get(2).getFirstName());
        assertEquals("Peter", persons.get(3).getFirstName());
    }

    @Test
    public void testSearch() {
        PhoneBook phoneBook = new PhoneBook();

        Person p1 = new Person("Hans", "Muster", null, 10, true);
        Person p2 = new Person("Peter", "Keller", null, 12, true);
        Person p3 = new Person("Lisa", "Muster", null, 33, false);

        phoneBook.addEntry(p1, "12345");
        phoneBook.addEntry(p2, "67890");
        phoneBook.addEntry(p3, "54321");

        String phoneNumber = "67890";
        Person foundPerson = phoneBook.findPersonByPhoneNumber(phoneNumber);

        assertNotNull(foundPerson);
        assertEquals("Peter", foundPerson.getFirstName());
        assertEquals("Keller", foundPerson.getLastName());

        String nonExistentPhoneNumber = "00000";
        Person notFoundPerson = phoneBook.findPersonByPhoneNumber(nonExistentPhoneNumber);

        assertNull(notFoundPerson);
    }
}