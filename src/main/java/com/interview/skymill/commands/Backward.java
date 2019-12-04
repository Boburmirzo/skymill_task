package com.interview.skymill.commands;

import com.interview.skymill.model.Shape;

public class Backward extends Movement {

  protected void move(Shape shape, int direction) {
    shape.move((int) Math.round(Math.cos(Math.toRadians(direction - 180))),
        (int) Math.round(Math.sin(Math.toRadians(direction))));
  }

}
