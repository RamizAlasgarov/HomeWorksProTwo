package _24_06_28;

import java.util.Arrays;

public class TaskOne {
    public static void main(String[] args) {
        String[] arrayString = new String[]{"privet", "kak dela", "ok ", "poka"};
        System.out.println(Arrays.toString(doIt(arrayString, data -> {
            int[] arr = new int[data.length];
            for (int i = 0; i < data.length; i++) {
                arr[i] = data[i].length();
            }
            return arr;
        })));
    }

    public static int[] doIt(String[] strings, Processor pr) {
        return pr.res(strings);
    }
}

@FunctionalInterface
interface Processor {
    int[] res(String[] data);
}
