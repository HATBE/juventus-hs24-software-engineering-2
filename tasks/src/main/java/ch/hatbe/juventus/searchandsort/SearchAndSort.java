package ch.hatbe.juventus.searchandsort;

import ch.hatbe.juventus.object.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SearchAndSort {
    public static void main(String[] args) {
           sort();
        search();
    }

    private static void search() {
        PhoneBook phoneBook = new PhoneBook();

        Person p1 = new Person("Hans", "Muster", null, 10, true);
        Person p2 = new Person("Peter", "Keller", null, 12, true);
        Person p3 = new Person("Lisa", "Muster", null, 33, false);

        phoneBook.addEntry(p1, "12345");
        phoneBook.addEntry(p2, "67890");
        phoneBook.addEntry(p3, "54321");

        String phoneNumber = "67890";
        Person foundPerson = phoneBook.findPersonByPhoneNumber(phoneNumber);

        if (foundPerson != null) {
            System.out.println("Person gefunden: " + foundPerson);
        } else {
            System.out.println("Keine Person mit der Telefonnummer " + phoneNumber + " gefunden.");
        }
    }

    private static void sort() {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Hans", "Muster", null, 30, false));
        persons.add(new Person("Peter", "Keller", null, 25, false));
        persons.add(new Person("Peter", "Kuster", null, 28, true));
        persons.add(new Person("Lisa", "Muster", null, 22, true));

        persons.sort(new PersonNameComparator());

        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
