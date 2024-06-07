package _24_06_05;

public class Node {

    public int value;
    public Node next;

    @Override
    public String toString() {
        return String.valueOf(value);

    }
}

class Ex {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.append(2000);
        storage.append(2020);
        storage.append(2200);
        storage.append(1234);
        System.out.println(storage);
    }

}
