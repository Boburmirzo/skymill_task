package com.interview.skymill.model;

public class Square implements Shape {
    
    private int x, y;
    
    Square(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public int[] getPos() {
        return new int[] {x, y};
    }

}
