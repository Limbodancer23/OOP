package lsp1;

import lsp1.shape.Quadrangle;
import lsp1.shape.Rectangle;
import lsp1.shape.Square;
import lsp1.view.ShapeView;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.setSide(4);
        System.out.printf("In a square side = %d\n", square.getSide());
        ShapeView view = new ShapeView(square);
        view.showArea();

        Rectangle rectangle = new Rectangle(2, 1);
        rectangle.setSideB(30);
        System.out.printf("In a square side A = %d, side B = %d\n", rectangle.getSideA(), rectangle.getSideB());
        ShapeView view1 = new ShapeView(rectangle);
        view1.showArea();
    }
}
