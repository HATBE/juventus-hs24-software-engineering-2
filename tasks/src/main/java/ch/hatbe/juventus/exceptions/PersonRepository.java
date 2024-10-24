package ch.hatbe.juventus.exceptions;

import ch.hatbe.juventus.object.Person;

public class PersonRepository {
    public Person findById(int id) throws PersonNotFoundException {
        throw new PersonNotFoundException("TEST");
    }

    public Person addPeron(Person p) throws IllegalArgumentException {
        throw new IllegalArgumentException("FALSCH");
    }
}
