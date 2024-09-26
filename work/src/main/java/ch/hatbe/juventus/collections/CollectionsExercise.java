package ch.hatbe.juventus.collections;

import ch.hatbe.juventus.object.Person;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionsExercise {

    public static void main(String[] args) {
        //arrayList();
        //linkedList();
        //hashSet();
        //linkedHashSet();
        //treeSet();
        //hashMap();
        //linkedHashMap();
        treeMap();
    }

    static void arrayList() {
        // TODO: Erstelle eine ArrayList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        List<String> animals = new ArrayList<>();
        animals.add("Hund");
        animals.add("Katze");
        animals.add("Maus");

        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println(animals.size());

        // TODO: Füge ein weiteres Element mit Index 2 hinzu.
        animals.add(2, "Ameise");

        // TODO: Gib die ganze Liste auf der Konsole aus.
        System.out.println(animals);

        // TODO: Prüfe ob ein bestimmtes Element in der Liste vorkommt.
        System.out.println(animals.contains("hans"));

        // TODO: Ein Element lesen via Index.
        System.out.println(animals.get(2));

        // TODO: Ein Element löschen via Index
        animals.remove(2);

        // TODO: Ein Element löschen via String
        animals.remove("hans");

        // TODO: Ein Element löschen via Index, das es nicht gibt (was passiert?)
        //animals.remove(999);

        // TODO: Ein Element löschen via String, das es nicht gibt (was passiert?)
        //animals.remove("hans");

        // TODO: Alle Elemente aus der Liste löschen
        animals.clear();
    }

    static void linkedList() {
        // TODO: Erstelle eine LinkedList von Strings und füge 5 Tiere hinzu ("Hund", "Katze", "Maus", ...)
        List<String> animals = new LinkedList<>();
        animals.add("Maus");
        animals.add("Katze");
        animals.add("Hund");

        // TODO: Gib die Anzahl Einträge auf der Konsole aus.
        System.out.println(animals.size());

        // TODO: Den Index eines bestimmten Elements finden
        System.out.println(animals.contains("maus"));

        // TODO: Den Index eines Elements das nicht existiert finden (was passiert?)
        System.out.println(animals.contains("hans"));

        // TODO: Ein Element via Index lesen
        System.out.println(animals.get(1));

        // TODO: Das erste und letzte Element der Liste ausgeben
        System.out.println(animals.getFirst());

        // TODO: Das erste und letzte Element der Liste löschen
        System.out.println(animals.getLast());
    }

    static void hashSet() {
        // TODO: Erstelle ein HashSet von Personen (object package)
        Set<Person> persons = new HashSet<>();

        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        persons.add(new Person("hans", "peter", null, 22, false));
        persons.add(new Person("hans2", "peter", null, 22, false));
        persons.add(new Person("hans3", "peter", null, 22, false));
        persons.add(new Person("hans4", "peter", null, 22, false));

        // TODO: Prüfe, ob das Set nicht leer ist
        System.out.println(persons.isEmpty());

        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println(persons.size());

        // TODO: Prüfe, ob ein gewisses Element im Set existiert
        System.out.println(persons.contains(new Person("hans", "peter", null, 22, false)));

        // TODO: Lösche ein bestimmtes Element aus dem Set
        System.out.println(persons.remove(new Person("hans", "peter", null, 22, false)));

        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        System.out.println(persons);
        System.out.println(persons);
        System.out.println(persons);
    }

    static void linkedHashSet() {
        // TODO: Erstelle ein LinkedHashSet von Personen (object package)
        Set<Person> persons = new LinkedHashSet<>();

        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        persons.add(new Person("hans", "peter", null, 22, false));
        persons.add(new Person("hans2", "peter", null, 22, false));
        persons.add(new Person("hans3", "peter", null, 22, false));
        persons.add(new Person("hans4", "peter", null, 22, false));

        // TODO: Prüfe, ob das Set nicht leer ist
        System.out.println(persons.isEmpty());

        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println(persons.size());

        // TODO: Gib das gesamte Set mehrmals auf der Konsole aus. Wie ist die Reihenfolge der Elemente?

        System.out.println(persons);
        System.out.println(persons);
        System.out.println(persons);
        System.out.println(persons);
        System.out.println(persons);
        System.out.println(persons);
        System.out.println(persons);
    }

    static void treeSet() {
        // TODO: Erstelle ein TreeSet von Personen (object package) und verwende den PersonComperator
        Set<Person> persons = new TreeSet<>((Person p1, Person p2) -> {
            return p1.equals(p2) ? 0 : Integer.compare(p1.getAge(), p2.getAge());
        });

        // TODO: Füge mehrere Personen ein, auch doppelte (verschiedene Objekte mit gleichen Werten)
        persons.add(new Person("hans", "peter", null, 22, false));
        persons.add(new Person("hans2", "peter", null, 32, false));
        persons.add(new Person("hans3", "peter", null, 442, false));
        persons.add(new Person("hans4", "peter", null, 224444, false));

        // TODO: Gib die Länge des Sets aus (doppelte Personen?)
        System.out.println(persons.size());

        // TODO: Gib das gesamte Set auf der Konsole aus. Wie ist die Reihenfolge der Elemente?
        System.out.println(persons);
    }

    static void hashMap() {
        // TODO: Erstelle eine HashMap (Key: String; Value: List<Person>)
        Map<String, ArrayList<Person>> map = new HashMap<>();

        // TODO: Füge folgende Einträge in die Map:
        //  ­ "family" : Liste von 3 Personen
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("hans4", "peter", null, 224444, false));
        persons.add(new Person("hans4", "peter", null, 224444, false));


        map.put("family", persons);
        //  ­ "office" : null
        map.put("office", null);

        //  ­ "friends" : Liste von 3 Personen
        map.put("friends", persons);

        // TODO: Gib die gesamte Map auf der Konsole aus
        System.out.println(map);

        // TODO: Füge einen weiteren Eintrag "office" : Liste von 2 Personen der Map hinzu.
        map.put("office", persons);

        //  (Wieviele Einträge sind jetzt in der Map?)
        // TODO: Gib das entrySet auf der Konsole aus
        System.out.println(map.entrySet());
        // TODO: Gib das keySet auf der Konsole aus
        System.out.println(map.keySet());
        // TODO: Gib die values auf der Konsole aus
        System.out.println(map.values());
    }

    static void linkedHashMap() {
        // TODO: Erstelle eine LinkedHashMap (Key: Integer; Value: Person) mit Access-Order
        Map<Integer, Person> persons = new LinkedHashMap<>(5, 0.75F, true);
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        persons.put(1, new Person("hans1", "peter", null, 224444, false));
        persons.put(2, new Person("hans2", "peter", null, 224444, true));
        persons.put(3, new Person("hans3", "peter", null, 224444, false));

        // TODO: Gib die gesamte Map auf der Konsole aus
        System.out.println(persons);

        // TODO: Greife auf mehrere Elemente zu
        System.out.println(persons.get(1));
        System.out.println(persons.get(2));
        System.out.println(persons.get(3));
        // TODO: Gib die Map erneut aus und überprüfe die Sortierung
        System.out.println(persons);
    }

    static void treeMap() {
        // TODO: Erstelle eine TreeMap (Key: Integer; Value: Person)
        Map<Integer, Person> persons = new TreeMap<>();
        // TODO: Fülle 5 Einträge ein (auch doppelte Keys, um zu überprüfen, dass der Value überschrieben wird)
        persons.put(3, new Person("hans1", "peter", null, 224444, false));
        persons.put(2, new Person("hans2", "peter", null, 224444, true));
        persons.put(373272737, new Person("hans3", "peter", null, 224444, false));

        // TODO: Gib die gesamte Map auf der Konsole aus und überprüfe die Sortierung
        System.out.println(persons);
    }

}