package _2024_06_07;

/**
 * #### 2. Абстрактный класс `CalcModel`
 * Создать абстрактный класс `CalcModel`, который реализует интерфейс `Model` и содержит поля:
 * - `int x`
 * - `int y`
 */
public abstract class CalcModel implements Model {
    protected int x;
    protected int y;

    @Override
    public void setX(int value) {
        x = value;
    }

    @Override
    public void setY(int value) {
        y = value;
    }


}
