package ZYUR._24_06_02.demo;

import ZYUR._24_06_02.demo.executor.Executor;

import java.util.Map;

/**
 * Создайте собственный функциональный интерфейс, внутри которого определите метод execute, принимающий три аргумента типа T и возвращающий результат типа R.
 * В Main создайте метод, checkAndGet, принимающий экземпляр данного интерфейса и три строки. Если хотя бы одна из переданных строк null, метод возвращает null. В противном случае вызывает метод execute.
 * В методе main создайте три строки. Создайте несколько лямбда-выражений, которые принимают три строки и возвращают:
 * -суммарную длину строк
 * -среднюю длину строк
 * -длину наименьшей строки
 * -длину строки, в которой больше всего цифр.
 * Вызовите метод checkAndGet для всех лямбда-выражений.
 * Что произойдёт, если добавить в функциональный интерфейс второй метод?
 */
public class Demo {
    public static void main(String[] args) {
        String line1 = "c12at";
        String line2 = "ani6malrt";
        String line3 = "4bird18";
        System.out.println(checkAndGet((s1, s2, s3) -> s1.length() + s2.length() + s3.length(), line1, line2, line3));
        System.out.println(checkAndGet((s1, s2, s3) -> (s1.length() + s2.length() + s3.length()) / 3, line1, line2, line3));
        System.out.println(checkAndGet((s1, s2, s3) -> Math.min(Math.min(s1.length(), s2.length()), s3.length()), line1, line2, line3));
        System.out.println(checkAndGet((s1, s2, s3) -> {
            Map<String, Integer> lineToDigitsCount = Map.of(s1, countDigits(s1), s2, countDigits(s2), s3, countDigits(s3));
            Map.Entry<String, Integer> max = null;
            for (Map.Entry<String, Integer> entry : lineToDigitsCount.entrySet()) {
                if (max == null || entry.getValue() > max.getValue()) max = entry;
            }
            return max.getKey().length();
        }, line1, line2, line3));
    }

    public static Integer checkAndGet(Executor<String, Integer> executor, String s1, String s2, String s3) {
        if (s1 == null || s2 == null || s3 == null) {
            return null;
        }
        return executor.execute(s1, s2, s3);
    }

    public static int countDigits(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) count++;
        }
        return count;
    }
}
