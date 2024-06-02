package _24_05_27;

import lombok.Getter;
import lombok.ToString;

/**
 * Класс Manager:
 * Наследуется от Employee.
 * Дополнительное поле subordinatesCount (int) - количество подчиненных.
 * Конструктор для всех полей (включая поля базового класса).
 * Переопределение метода toString() для добавления информации о количестве подчиненных.
 * Переопределение метода calculateBonus(), где бонус увеличивается на 2% за каждого подчиненного.
 */



public class Manager extends Employee{
    private int subordinatesCount;

    public int getSubordinatesCount() {
        return subordinatesCount;
    }

    public Manager(String name, String position, double salary, int subordinatesCount) {
        super(name, position, salary);
        this.subordinatesCount = subordinatesCount;
    }

    @Override
    public double calculateBonus() {
        return getSalary() + (getSubordinatesCount()*0.02);
    }

    @Override
    public String toString() {
        return "Manager{" + getName() + " " + getPosition() + " " + getSalary() +
                "subordinatesCount=" + subordinatesCount +
                '}';
    }

}
