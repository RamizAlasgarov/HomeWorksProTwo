package _24_05_27;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Класс Employee:
 * Поля:
 * name (String)
 * position (String)
 * salary (double)
 * Конструктор для всех полей.
 * Геттеры и сеттеры для каждого поля.
 * Метод toString() для вывода базовой информации о сотруднике.
 * Метод calculateBonus() для расчета бонуса, например, +5% от зарплаты.
 */



public class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateBonus(){
        return getSalary() + (getSalary()*0.05);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
