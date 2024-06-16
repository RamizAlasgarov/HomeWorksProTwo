package ZYUR._24_06_16;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1 Дан список строк. Подсчитайте общее количество слов во всех строках.
 * 2 Дан список объектов с полем group и value. Создайте Map,
 * где ключ - это group, а значение - максимальное value в этой группе.
 */
public class Task {
    public static void main(String[] args) {
        /**
         * 1
         */
        List<String> lines = Arrays.asList(("""
                /**
                 * 1 Дан список строк. Подсчитайте общее количество слов во всех строках.
                 * 2 Дан список объектов с полем group и value. Создайте Map,
                 * где ключ - это group, а значение - максимальное value в этой группе.
                 * 3 Дан список товаров с полями productId, category, manufacturer, amount, discount, quantityOfSaled.
                 * Создайте метод, проверяющий, есть ли товары в заданной категории.
                 * Создайте метод, который находит заказы со скидкой больше заданного значения и подсчитает их количество.
                 * Найдите productId, который продается чаще всего. Создайте Map, где ключ - это manufacturer,
                 * а значение - список товаров этого производителя.
                 * 4 Создайте перечисление статусов (SUCCESS, RJECTED, FAILED, PROCESSING).
                 * Создайте поле code типа int  в перечислении. SUCCESS соответствует код 200,
                 * RJECTED – код 400, FAILED – код 500, PROCESSING – код 999.
                 * Создайте метод, который находит элемент перечисление по коду.
                 * Если передан неизвестный код, то возвращается пустой Optional.
                 */""").split("\n"));

        System.out.println(lines.stream().mapToInt(line -> line.split(" ").length).sum());


        /**
         * 2 Дан список объектов с полем group и value. Создайте Map,
         *  * где ключ - это group, а значение - максимальное value в этой группе.
         */
        Groupped groupped1 = new Groupped("1", 1800);
        Groupped groupped2 = new Groupped("1", 1800);
        Groupped groupped3 = new Groupped("21", 200);
        Groupped groupped4 = new Groupped("12", 80);
        Groupped groupped5 = new Groupped("33", 2010);
        List<Groupped> grouppedList = List.of(groupped1, groupped2, groupped3, groupped4, groupped5);
        Map<String, Integer> groupToMax1 = new HashMap<>();
        for (Groupped groupped : grouppedList) {
            Integer current = groupToMax1.get(groupped.group);
            if (current == null) {                                                  // groupToMax1.merge(groupped.group, groupped.value, (a, b) -> a > b ? a : b);
                groupToMax1.put(groupped.group, groupped.value);
            } else {
                groupToMax1.put(groupped.group, current > groupped.value ? current : groupped.value);
            }


        }

        Map<String, Integer> groupToValue = grouppedList.stream().collect(Collectors.groupingBy(groupped -> groupped.group))
                .entrySet().stream().collect(Collectors.toMap(
                        groupToValues -> groupToValues.getKey(), // key
                        groupToValues -> groupToValues.getValue().stream().mapToInt(g -> g.value).max().getAsInt()// value
                ));
        System.out.println(groupToValue);
    }

    record Groupped(String group, int value) {

    }
}

