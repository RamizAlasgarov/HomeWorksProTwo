package ZYUR._24_06_30;

import java.util.Arrays;

/**
 * Допишите предыдущую программу (10 потоков) так,
 * чтобы у потоков был установлен приоритет в порядке запуска.
 * Задать потоку приоритет можно с помощью метода setPriority(int).
 */
public class TaskThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> Arrays.stream(new Object[10_000]).forEach(e -> System.out.println(finalI)));
            thread.setPriority(i);
            System.out.println("prioritet potoka " + i + " - " + thread.getPriority());
            thread.start();
        }
    }
}