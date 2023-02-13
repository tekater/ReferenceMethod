package refConstructor;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // ClassName :: new
        Function<String, Person> personGenerator = Person :: new;
        Person player1 = personGenerator.apply("Jin Kazama");

        // лямбда выражение
        Function<String, Person> personGeneratorLambda = name -> new Person(name);
        System.out.println();
    }
}
