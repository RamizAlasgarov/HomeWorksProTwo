package ZYUR._24_06_02.comporator;

import java.util.ArrayList;
import java.util.List;

/**
 * 4 Создайте Comparator для сортировки списка чисел так,
 * чтобы сначала в списке были все нечётные числа по возрастанию, а затем чётные по убыванию.
 */
public class MyComporator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));
        numbers.sort((num1, num2) -> {
            if (num1 % 2 != 0 && num2 % 2 == 0) return -1;
            if (num1 % 2 == 0 && num2 % 2 != 0) return 1;
            if (num1 % 2 != 0) return num1 - num2;
            return num2 - num1;
        });
        System.out.println(numbers);
    }
}
