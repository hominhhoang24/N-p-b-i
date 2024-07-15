package com.example.diemdanh157;

public class Triangle implements Shape {
    private int x, y, base, height;

    public Triangle(int x, int y, int base, int height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a triangle at (" + x + ", " + y + ") with base " + base + " and height " + height);
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Moved triangle to (" + x + ", " + y + ")");
    }

    @Override
    public boolean isEqual(Shape other) {
        if (other instanceof Triangle) {
            Triangle t = (Triangle) other;
            return this.x == t.x && this.y == t.y && this.base == t.base && this.height == t.height;
        }
        return false;
    }
}
