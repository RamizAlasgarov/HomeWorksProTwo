package _24_07_29;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * **Описание:**
 * ч1. Напишите программу, которая проверяет, является ли строка валидным IPv4-адресом.
 * <p>
 * Обратите внимание: у IPv4 могут быть нули, т е 5.255.255.242, 05.255.255.242 и 005.255.255.242 - это фактически один и тот же IP
 */
public class RegEx4 {
    public static void main(String[] args) {
        String s = "5.255.255.242 245.255.255.242";
        Pattern pattern = Pattern.compile("\\d[0-5]{0,3}\\.\\d[0-255]{0,3}\\.\\d[0-255]{0,3}\\.\\d[0-255]{0,3}");
        // "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
