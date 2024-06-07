package _24_06_05;

public class Storage {
    Node head;

    public void append(int value) {
        Node item = new Node();
        item.value = value;
        if (head == null) {
            head = item;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = item;
        }
    }

    @Override
    public String toString() {
        Node cur = head;
        StringBuilder stringBuilder = new StringBuilder();
        while (cur.next != null) {
            stringBuilder.append(cur + " ");
            cur = cur.next;
        }

        stringBuilder.append(cur);

        return stringBuilder.toString();

    }
}

