package _2024_06_07;

/**
 * #### 6. Класс `Program`
 * Создать класс `Program` с методом `main`, который:
 * - Создаёт экземпляры `SumModel` и `View`.
 * - Создаёт экземпляр `Presenter`.
 * - Вызывает метод `buttonClick()` несколько раз для демонстрации работы системы.
 */
public class Programm {
    public static void main(String[] args) {
        programm();

    }

    private static void programm() {
        SumModel sumModel = new SumModel();
        View view = new View();
        Presenter presenter = new Presenter(sumModel, view);
        presenter.buttonClick();
        presenter.buttonClick();
        presenter.buttonClick();
    }
}
