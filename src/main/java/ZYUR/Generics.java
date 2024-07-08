package ZYUR;

import java.util.ArrayList;
import java.util.List;


/**
 * 3 Создайте 3 лямбда-выражения, которые выводят строку в консоль разными способами.
 * Передайте все лямбда-выражения в метод в виде коллекции и выведите все строки в консоль.
 */
public class Generics {
    public static void main(String[] args) {
        List<String> strings = List.of("abc", "1hdf", "34jhdfhf", "bchd56");
        System.out.println(findStartWithDigit(strings));
        System.out.println(strings);

        String str = "privet kak dela vse ok da ok poka";
        Runnable runnable1 = () -> System.out.println(str);
        Runnable runnable2 = () -> System.out.printf("%s %n", str);
        Runnable runnable3 = () -> System.err.printf(str);
        List<Runnable> runnableList = List.of(runnable1, runnable2, runnable3);
        prntInformation(runnableList);

    }

    public static List<String> findStartWithDigit(List<String> list) {
        List<String> clone = new ArrayList<>(list);
        clone.removeIf(el -> !Character.isDigit(el.charAt(0)));
        return clone;
    }

    public static void prntInformation(List<Runnable> runnableList) {
        runnableList.forEach(Runnable::run);
    }

}
