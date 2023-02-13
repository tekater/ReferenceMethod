package refToInstanceMethodObject;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Основная форма - ObjectName :: InstanceMethodName
        // ссылка на метод экземпляра объекта

        String whatsGoingOngText = "What`s going on here ?";

        Function<String, Integer> indexWithinString = whatsGoingOngText :: indexOf;
        System.out.println(indexWithinString.apply("going"));

        // Лямбда выражение
        Function<String, Integer> indexWithLambda = string -> whatsGoingOngText.indexOf(string);
        System.out.println(indexWithinString.apply("going"));
    }
}
