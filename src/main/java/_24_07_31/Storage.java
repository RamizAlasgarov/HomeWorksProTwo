package _24_07_31;

import java.util.ArrayList;

public class Storage<T extends Number> {
    ArrayList<T> list;
    T value;

    public boolean add(T t) {
        return list.add(t);
    }

    public boolean remove(T t) {
        return list.remove(t);
    }

    public T get(int index) {
        return list.get(index);
    }

    public double sum() {
        double totalSum = 0;

        for (T number : list) {
            totalSum += number.doubleValue();
        }


        return totalSum;
    }

    public static void main(String[] args) {
        
    }

    /**

     Создайте метод, который принимает коллекцию производителей чисел
     (например, List<? extends Number>) и добавляет все эти числа в контейнер Storage<Number>.
     Создайте метод, который принимает коллекцию потребителей чисел
     (например, List<? super Number>) и заполняет ее числами из контейнера Storage<Number>.
     Подробнее про PECS
     Обработка Исключений:
     */

}