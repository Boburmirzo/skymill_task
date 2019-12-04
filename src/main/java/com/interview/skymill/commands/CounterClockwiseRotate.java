package com.interview.skymill.commands;

import com.interview.skymill.model.FieldModel;

public class CounterClockwiseRotate extends Rotation {

  @Override
  protected void rotate(FieldModel model) {
    // TODO Auto-generated method stub
    model.rotate(90);
  }

}
