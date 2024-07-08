package _2024_07_01;

import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        /**
         * Фильтрация чисел больше 5 и вывод в порядке убывания
         */
        List<Integer> integers = Arrays.asList(12, 45, 67, 76, 5, 4, 3, 2);
        integers.stream().filter(e -> e > 5).sorted((x, y) -> y - x).forEach(e -> System.out.println(e));
    }
}
