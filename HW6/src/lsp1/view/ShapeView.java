package lsp1.view;

import lsp1.shape.Quadrangle;
import lsp1.shape.Rectangle;

public class ShapeView {
    private final Quadrangle quadrangle;

    public ShapeView(Quadrangle quadrangle) {
        this.quadrangle = quadrangle;
    }

    public void showArea() {
        System.out.print("Area of rectangle equal:");
        System.out.println(quadrangle.getArea());
    }
}
