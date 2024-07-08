package _24_07_01;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ### Часть 2
 * <p>
 * <p>
 * <p>
 * 4. Отфильтровать список чисел так, чтобы остались только числа, делящиеся на все свои цифры без остатка.
 */
public class Task2 {
    public static void main(String[] args) {
        /**
         *  1. Преобразовать список слов в список их анаграмм.
         */
        List<String> stringList = List.of("privet", "kak dela1", "ok", "ko", "privet");
        Map<String, Long> sortedwords = stringList.stream().
                map(Task2::sorted)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        List<String> anograms = sortedwords.entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
//        System.out.println(anograms);


        /**
         * 2. Отфильтровать список строк так, чтобы остались только строки, содержащие цифры.
         */
        List<String> strings = Arrays.asList("hello", "world123", "test", "456", "no digits here", "1a2b3c");

        List<String> filteredStrings = strings.stream()
                .filter(s -> s.chars().anyMatch(c -> Character.isDigit(c))).collect(Collectors.toList());

//        System.out.println(filteredStrings);

        /**
         * 3 Преобразовать список кортежей (имя, возраст) в список строк с описанием (имя is в возраст год(а/лет)).
         */
        List<NameAndAge> list = new ArrayList<>();
        for (int i = 100; i <= 125; i++) {
            list.add(new NameAndAge("fas", i));
        }
        List<String> stringList1 = list.stream()
                .map(e -> {
                            String res = e.getName() + " " + e.getAge() + " " + Task2.getYearDeclension(e.getAge());
                            return res;
                        }
                )
                .collect(Collectors.toList());

//        System.out.println(stringList1);

        /**
         * 4 Отфильтровать список чисел так, чтобы остались только числа, делящиеся на все свои цифры без остатка.
         */
        List<Integer> integerList = List.of(2, 44, 36, 30, 42);
        List<Integer> resultList = integerList.stream().filter(Task2::isDevided).collect(Collectors.toList());
        System.out.println(resultList);
    }


    /**
     * 1
     */
    static String sorted(String str) {
        char[] c = str.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    /**
     * 2
     */
    static String reverce(StringBuilder str) {
        return str.reverse().toString();
    }


    /**
     * 3
     */
    static String getYearDeclension(int age) {
        String res = "";
        if (age % 10 == 1 && age % 100 != 11) {
            res += "god";
        } else if (age % 10 >= 2 && age % 10 <= 4 && (age % 100 < 12 || age % 100 > 14)) {
            res += "goda";
        } else {
            res += "let";
        }
        return res;
    }

    /**
     * 4 - Отфильтровать список чисел так, чтобы остались только числа, делящиеся на все свои цифры без остатка.
     */
    static boolean isDevided(int number) {
        /**
         * int a = 123 / 100 = 1
         * int b = 123 / 10 % 10 = 2
         * int c = 123 % 100
         *          int sumNumbers1 = number/100;
         *         int sumNumbers2 = number/10%10;
         *         int sumNumbers3 = number%100;
         */
        String s = String.valueOf(number);
        for (char c : s.toCharArray()) {
            int digit = Character.getNumericValue(c);
            if (digit == 0 || number % digit != 0) {
                return false;
            }
        }
        return true;

    }
}

@AllArgsConstructor
@Getter
@Setter
class NameAndAge {
    private String name;
    private int age;
}
