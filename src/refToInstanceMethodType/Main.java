package refToInstanceMethodType;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Основная форма - className :: instanceMethodName
        // Ссылка на экземпляр метода объект определённого типа
        // В этом случае нам необходимо отправить экземпляр класса как аргумент функции
        Function<Long, Double> converter = Long :: doubleValue;
        System.out.println(converter.apply(100L));

        // лямбда выражение
        Function<Long, Double> converterLambda = val -> val.doubleValue();
        System.out.println(converterLambda.apply(1000L));
    }
}
