package _2024_06_17;

import java.util.Arrays;

public class Jewelery {
    public static void main(String[] args) {

        String jS = "aIb";
        String set = "jHaaivyIilkfbgtB";


        int[] count = new int[jS.length()];

        for (int i = 0; i < set.length(); i++) {
            if (jS.contains(String.valueOf(set.charAt(i)))) {               // s 1 ciklom
                count[jS.indexOf(set.charAt(i))]++;
            }


        }

//        for (int i = 0; i < jS.length(); i++) {                       s 2 ciklami
//            for (int j = 0; j < set.length(); j++) {
//                if (jS.charAt(i) == set.charAt(j)) {
//                    count[i]++;
//                }
//            }
//        }


        System.out.println(Arrays.toString(count));
    }
}


