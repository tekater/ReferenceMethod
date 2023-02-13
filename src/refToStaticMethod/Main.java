package refToStaticMethod;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Основная форма - ClassName :: staticMethodName
        // Ссылка на статичный метод
        Function<Double, Double> sqrt = Math :: sqrt;
        System.out.println("Первый метод: " + sqrt.apply(100.0d));
        // лямбда выражение
        Function<Double, Double> sqrtLambda = x -> Math.sqrt(x);
        System.out.println("\nВторой метод: " + sqrtLambda.apply(100.0d));

    }
}
