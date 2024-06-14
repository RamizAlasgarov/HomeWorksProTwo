package _2024_06_14.model;


import lombok.Getter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ProductApp implements ProductInterface {
    Set<Integer> idSet = new HashSet<>();
    @Getter
    private ArrayList<Product> productArrayList = new ArrayList<>();

    @Override
    public boolean addProduct(Product product) {
        if (idSet.add(product.getId())) {
            productArrayList.add(product);
            return true;
        } else {
            System.err.println("id :" + product.getId() + " sushestvuyet");
            return false;
        }

    }

    @Override
    public void removeProduct(int productId) {
        idSet.remove(findProduct(productId).getId());
        productArrayList.remove(findProduct(productId));
    }

    @Override
    public Product findProduct(int productId) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getId() == productId) {
                return productArrayList.get(i);
            }
        }
        return null;
    }

}
