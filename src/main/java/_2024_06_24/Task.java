package _2024_06_24;

public class Task {
    public static void main(String[] args) {
        int[][] array = {{0, 1, 2}, {0, 1, 2}, {0, 1, 2}};
        System.out.println(getDiff(array));
    }


    public static int getDiff(int[][] array) {
        int sumLR = 0;
        int sumRL = 0;

//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (i == j) {
//                    sumLR += array[i][j];
//                }
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j >= 0; j--) {
//                if (i + j == array.length - 1)
//                    sumRL += array[j][i];
//            }
//        }

        for (int i = 0; i < array.length; i++) {
            sumLR += array[i][i];
            sumRL += array[array.length - 1 - i][i];

        }
        return Math.abs(sumRL - sumLR);
    }

}
