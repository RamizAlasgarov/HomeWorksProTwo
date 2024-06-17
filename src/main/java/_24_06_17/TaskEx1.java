package _24_06_17;

import java.util.*;

public class TaskEx1 {

    public static void main(String[] args) {
        Map<String, List<String>> wordToWords = new HashMap<>();
        List<String> list = addWordsInList();
        extracted(wordToWords, list);
        print(wordToWords, list);
    }

    private static void print(Map<String, List<String>> wordToWords, List<String> list) {
        System.out.println(list);
        System.out.println(wordToWords);
    }

    private static void extracted(Map<String, List<String>> wordToWords, List<String> list) {
        for (String s : list) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!wordToWords.containsKey(key)) {
                List<String> words = new ArrayList<>();
                words.add(s);
                wordToWords.put(key, words);
            } else {
                wordToWords.get(key).add(s);
            }
        }
    }


    public static List<String> addWordsInList() {
        List<String> list = new ArrayList<>(List.of("eat", "tea", "tan", "ate", "nat", "bat"));
        return list;
    }
}
