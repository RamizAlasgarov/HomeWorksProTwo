package _2024_06_14.view;

import _2024_06_14.model.Product;

import java.util.List;

public class ConsoleView extends View {
    @Override
    public void print(String output) {
        System.out.println(output);
    }

    @Override
    public void printAll(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
