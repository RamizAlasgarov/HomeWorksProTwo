package ZYUR._24_06_20HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 1 Дан текст. Подсчитайте количество уникальных слов в этом тексте.
 * 2 Создайте класс Фильм с полями title, genre и rating. Создайте список фильмов в main.
 * Создайте метод, группирующий фильмы по жанрам. Создайте метод, группирующий фильмы по рейтингу.
 * Создайте метод, который получает топ 10 фильмов по рейтингу в заданной категории.
 * 3 Дан список дат. Преобразуйте его в список дней недели.
 * 4 Дан список событий с полями name и date. Найдите ближайшее к текущей дате событие.
 * 5 Дан список адресов с полями street, city и zipCode. Создайте список уникальных городов.
 * 6 Дана мапа, где ключ – id задачи, а значение – список записей о работе.
 * Запись о работе содержит id сотрудника и время, затраченное на задачу.
 * Подсчитайте общее время выполнения каждой задачи. Подсчитайте суммарное время выполнения всех задач
 */
public class Task {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>(List.of("privet ok privet poka"));
        String text = "privet ok privet poka";
        Set<String> uniqueWords = Arrays.stream(text.split("[\\s\\p{Punct}]+"))
                .map(String::toLowerCase) // приводим все слова к нижнему регистру для учета регистра
                .collect(Collectors.toSet());
        System.out.println(uniqueWords);
    }

    /**
     * 1 Дан текст. Подсчитайте количество уникальных слов в этом тексте.
     */
    public static Set<String> unique(List<String> list) {
        return list.stream().findAny().stream().collect(Collectors.toSet());
    }
}
