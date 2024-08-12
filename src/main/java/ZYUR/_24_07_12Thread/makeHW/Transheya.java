package ZYUR._24_07_12Thread.makeHW;

import lombok.AllArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;

/**
 * 1 Создайте класс Траншея. У траншеи есть целевая длина и текущая длина.
 * Создайте класс Землекоп, объекты которого копают траншею (увеличивают текущую длину),
 * пока не будет достигнута целевая длина. Каждый землекоп может прокопать 1 м траншеи,
 * а затем он отдыхает 10 секунд. В программе создайте траншею и двух землекопов. Измерьте,
 * за какое время траншею прокопает один землекоп и за какое время с такой же траншеей управятся двое.
 */

@AllArgsConstructor
@Setter
public class Transheya {
    private int celevayaDlina;


    public synchronized int getTekushayaDlina() {

        return celevayaDlina;
    }

    public synchronized void kopayem() {
        if (celevayaDlina == 0) {
            System.err.println("zakoncili kopat " + LocalTime.now());
            throw new IllegalStateException("cel dostignuta");
        }
        celevayaDlina--;
    }

}
