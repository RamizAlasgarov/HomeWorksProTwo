package ZYUR._24_06_20HW;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Дан список событий с полями name и date. Найдите ближайшее к текущей дате событие.
 */
public class Task4 {
    public static void main(String[] args) {
        List<Time> times = List.of(new Time("john Week", "2024,05,30"),
                new Time("john Week2", "2024,05,30"),
                new Time("john Week3", "2024,06,31"));
        DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        List<Integer> strings = times.stream().map(d -> LocalDate.parse((CharSequence) times, form))
                .map(e -> e.getDayOfMonth()).collect(Collectors.toList());
        System.out.println(strings);
    }
}

record Time(String name, String date) {

}
