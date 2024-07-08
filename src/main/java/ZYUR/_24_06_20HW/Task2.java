package ZYUR._24_06_20HW;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 3 Дан список дат. Преобразуйте его в список дней недели.
 */
public class Task2 {
    public static void main(String[] args) {

        List<String> dates = List.of("1994-06-11", "2023-12-25", "2024-01-01");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");


        List<DayOfWeek> daysOfWeek = dates.stream()
                .map(date -> LocalDate.parse(date, formatter))
                .map(localDate -> localDate.getDayOfWeek())
                .collect(Collectors.toList());


        System.out.println(daysOfWeek);
    }

}
