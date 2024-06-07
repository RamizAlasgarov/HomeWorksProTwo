package _2024_06_07;

/**
 * #### 5. Класс `Presenter`
 * Создать класс `Presenter` для управления взаимодействием между моделью и представлением:
 * - Конструктор `Presenter(Model m, View v)`: принимает модель и представление.
 * - Метод `void buttonClick()`: получает значения `a` и `b` от пользователя,
 * устанавливает их в модель, вычисляет результат и выводит его на экран.
 */
public class Presenter {
    private Model model;
    protected View view;

    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    void buttonClick() {
        int a = view.getValue("1 cislo");
        int b = view.getValue("2 coislo");
        model.setX(a);
        model.setY(b);
        view.print(model.result(), "result of sum is %d ");
    }
}
