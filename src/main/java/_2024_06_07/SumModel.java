package _2024_06_07;

/**
 * #### 3. Класс `SumModel`
 * Создать класс `SumModel`, который наследует `CalcModel` и реализует метод `result()` для выполнения операции сложения:
 * - `int result()`: возвращает сумму `x` и `y`.
 * - Реализовать методы `setX(int value)` и `setY(int value)` для установки значений `x` и `y`.
 */
public class SumModel extends CalcModel {
    @Override
    public int result() {
        return super.x + super.y;
    }


}

class Minus extends CalcModel {

    @Override
    public int result() {
        return super.x - super.y;
    }

}

