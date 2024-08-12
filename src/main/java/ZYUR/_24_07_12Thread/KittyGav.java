package ZYUR._24_07_12Thread;

/**
 * 1 Котёнок по имени Гав и щенок Шарик едят сосиску с двух сторон.
 * Каждый из них откусывает 1 см сосиски и жуёт её в течении 3 секунд.
 * Учитывая, что длина сосиски 7 см, напишите программу, которая смоделируют данный процесс.
 */
public class KittyGav {
    public static void main(String[] args) {
        Sossige sossige = new Sossige(7);
        Runnable run = () -> {
            String name = Thread.currentThread().getName();
            while (sossige.getLength() > 0) {
                System.out.println(name + " pitayetsa otkusit sosisku");
                sossige.otkusitSosisku();
                System.out.println(name + " juyet sosisku");

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(name + "zakoncil est sosikuu");
        };
        Thread threadGav = new Thread(run, "Koshka_Gav");
        Thread threadKitty = new Thread(run, "Sobaka_Sharik");
        threadGav.start();
        threadKitty.start();

    }
}
