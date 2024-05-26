package _24_05_24;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int[] array = {1,2,0,9,12,0};
        System.out.println(Arrays.toString(sortedNullOnEnd(array)));
    }
    public static int[] sortedNullOnEnd(int[] array){
        int counter = 0;
        int[] notZeroArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                notZeroArray[counter] = array[i];
                counter++;
            }
        }
        return notZeroArray;
    }

    public static int[] getMyArray(){
        Random random = new Random();
        System.out.println("napishite dlinnu massiva");
        int[] arr = new int[random.nextInt()];
         return arr;
    }

}
