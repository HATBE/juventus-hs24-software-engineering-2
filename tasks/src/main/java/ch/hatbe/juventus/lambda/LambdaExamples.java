package ch.hatbe.juventus.lambda;

import ch.hatbe.juventus.object.Person;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaExamples {
    public static void main(String[] args) {
        // übung 1
        Function<LocalDate, String> dateToString = date -> "Jetzt ist " + date;
        System.out.println(dateToString.apply(LocalDate.now()));

        // übung 2
        MathOperation addition = Integer::sum;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println(operate(5, 5, addition));
        System.out.println(operate(10, 10, subtraction));
        System.out.println(operate(15, 15, multiplication));
        System.out.println(operate(20, 20, division));

        // Java Stream API übung 1
        List<List<Integer>> input = List.of(
                List.of(1, 2, 3, 4, 5),
                List.of(3, 4, 5, 6, 7)
        );

        List<Integer> output = input.stream()
                .flatMap(Collection::stream)
                .map(n -> n * 2)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(output);

        // Stream API Übung 2
        List<Person> persons = List.of(
                new Person("Aaron", "Hansen", null, 22, true),
                new Person("Hans", "Aaronson", null, 22, true),
                new Person("Peter", "Peterson", null, 22, true)
        );

        boolean allOlderThan18 = persons.stream()
                .filter(person -> !person.getFirstName().toLowerCase().startsWith("a"))
                .map(Person::getAge)
                .allMatch(age -> age > 18);

        System.out.println(allOlderThan18);

        // optionals
        List<String> list = List.of("a", "b", "c", "d");

        Optional<String> res = list.stream()
                .filter(c -> c.equals("b"))
                .findAny();

        System.out.println(res.orElse("not found"));

        Optional<String> res2 = list.stream()
                .filter(c -> c.equals("z"))
                .findAny();

        System.out.println(res2.orElse("not found"));
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operate(a, b);
    }
}
