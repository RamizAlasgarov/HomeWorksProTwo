package ZYUR._24_07_12Thread;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor

@Setter
@ToString
public class Sossige {
    private int length;

    public synchronized int getLength() {
        return length;
    }

    public synchronized void otkusitSosisku() {
        if (length == 0) {
            throw new IllegalStateException("sosika ne mojet bit otkusana" +
                    " potomucto ona = 0");
        }
        length--;
        System.out.println("dlina sosiski " + length);
    }
}
