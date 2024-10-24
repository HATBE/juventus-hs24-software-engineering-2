package ch.hatbe.juventus.searchandsort;

import ch.hatbe.juventus.object.Person;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private Map<Person, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void addEntry(Person person, String phoneNumber) {
        phoneBook.put(person, phoneNumber);
    }

    public Person findPersonByPhoneNumber(String phoneNumber) {
        for (Map.Entry<Person, String> entry : phoneBook.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return entry.getKey();
            }
        }
        return null;
    }
}
