package ch.hatbe.juventus.exceptions;

public class PersonNotFoundException extends Throwable {
    public PersonNotFoundException(String message) {
        super(message);
    }
}
