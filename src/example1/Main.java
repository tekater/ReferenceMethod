package example1;

import java.util.function.BiFunction;
import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {
        // Ссылка на стандартный статичный метод max обёрточного класса Integer
        BiFunction<Integer, Integer, Integer> max = Integer :: max;
        System.out.println("Первый метод: " + max.apply(7,9));

        IntBinaryOperator max2 = Integer :: max;
        System.out.println("\nВторой метод: " + max2.applyAsInt(2,3));

        // Такая же лямбда выражение
        BiFunction<Integer, Integer, Integer> maxLambda = (x,y) -> Integer.max(x,y);

        // Виды ссылки на метод:
        // 1. Ссылка на статичный метод
        // 2. Ссылка на экземпляр метода уже существующего объекта
        // 3. Ссылка на экземпляр метода объекта определённого типа
        // 4. Ссылка на конструктор
    }
}