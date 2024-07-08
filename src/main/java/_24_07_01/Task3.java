package _24_07_01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * ### Часть 3
 * 1. Преобразовать список словарей в список строк JSON, содержащих определенные ключи.
 * 2. Отфильтровать список строк так, чтобы остались только строки, которые являются палиндромами.
 * 3. Преобразовать список предложений в список кортежей (число слов, предложение).
 * 4. Отфильтровать список сложных структур данных (например, деревьев) так,
 * чтобы остались только те, у которых определенное свойство имеет определенное значение.
 */
public class Task3 {
    public static void main(String[] args) {
        /**
         * 1. Преобразовать список словарей в список строк JSON, содержащих определенные ключи.
         */
        Map<String, List<String>> wordToList = new HashMap<>();
        wordToList.put("p", List.of("privet", "prava", "poka"));
        wordToList.put("a", List.of("arbuz", "ananas", "antrikot"));
        wordToList.put("v", List.of("vala", "valium", "value"));
        wordToList.put("kluch 3", List.of("элемент1", "элемент2", "элемент3"));
        System.out.println(getJson(wordToList));
        /**
         * 2. Отфильтровать список строк так, чтобы остались только строки, которые являются палиндромами.
         **/
        List<String> words = Arrays.asList("madam", "kaak", "orel");
        List<String> resul = words.stream().filter(Task3::isPalindrome).collect(Collectors.toList());
        System.out.println(resul);
    }

    static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            char first = s.charAt(i);
            char last = s.charAt(s.length() - 1 - i);
            if (first != last) {
                return false;
            }

        }
        return true;
    }

    static String getJson(Map<String, List<String>> el) {
        String res = "{";
        for (Map.Entry<String, List<String>> item : el.entrySet()) {
            String pair = "\"" + item.getKey() + "\": [";
            for (int i = 0; i < item.getValue().size(); i++) {
                pair += "\"" + item.getValue().get(i) + "\",";
            }
            pair = pair.substring(0, pair.length() - 1);
            res += pair + "],";
        }
        return res.substring(0, res.length() - 1) + "}";
    }
}
