package ZYUR._24_06_20HW;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2 Создайте класс Фильм с полями title, genre и rating. Создайте список фильмов в main.
 * * Создайте метод, группирующий фильмы по жанрам. Создайте метод, группирующий фильмы по рейтингу.
 * * Создайте метод, который получает топ 10 фильмов по рейтингу в заданной категории.
 */
@ToString
@Getter
@AllArgsConstructor
@Setter
public class Film {
    String title;
    String genre;
    int rating;


}

class Dev {
    public static void main(String[] args) {
        List<Film> filmList = List.of(new Film("title1", "genre1", 4),
                new Film("title2", "genre3", 5),
                new Film("title3", "genre3", 3),
                new Film("title4", "genre3", 33));
        Map<String, List<Film>> map = groupByGenre(filmList);
        for (Map.Entry<String, List<Film>> m : map.entrySet()) {
            System.out.println(m);
        }

        System.out.println("----------------");

        Map<String, List<Film>> map2 = category(filmList);
        for (Map.Entry<String, List<Film>> m : map2.entrySet()) {
            System.out.println(m);
        }

    }

    public static Map<String, List<Film>> groupByGenre(List<Film> filmList) {
        return filmList.stream().collect(Collectors.groupingBy(e -> e.getGenre()));
    }

    //Создайте метод, который получает топ 10 фильмов по рейтингу в заданной категории.
    public static Map<String, List<Film>> category(List<Film> filmList) {
        Map<String, List<Film>> a = filmList.stream()
                .sorted((x, y) -> x.rating - y.rating)
                .collect(Collectors.groupingBy(e -> e.getGenre()));
        return a;
    }
}
