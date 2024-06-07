package _24_06_05;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

        System.out.println(reverseList(list));
    }

    public static List<Integer> reverseList(List<Integer> integerList) {
        List<Integer> ex = new ArrayList<>(integerList.size());
        int temp = integerList.size() % 2 == 0 ? 0 : 1;
        int middle = integerList.size() / 2;

        for (int i = 0; i < middle; i++) {
            ex.add(i, integerList.get(i));
        }

        for (int i = middle + temp, j = 0; i < integerList.size(); i++, j++) {
            ex.add(j, integerList.get(i));
        }

        if (temp != 0) {
            ex.add(middle, integerList.get(middle));
        }

        return ex;
    }
}
