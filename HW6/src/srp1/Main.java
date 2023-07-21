package srp1;

import srp1.figure.Calculator;
import srp1.figure.Painter;
import srp1.figure.Point;
import srp1.figure.Square;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 4);
        Painter painter = new Painter();
        Calculator calculator = new Calculator();
        System.out.printf("Square area: %d \n", calculator.getArea(square));
        painter.draw(square);
    }
}
