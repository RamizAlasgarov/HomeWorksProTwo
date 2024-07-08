package _24_07_05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    /**
     * 1. Преобразовать список списков целых чисел в один список всех чисел.
     */
    public static void main(String[] args) {
        List<List<Integer>> firstList = List.of(List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(7, 8, 9));
//        firstList.stream().flatMap(e -> e.stream()).forEach(e -> System.out.print(e + " "));

        /**
         * 2. Преобразовать список списков строк в один список всех строк
         */
        List<List<String>> strList = List.of(List.of("a", "b", "c"),
                List.of("d", "e", "g"),
                List.of("h", "f", "m"));
//        strList.stream().flatMap(e -> e.stream()).forEach(e -> System.out.print(e + " "));

        /**
         * Преобразовать список массивов строк в один список всех строк.
         */
        List<String[]> arrayList = List.of(new String[]{"a", "b", "c"},
                new String[]{"d", "e", "f"},
                new String[]{"g", "h", "i"});
//        arrayList.stream().flatMap(e -> Arrays.stream(e)).forEach(e -> System.out.print(e + " "));

        /**
         * Преобразовать список списков объектов в один список всех объектов.
         */
        Student student = new Student("a", 1);
        Student student1 = new Student("b", 2);
        Student student2 = new Student("c", 3);
        List<List<Student>> studentList = List.of(List.of(student),
                List.of(student1),
                List.of(student2));
        List<Student> students = studentList.stream().flatMap(e -> e.stream()).collect(Collectors.toList());
//        System.out.println(students);

        /**
         * Преобразовать список строк, каждая из которых содержит пробелы, в один список всех слов.
         */
        List<List<String>> list = List.of(List.of("r       kuku ", "a "),
                List.of("m ", "i "), List.of("z ", "z "));
        List<String> strings = list.stream()
                .flatMap(e -> e.stream())
                .map(e -> e.split("\\s+"))
                .flatMap(e -> Arrays.stream(e))
//                .filter(e -> e.length() > 0)
                .collect(Collectors.toList());
        System.out.println(strings);
        /**
         * Преобразовать список предложений в один список всех слов.
         */
        List<List<String>> words = List.of(List.of("privet", " kak dela"),
                List.of(" ok ", "poka"),
                List.of(" udachi"));
//        words.stream().flatMap(e -> e.stream()).forEach(e -> System.out.print(e));

        /**
         * Преобразовать список пользователей, каждый из которых имеет список телефонов, в один список всех телефонов.
         */
        Users fu = new Users("a", +131);
        Users su = new Users("b", +1334534);
        Users tu = new Users("c", +133453451);
        List<List<Users>> usersList = List.of(List.of(fu),
                List.of(su),
                List.of(tu));
        List<Integer> users = usersList
                .stream()
                .flatMap(e -> e.stream())
                .map(e -> e.number())
                .collect(Collectors.toList());
//        System.out.println(users);


        /**
         * Преобразовать список студентов, каждый из которых имеет список оценок, в один список всех оценок.
         */
        StudentTwo studentTwo1 = new StudentTwo("Math", List.of(5, 3, 4));
        StudentTwo studentTwo2 = new StudentTwo("Geometry", List.of(4, 4, 4));
        StudentTwo studentTwo3 = new StudentTwo("Fizika", List.of(5, 5, 5));
        List<List<StudentTwo>> listList = List.of(List.of(studentTwo1),
                List.of(studentTwo2),
                List.of(studentTwo3));
        List<Integer> markList = listList
                .stream()
                .flatMap(e -> e.stream())
                .map(e -> e.marks())
                .flatMap(e -> e.stream())
                .collect(Collectors.toList());
        System.out.println(markList);

    }
}

record Student(String name, int age) {
}

record Users(String name, int number) {
}

record StudentTwo(String item, List<Integer> marks) {
}
