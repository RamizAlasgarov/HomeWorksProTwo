package _24_07_29;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * #### Задание 3: Проверка на наличие цифр в строке
 * <p>
 * **Описание:** Напишите программу, которая проверяет, содержит ли строка хотя бы одну цифру.
 */
public class RegEx3 {
    public static void main(String[] args) {
        String number = "oksmig321gfsdf";
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(number);
        while (matcher.find()) {
            System.out.println("yes have");
        }
    }
}
