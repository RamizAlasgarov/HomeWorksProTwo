package ZYUR._24_06_16.products;

public record Product(int productId,
                      Category category,
                      String manufacturer,
                      int amount,
                      int discount,
                      int quantityOfSold) {
}
