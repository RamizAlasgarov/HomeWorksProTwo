package ZYUR._24_09_06;

import java.util.List;

/**
 * 1 Создайте список чисел. С помощью метода forEach выведите каждое число в консоль по модулю.
 */
public class Task {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, -2, 3, -4, 5);
        list.forEach(e -> System.out.println(Math.abs(e)));
    }
}
