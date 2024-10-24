package ch.hatbe.juventus.exceptions;

import ch.hatbe.juventus.object.Person;

public class Appliaction {
    public static void main(String[] args) {

        PersonRepository personRepository = new PersonRepository();
        try {
            Person person = personRepository.findById(1);
        } catch (PersonNotFoundException e) {

            System.out.println("Exception: " + e.getMessage());
        }

        try {
            Person person = personRepository.addPeron(null);
        } catch (IllegalArgumentException e) {
            System.out.println("test12");
        }
    }

}
