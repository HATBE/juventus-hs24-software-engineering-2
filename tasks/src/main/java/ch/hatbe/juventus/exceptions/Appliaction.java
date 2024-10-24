package ch.hatbe.juventus.exceptions;

import ch.hatbe.juventus.object.Person;

public class Appliaction {
    public static void main(String[] args) {

        PersonRepository personRepository = new PersonRepository();
        try {
            Person person = personRepository.findById(1);
        } catch (PersonNotFoundException e) {
            e.printStackTrace();
            System.out.println("Exception: " + e.getMessage());
        }

        Person person = personRepository.addPeron(null);
    }

}
