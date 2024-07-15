package com.example.diemdanh157;

import java.util.ArrayList;
import java.util.Iterator;

public class Diagram {
    private ArrayList<Shape> shapes;

    public Diagram() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public void drawShapes() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    public void moveShape(Shape shape, int x, int y) {
        shape.move(x, y);
    }

    public void removeDuplicates() {
        Iterator<Shape> iterator = shapes.iterator();
        ArrayList<Shape> uniqueShapes = new ArrayList<>();
        while (iterator.hasNext()) {
            Shape currentShape = iterator.next();
            boolean isDuplicate = false;
            for (Shape uniqueShape : uniqueShapes) {
                if (currentShape.isEqual(uniqueShape)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueShapes.add(currentShape);
            }
        }
        shapes = uniqueShapes;
    }
}
