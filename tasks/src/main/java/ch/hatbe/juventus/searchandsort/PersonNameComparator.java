package ch.hatbe.juventus.searchandsort;

import ch.hatbe.juventus.object.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        int firstNameComparison = p1.getFirstName().compareTo(p2.getFirstName());

        if (firstNameComparison == 0) {
            return p1.getLastName().compareTo(p2.getLastName());
        }

        return firstNameComparison;
    }
}