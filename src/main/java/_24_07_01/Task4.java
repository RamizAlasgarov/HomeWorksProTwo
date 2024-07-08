package _24_07_01;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Посчитать количество элементов в списке.
 */
public class Task4 {
    public static void main(String[] args) {
        /**
         * 1. Найти среднее значение списка чисел.
         */
        List<Integer> integerList = new ArrayList<>(List.of(1, 2, 3, 3, 1));
        integerList.stream()
                .reduce((a, e) -> (a + e))
                .stream()
                .mapToInt(e -> e / integerList.size())
                .forEach(System.out::println);

        /**
         * 2. Отфильтровать список строк по заданному условию.
         */
        List<String> stringList = List.of("privet", "kak dela", "ok", "poka");
        stringList.stream().filter(e -> e.startsWith("p")).forEach(System.out::println);

        /**
         * 3. Посчитать количество элементов в списке.
         */
        List<String> strings = List.of("privet", "kak dela", "ok", "poka");
        System.out.println(strings.stream().count());
    }

}
