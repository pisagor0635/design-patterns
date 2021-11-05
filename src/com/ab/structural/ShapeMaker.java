package com.ab.structural;

public class ShapeMaker {
    private Rectangle rectangle;
    private Square square;
    private Circle circle;

    public ShapeMaker(Rectangle rectangle, Square square, Circle circle) {
        this.rectangle = rectangle;
        this.square = square;
        this.circle = circle;
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawCircle() {
        circle.draw();
    }
}
