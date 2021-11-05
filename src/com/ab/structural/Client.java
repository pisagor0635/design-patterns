package com.ab.structural;

public class Client {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker(new Rectangle(), new Square(), new Circle());
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
