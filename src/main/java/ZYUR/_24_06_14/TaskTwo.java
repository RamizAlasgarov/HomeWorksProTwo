package ZYUR._24_06_14;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 7 Создайте список объектов с полем категории и используйте Stream API, чтобы сгруппировать объекты по их категориям.
 * 8 Создайте список строк и используйте Stream API, чтобы объединить все строки в одну строку, разделяя их запятой.
 * 9 Создайте список чисел и используйте Stream API, чтобы проверить, все ли числа положительные.
 * 10 Создайте список объектов Person с полями "id" и "name" и используйте Stream API,
 * чтобы создать Map, где ключ - это "id", а значение - "name". Добавьте поле Set<Person> friends.
 * Создайте метод получения «общего круга друзей» всех заданных людей
 */
public class TaskTwo {
    /**
     * 10
     */
    public static void main(String[] args) {
        Person personLow = new Person(10, "John", new HashSet<>(Set.of()));
        Person person = new Person(16, "Kira", new HashSet<>(Set.of(personLow)));
        Person person1 = new Person(20, "Slow", new HashSet<>(Set.of(person, personLow)));
        Person person2 = new Person(5, "Jimmi", new HashSet<>(Set.of(person, person1, personLow)));
        List<Person> personList = List.of(person, person1, person2);
//        Map<Integer,String> idToName = personList.stream().collect(Collectors.toMap(per -> per.getId(), per -> per.getName()));
        System.out.println(getCommonFriends(personList));


        List<Integer> list = List.of(-1, 3, -6, 7, 8);
        System.out.println(list.stream().allMatch(num -> num > 0));
        System.out.println(list.stream().map(Math::abs).allMatch(num -> num > 0));
    }

    public static Set<Person> getCommonFriends(List<Person> personList) {
        return personList.stream().map(person -> person.friends).reduce((setofFriend1, setofFriend2) -> {
            setofFriend1.retainAll(setofFriend2);
            return setofFriend1;
        }).orElse(new HashSet<>());
    }

    @AllArgsConstructor
    @Getter
    @ToString
    static class Person {
        private int id;
        private String name;

        Set<Person> friends;


    }
}

