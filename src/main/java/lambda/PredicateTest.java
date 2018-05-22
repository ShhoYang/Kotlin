package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateTest {

    public static void filter(List<String> languages, Predicate<String> condition) {
        Stream<String> stringStream = languages.stream().filter(language -> condition.test(language));
        stringStream.forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "Kotlin", "Python");

        System.out.println("Language start with J:");
        filter(languages, language -> language.startsWith("J"));

        System.out.println();
        System.out.println("Language contains n:");
        filter(languages, language -> language.contains("n"));

        System.out.println();
        System.out.println("Language contains n:");
        filter(languages, language -> language.contains("n"));

        System.out.println();
        System.out.println("Language length 4:");
        filter(languages, language -> language.length() == 4);

        System.out.println();
        System.out.println("Language all:");
        filter(languages, language -> true);

        System.out.println();
        System.out.println("Language none:");
        filter(languages, language -> false);
    }
}
