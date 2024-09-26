package ch.hatbe.juventus.object;

import java.io.IOError;
import java.util.Objects;

public class Address {
    private String street;
    private int number;
    private int zip;
    private String city;

    public  Address(String street, int number, int zip, String city) {
        this.street = street;
        this.number = number;
        this.zip = zip;
        this.city = city;
    }

    @Override
    public String toString() {
        return String.format("Address{street: %s, number: %s, zip: %s, city: %s}", street, number, zip, city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number && zip == address.zip && Objects.equals(street, address.street) && Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, zip, city);
    }
}
