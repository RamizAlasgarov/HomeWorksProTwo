package ZYUR._2024_06_30;

import java.util.Arrays;

/**
 * 2 Используя лямбда-выражения, создайте потоки, каждый из которых 10_000 раз выводит в консоль число
 * – свой номер по порядку запуска. Запустите в цикле 10 потоков.
 * Выводятся ли потоки по порядку? Что будет если добавить задержку запуска, равную 1 мс?
 */
public class TaskTwo {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> Arrays.stream(new Object[10_000]).forEach(e -> System.out.println(finalI)));
            Thread.sleep(1000);
            thread.start();
        }
    }
}
