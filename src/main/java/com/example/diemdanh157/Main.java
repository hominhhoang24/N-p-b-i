package com.example.diemdanh157;

public class Main {
    public static void main(String[] args) {
        Diagram diagram = new Diagram();

        Shape rect1 = new Rectangle(0, 0, 10, 20);
        Shape rect2 = new Rectangle(0, 0, 10, 20);
        Shape circle1 = new Circle(5, 5, 10);
        Shape triangle1 = new Triangle(3, 3, 6, 8);

        diagram.addShape(rect1);
        diagram.addShape(rect2);
        diagram.addShape(circle1);
        diagram.addShape(triangle1);

        System.out.println("Before removing duplicates:");
        diagram.drawShapes();

        diagram.removeDuplicates();

        System.out.println("After removing duplicates:");
        diagram.drawShapes();
    }
}
