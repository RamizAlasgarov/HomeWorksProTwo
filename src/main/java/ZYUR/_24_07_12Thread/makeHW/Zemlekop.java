package ZYUR._24_07_12Thread.makeHW;

import java.time.LocalTime;

/**
 * 1 Создайте класс Траншея. У траншеи есть целевая длина и текущая длина.
 * Создайте класс Землекоп, объекты которого копают траншею (увеличивают текущую длину),
 * пока не будет достигнута целевая длина. Каждый землекоп может прокопать 1 м траншеи,
 * а затем он отдыхает 10 секунд. В программе создайте траншею и двух землекопов. Измерьте,
 * за какое время траншею прокопает один землекоп и за какое время с такой же траншеей управятся двое.
 */
public class Zemlekop {
    public static void main(String[] args) throws InterruptedException {
        kopat(1);
        Thread.sleep(40_000);
        System.err.println("=================================");

        kopat(2);
    }

    public static void kopat(int cisloZemlekov) throws InterruptedException {
        Transheya transheya = new Transheya(3);
        Runnable runnable = () -> {
            String name = Thread.currentThread().getName();
            while (true) {
                System.err.println(name + " kopayet");
                transheya.kopayem();
                System.err.println(name + " zakoncil kopat");

                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        System.err.println("nacali kopat " + LocalTime.now());
        for (int i = 0; i < cisloZemlekov; i++) {
            new Thread(runnable, String.valueOf(i)).start();
        }
    }

}
