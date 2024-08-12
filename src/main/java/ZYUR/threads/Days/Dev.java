package ZYUR.threads.Days;

import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

public class Dev {
    public static void main(String[] args) {
        Today today = new Today();
        Runnable runnable = () -> {
            synchronized (today) {
                MyDate currentDay = Optional.ofNullable(today.getToday()).orElseGet(() -> {
                    today.getFromServer();
                    return today.getToday();
                });

                currentDay.setYear(currentDay.getYear() + ThreadLocalRandom.current().nextInt(4));
                System.out.println(currentDay);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
