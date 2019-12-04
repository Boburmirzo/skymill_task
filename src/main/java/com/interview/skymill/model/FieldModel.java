package com.interview.skymill.model;

import java.util.Observable;

public class FieldModel extends Observable {

    private int width, height, direction;
    private Shape shape;
    private boolean fell_off;

    public FieldModel(int[] header) {
        width = header[0];
        height = header[1];
        shape = new Square(header[2], header[3]);
        direction = 90;
    }

    public Shape getShape() {
        return shape;
    }

    public boolean hasFallen() {
        return fell_off;
    }

    public void evaluate() {
        int[] pos = shape.getPos();
        fell_off = !((pos[0] < width && pos[0] > -1) && (pos[1] < height && pos[1] > -1));
    }

    public void quit() {
        super.setChanged();
        if (!hasFallen()) {
            super.notifyObservers(shape.getPos());
        } else {
            super.notifyObservers(new int[] {-1, -1});
        }
    }

    public int getDirection() {
        return direction;
    }

    public void rotate(int degrees) {
        direction += degrees;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isFell_off() {
        return fell_off;
    }
}
