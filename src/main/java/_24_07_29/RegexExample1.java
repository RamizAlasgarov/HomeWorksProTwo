package _24_07_29;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Задание 1: Проверка формата номера телефона
 * <p>
 * **Описание:** Напишите программу, которая проверяет, соответствует ли строка формату номера телефона "`(999)145-67-89`".
 */
public class RegexExample1 {
    public static void main(String[] args) {
        String phone = "(999)145-67-89`";
        Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\d{3}\\W\\d{2}\\W\\d{2}");
        Matcher matcher = pattern.matcher(phone);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
