package _2024_06_14.model;

public interface ProductInterface {
    boolean addProduct(Product product);

    void removeProduct(int productId);

    Product findProduct(int productId);
}
