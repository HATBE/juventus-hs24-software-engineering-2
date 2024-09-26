package ch.hatbe.juventus.object;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Sonnenstrasse", 2, 8200, "Schaffhausen");
        Person person = new Person("Aaron", "Gensetter", address, 22, true);

        Address address2 = new Address("Sonnenstrasse", 2, 8200, "Schaffhausen");
        Person person2 = new Person("Aaron", "Gensetter", address2, 22, true);

        System.out.println(person.equals(person2));
    }
}