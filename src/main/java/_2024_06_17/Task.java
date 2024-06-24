package _2024_06_17;

public class Task {
    public static void main(String[] args) {
        ListNode item1 = new ListNode(1);
        ListNode item2 = new ListNode(2);
        ListNode item3 = new ListNode(3);
        ListNode item4 = new ListNode(4);

        item1.next = item2;
        item2.next = item3;
        item3.next = item4;
        item4.next = item2;

        System.out.println(ListNode.isCircle(item1));

    }
}


class ListNode {
    int value;
    ListNode next;

    public ListNode(int value) {
        this.value = value;
    }

    public static boolean isCircle(ListNode listNode) {
        ListNode first = listNode;
        ListNode second = listNode.next;
        while (first != second) {
            if (first == null || second.next == null) {
                return false;
            }
            first = first.next;
            second = second.next.next;


        }
        return true;
    }
}
