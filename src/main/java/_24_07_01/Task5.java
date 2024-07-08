package _24_07_01;

import java.util.List;

/**
 * 5.
 * <p>
 * <p>
 * 8. Проверить, все ли элементы списка удовлетворяют определенному условию.
 * 9. Объединить несколько списков в один.
 * 10. Отсортировать список строк.
 * 11. Преобразовать список строк в мапу, где ключом будет строка, а значением - длина строки.
 */
public class Task5 {
    public static void main(String[] args) {
        /**
         * 4. Преобразовать список строк в верхний регистр.
         */
        List.of("privet", "kak dela", "ok", "poka")
                .stream()
                .map(e -> e.toUpperCase())
                .forEach(System.out::println);
        System.out.println("--------------------------------------");
        /**
         * 4 Найти максимальный элемент в числовом списке.
         */
        System.out.println(List.of(1, 2, 6, 4, 5).stream().max((x, e) -> x - e).get());
        System.out.println("--------------------------------------");

        /**
         * 6. Убрать дубликаты из списка.
         */
        List.of("privet", "kak dela", "ok", "poka", "privet").stream()
                .distinct()
                .forEach(e -> System.out.println(e));
        System.out.println("--------------------------------------");
        /**
         * 7. Выбрать первые N элементов списка.
         */
        List.of("privet", "kak dela", "ok", "poka", "privet").stream()
                .limit(2).forEach(e -> System.out.println(e));
    }
}
