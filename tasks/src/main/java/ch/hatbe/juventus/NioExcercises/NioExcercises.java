package ch.hatbe.juventus.NioExcercises;

import ch.hatbe.juventus.object.Person;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutionException;

public class NioExcercises {
    public static void main(String[] args) {
        try {
            /*NioExcercises.createDirectory("/home/ag/test");
            NioExcercises.createFile("/home/ag/test/test.txt");
            NioExcercises.writeToFile("/home/ag/test/test.txt", "Hello World");
            NioExcercises.renameFile("/home/ag/test/test.txt", "/home/ag/test/test2.txt");
            System.out.println(NioExcercises.checkIfFileExists("/home/ag/test/test2.txt"));
            System.out.println(NioExcercises.getContentOfFile("/home/ag/test/test2.txt"));
            NioExcercises.listAllFilesFromDirectory("/home/ag/test");
            NioExcercises.deleteContentsOfDirectory("/home/ag/test");*/
            NioExcercises.serializePerson();
            NioExcercises.deserializePerson();

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void createDirectory(String path) throws IOException {
        Path directory = Paths.get(path);
        Files.createDirectories(directory);
    }

    private static void createFile(String path) throws IOException {
        Path file = Paths.get(path);
        Files.createFile(file);
    }

    public static void writeToFile(String path, String text) throws IOException {
        Path file = Paths.get(path);
        Files.writeString(file, text);
    }

    public static void renameFile(String path, String newPath) throws IOException {
        Path before = Paths.get(path);
        Path after = Paths.get(newPath);
        Files.move(before, after);
    }

    public static boolean checkIfFileExists(String path) {
        Path file = Paths.get(path);
        return Files.exists(file);
    }

    public static String getContentOfFile(String path) throws IOException {
        Path file = Paths.get(path);
        return Files.readString(file);
    }

    public static void listAllFilesFromDirectory(String path) throws IOException {
        Path directory = Paths.get(path);
        Files.list(directory).forEach(System.out::println);
    }

    public static void deleteContentsOfDirectory(String path) throws IOException {
        Path directory = Paths.get(path);
        Files.list(directory).forEach(file -> {
            try {
                Files.delete(file);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static void serializePerson() throws IOException {
        Person person = new Person("Hans", "Muster", null, 30, false);
        String file = "/home/ag/test/person.ser";
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(person);
        out.close();
    }

    public static void deserializePerson() throws IOException, ClassNotFoundException {
        String file = "/home/ag/test/person.ser";
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Person person = (Person) in.readObject();
        System.out.println(person);
        in.close();
    }
}
