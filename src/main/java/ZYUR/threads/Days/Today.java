package ZYUR.threads.Days;

import java.time.LocalDate;

public class Today {
    MyDate today;

    public synchronized MyDate getToday() {
        return today;
    }

    public synchronized void getFromServer() {
        System.out.println("podklucayus k serveru");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        LocalDate current = LocalDate.now();
        today = new MyDate(current.getYear(), current.getMonthValue(), current.getDayOfMonth());
        System.out.println("segodnashnaya data " + today);
    }
}
