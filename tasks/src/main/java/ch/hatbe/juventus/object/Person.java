package ch.hatbe.juventus.object;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private Address address;
    private int age;
    private boolean hasPet;

    public Person(String firstName, String lastName, Address address, int age, boolean hasPet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.hasPet = hasPet;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return String.format("Person{firstName: %s, lastName: %s, address: %s, age: %s, hasPet: %s}", firstName, lastName, address, age, hasPet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && hasPet == person.hasPet && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, address, age, hasPet);
    }
}
