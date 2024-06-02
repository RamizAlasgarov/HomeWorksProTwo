package ZYUR._24_06_02;

import _24_05_27.Manager;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Создайте методы, реализующие вычисление математических функций:
 * y=x^2;y=x^3;y=√(|x| ); y=sin⁡x;
 * Напишите метод, который принимает математическую функцию и
 * возвращает список вычисленных значений в диапазоне значений от -π/2 до π/2.
 */
public class Demo {
    public static void main(String[] args) {
//        System.out.println(func(Demo::kub));
//        System.out.println(func(Demo::sqr));

        System.out.println(func(Demo::sin));
//        System.out.println(func(Demo::sqrt));

    }

    public static double sqr(double value) {
        return Math.pow(value, 2);
    }

    public static double kub(double value) {
        return Math.pow(value, 3);
    }

    public static double sqrt(double value) {
        return Math.sqrt(Math.abs(value));
    }

    public static double sin(double value) {
        return Math.sin(value);
    }

    public static List<Double> func(Function<Double, Double> function) {
        List<Double> list = new ArrayList<>();
        for (double x = -Math.PI / 2; x <= Math.PI / 2; x =x+ Math.PI/4) {
            list.add(function.apply(x));
        }
        return list;
    }
}
