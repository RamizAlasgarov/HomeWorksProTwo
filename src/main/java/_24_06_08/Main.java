package _24_06_08;

import _24_06_08.figureTask.figureMethods.Methods;
import _24_06_08.figureTask.figures.Circle;
import _24_06_08.figureTask.figures.Figure;
import _24_06_08.figureTask.figures.Rectangle;
import _24_06_08.figureTask.figures.Triangle;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = {new Circle(10), new Triangle(2, 2, 2), new Rectangle(6, 6)};
        Methods methods = new Methods();

        for (Figure figure : figures) {
            methods.getArea(figure);


        }

    }
}
