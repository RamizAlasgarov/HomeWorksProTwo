package _24_05_27;

import java.util.Arrays;

/**
 * 2. Обработка массивов:
 * В методе main создать массив Employee[], который будет содержать объекты Manager и Developer.
 * Использовать простой цикл (for или foreach), чтобы вывести информацию о каждом сотруднике и его бонусе.
 */
public class Demo {
    public static void main(String[] args) {
//        Employee employee = new Employee("r","tt",10);
//        Manager manager = new Manager("rrr","wer",10,2);
////        System.out.println(employee.calculateBonus());
//        System.out.println(manager.calculateBonus());
        Creat creat = new Creat();
        Employee[] employees = {creat.getmanager(),creat.getDeveloper()};
//        for (int i = 0; i < employees.length; i++) {
//            employees[i] = creat.getDeveloper();
//            for (int j = i+1; j < employees.length; j++) {
//                employees[j] = creat.getmanager();
//            }
//        }
        System.out.println(Arrays.toString(employees));

    }


}
