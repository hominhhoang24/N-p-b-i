package com.example.diemdanh157;

public class Rectangle implements Shape {
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a rectangle at (" + x + ", " + y + ") with width " + width + " and height " + height);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moved rectangle to (" + x + ", " + y + ")");
    }

    @Override
    public boolean isEqual(Shape other) {
        if (other instanceof Rectangle) {
            Rectangle r = (Rectangle) other;
            return this.x == r.x && this.y == r.y && this.width == r.width && this.height == r.height;
        }
        return false;
    }
}