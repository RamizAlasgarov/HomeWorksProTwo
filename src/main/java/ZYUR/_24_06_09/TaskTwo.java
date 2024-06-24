package ZYUR._24_06_09;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 2 Создайте класс Item с полями названия товара и стоимости товара.
 * Создайте мапу, хранящую товар и соответствующее ему число единиц товара.
 * С помощью метода forEach получите все товары, у которых осталось меньше 3 штук.
 */
public class TaskTwo {
    public static void main(String[] args) {
        Item item1 = new Item("banan", 123);
        Item item2 = new Item("apelsin", 32);
        Item item3 = new Item("mango", 23);
        Map<Item, Integer> itemtoCount = Map.of(item1, 23,
                item2, 44,
                item3, 2);
        List<Item> itemList = new ArrayList<>();
        itemtoCount.forEach((k, v) -> {
                    if (v < 3) {
                        itemList.add(k);
                    }
                }
        );
        System.out.println(itemList);

    }
}

@AllArgsConstructor
@Setter
@Getter
@ToString
class Item {
    private String productName;
    private int price;

}
