package _24_06_08.figureTask.figureMethods;

import _24_06_08.figureTask.figures.Circle;
import _24_06_08.figureTask.figures.Figure;
import _24_06_08.figureTask.figures.Triangle;
import _24_06_08.figureTask.interfaces.FigureInterface;

public class Methods implements FigureInterface {

    @Override
    public double triangleAreaByThreeSides(Figure figure) {
        double s = 0;
        if (figure instanceof Triangle) {
            if (Math.pow(((Triangle) figure).getA(), 2) ==
                    Math.pow(((Triangle) figure).getB(), 2) + Math.pow(((Triangle) figure).getC(), 2)) {
                s = ((double) ((Triangle) figure).getA() * ((Triangle) figure).getB()) / 2;
            }
        } else {
            try {
                throw new Exception("Triangle is not right");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        return s;
    }

    /**
     * @param figure
     * @return is Triangle Right
     */
    public boolean isRightTriangle(Figure figure) {
        if (figure instanceof Triangle) {
            if (((Triangle) figure).getA() == ((Triangle) figure).getB() &&
                    ((Triangle) figure).getA() == ((Triangle) figure).getC()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getArea(Figure figure) {
        double res = 0;
        if (figure instanceof Circle) {
            res = Math.PI * Math.pow(((Circle) figure).getRadius(), 2);
        }
        return res;
    }
}
