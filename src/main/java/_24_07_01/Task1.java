package _24_07_01;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class Task1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12, 443, 63, 54, 541);
        List<String> words = Arrays.asList("privet", "kak dela", "ok ", "poka", "privet");
        /**
         * 1. Преобразовать список чисел в список строк.
         */
        List<String> stringList = integerList.stream().map(e -> e.toString()).collect(Collectors.toList());
        System.out.println(stringList);
        /**
         * 2. Отфильтровать список чисел так, чтобы остались только четные числа.
         */
        integerList.stream().filter(e -> e % 2 == 0).forEach(System.out::println);
        /**
         * 3. Преобразовать список строк в список их длин.
         */
        stringList.stream().map(e -> e.length()).forEach(System.out::println);
        /**
         *  4. Отфильтровать список строк так, чтобы остались только строки, начинающиеся с определенной буквы.
         */
        words.stream().filter(e -> e.startsWith("p")).forEach(e -> System.out.println(e));
        /**
         * 5. Преобразовать список дат в список строк в формате "год-месяц".
         */
        List<Integer> dates = Arrays.asList(11061990, 11032022, 21091999);
        dates.stream().map(e -> e.toString()).forEach(e -> System.out.println(e));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    }
}
