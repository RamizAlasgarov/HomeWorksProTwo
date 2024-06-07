package _2024_06_07;

import java.util.Scanner;

/**
 * #### 4. Класс `View`
 * Создать класс `View` для взаимодействия с пользователем:
 * - `int getValue(String title)`: метод для получения значения от пользователя.
 * - `void print(int data, String title)`: метод для вывода результата на экран.
 */
public class View {
    Scanner scanner = new Scanner(System.in);

    int getValue(String title) {
        System.out.println("your number");
        return scanner.nextInt();

    }

    void print(int data, String title) {
        System.out.printf(title, data);
    }


}
