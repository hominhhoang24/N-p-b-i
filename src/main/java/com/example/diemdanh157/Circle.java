package com.example.diemdanh157;

public class Circle implements Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle at (" + x + ", " + y + ") with radius " + radius);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moved circle to (" + x + ", " + y + ")");
    }

    @Override
    public boolean isEqual(Shape other) {
        if (other instanceof Circle) {
            Circle c = (Circle) other;
            return this.x == c.x && this.y == c.y && this.radius == c.radius;
        }
        return false;
    }
}