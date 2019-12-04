package com.interview.skymill.commands;


import com.interview.skymill.model.Shape;

public class Forward extends Movement {

  protected void move(Shape shape, int direction) {
    shape.move((int) Math.round(Math.cos(Math.toRadians(direction))),
        (int) Math.round(Math.sin(Math.toRadians(-direction))));
  }

}
