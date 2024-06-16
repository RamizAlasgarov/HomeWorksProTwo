package ZYUR._24_06_16.products;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 3 Дан список товаров с полями productId, category, manufacturer, amount, discount, quantityOfSaled.
 * * Создайте метод, проверяющий, есть ли товары в заданной категории.
 * * Создайте метод, который находит заказы со скидкой больше заданного значения и подсчитает их количество.
 * * Найдите productId, который продается чаще всего. Создайте Map, где ключ - это manufacturer,
 * * а значение - список товаров этого производителя.
 */
public class TaskTwo {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product(1, Category.FOOD, "brand1", 34, 10, 12),
                new Product(2, Category.CLOTHES, "brand1", 3234, 40, 144),
                new Product(3, Category.ELECTRONICS, "brand3", 3124, 30, 132),
                new Product(4, Category.DRINKS, "brand4", 123, 20, 112)
        );


    }

    /**
     * @param category
     * @param products
     * @return Создайте метод, проверяющий, есть ли товары в заданной категории.
     */
    private static boolean isEmptyByCategory(Category category, List<Product> products) {
        return products.stream().map(product -> product.category()).filter(c -> c.equals(category)).findAny().isEmpty();
    }

    private static int findDiscountProducts(int maxDiscountLimit, List<Product> products) {
        return products.stream().filter(p -> p.discount() > maxDiscountLimit).mapToInt(Product::amount).sum();
    }

    private static int findBestSellerID(List<Product> products) {
        return products.stream().max(Comparator.comparing(Product::quantityOfSold)).orElseThrow().productId();
    }

    private static Map<String, List<Product>> getManufacturerToProduct(List<Product> products) {
        return products.stream().collect(Collectors.groupingBy(Product::manufacturer));
    }
}
