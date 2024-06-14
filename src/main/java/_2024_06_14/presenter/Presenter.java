package _2024_06_14.presenter;


import _2024_06_14.model.Product;
import _2024_06_14.model.ProductApp;
import _2024_06_14.view.ConsoleView;
import _2024_06_14.view.View;
import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

@Getter
@Setter
public class Presenter {
    private View view;
    private ProductApp productApp;

    public Presenter() {
        this.view = new ConsoleView();
        this.productApp = new ProductApp();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            this.view.print("1 dobavit tovar \n2 udalit tovar\n3 nayti tovar\n4vivesti tovar");
            switch (scanner.nextInt()) {
                case 1:
                    new ProductApp().addProduct(addPRoduct());
            }
        }
    }

    Product addPRoduct() {
        Faker faker = new Faker();
        return new Product(new Random().nextInt(), faker.name().firstName());

    }

}
