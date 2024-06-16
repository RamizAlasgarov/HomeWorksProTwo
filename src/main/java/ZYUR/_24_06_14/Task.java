package ZYUR._24_06_14;

import lombok.AllArgsConstructor;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * 1 Создайте список чисел и используйте Stream API, чтобы отфильтровать только четные числа.
 * 2 Создайте список строк и используйте Stream API, чтобы создать новый список, где каждая строка будет в верхнем регистре.
 * 3 Создайте список строк и используйте Stream API для сортировки строк в алфавитном порядке.
 * 4 Создайте список чисел и используйте Stream API, чтобы получить первые три элемента, а затем пропустить следующие два.
 * 5 Создайте список строк и используйте Stream API, чтобы найти первую строку, начинающуюся с определенной буквы.
 * 6  Создайте список объектов с числовым полем и используйте Stream API для вычисления суммы этих числовых полей.
 */
public class Task {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 6, 7, 8);
        List<Integer> filtred = list.stream()
                .filter(n -> n % 2 > 0)
                .toList();
        System.out.println(filtred);

        List<String> str = List.of("unit", "test", "mockito");
        List<String> upperCase = str.stream()
                .map(s -> s.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
        System.out.println(upperCase);

        List<String> sorted = str.stream()
                .sorted()
                .toList();
        System.out.println(sorted);

        List<String> sortedByLength = str.stream()
                .sorted(Comparator.comparingInt(String::length))
                .toList();
        System.out.println(sortedByLength);
        List<String> sortedByLengthAndAbc = str.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()))
                .toList();
        System.out.println(sortedByLengthAndAbc);

        System.out.println(list.stream().limit(3).skip(2).collect(Collectors.toList()));

        System.out.println(str.stream().filter(s -> s.startsWith("t")).findFirst().orElseThrow());

        /**
         * 5
         */
        List<String> stringList = List.of("privet", "kak dela", "ok", "poka");
        System.out.println(stringList.stream().filter(e -> e.startsWith("p")).findFirst().orElseThrow());

        /**
         * 6
         */
        Salary numbers = new Salary(1);
        Salary numbers1 = new Salary(3);
        Salary numbers2 = new Salary(4);
        List<Salary> numbersList = List.of(numbers, numbers1, numbers2);
        System.out.println(numbersList.stream().map(salary -> salary.emount).reduce((s1, s2) -> s1 + s2));
    }

    @AllArgsConstructor
    private static class Salary {
        int emount;
    }
}
