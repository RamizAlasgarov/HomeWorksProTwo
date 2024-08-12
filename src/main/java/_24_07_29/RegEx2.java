package _24_07_29;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * #### Задание 2: Извлечение всех email адресов из текста
 * <p>
 * **Описание:** Напишите программу, которая извлекает все email адреса из заданного текста.
 */
public class RegEx2 {
    public static void main(String[] args) {
        String letter = "privet kak dela ema_il@gmail.com,privet kak dela emailtwo@gmail.com";
        Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
        Matcher matcher = pattern.matcher(letter);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
