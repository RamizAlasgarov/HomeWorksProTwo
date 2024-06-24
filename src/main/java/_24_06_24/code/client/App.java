package _24_06_24.code.client;

import _24_06_24.code.Environment;
import _24_06_24.code.core.mvp.Presenter;
import _24_06_24.code.core.mvp.View;
import _24_06_24.code.seed.Data;
import _24_06_24.code.ui.ConsoleView;

import java.util.Scanner;


public class App {
    public static void ButtonClick() {
        Data.seed(Environment.path);

        System.out.print("\033[H\033[J"); // https://ru.stackoverflow.com/questions/1315049/Как-очистить-консоль-в-java-во-время-действия-программы
        View view = new ConsoleView();
        Presenter presenter = new Presenter(view, Environment.path);
        presenter.LoadFromFile();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println(" 1 - prev  2 - next , 3 - delete contact, 4 add contact");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        presenter.prev();
                        break;
                    case "2":
                        presenter.next();
                        break;
                    case "3":
                        presenter.remove();
                        break;
                    case "4":
                        presenter.add();
                        break;
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }
    }
}
