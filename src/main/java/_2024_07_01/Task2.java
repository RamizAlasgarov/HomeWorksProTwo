package _2024_07_01;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task2 {
    /**
     * est list stingov
     * ostavit tolko unikalniye
     * vse to upper case
     * ostavit tolko stringi kotoye < 7
     * vernut mapu u kotorix slovo stinga a znaceniye dlina etoy stringi
     */
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("aa", "aa", "aaa", "fdgcdv", "sdfvc");
        Map<String, Integer> wordToCount = stringList.
                stream().collect(Collectors.toSet())
                .stream().filter(e -> e.length() < 7)
                .map(e -> e.toUpperCase())
                .collect(Collectors.toMap(e -> e, e -> e.length()));
        System.out.println(wordToCount);

    }
}
