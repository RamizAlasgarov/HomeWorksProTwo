package _24_05_27;

import lombok.ToString;

/**
 * Класс Developer:
 * Наследуется от Employee.
 * Дополнительное поле programmingLanguage (String) - основной язык программирования разработчика.
 * Конструктор для всех полей (включая поля базового класса).
 * Переопределение метода toString() для добавления информации об основном языке программирования.
 * Переопределение метода calculateBonus(),
 * где бонус увеличивается на фиксированную сумму, например, 500 единиц.
 */

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, String position, double salary, String programmingLanguage) {
        super(name, position, salary);
        this.programmingLanguage = programmingLanguage;
    }


    @Override
    public String toString() {
        return "Developer{" + getName() + " " + getPosition() + " " + getSalary() +
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }

    @Override
    public double calculateBonus() {
        return getSalary() + 500;
    }
}
