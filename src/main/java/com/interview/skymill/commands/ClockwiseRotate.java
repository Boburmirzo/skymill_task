package com.interview.skymill.commands;

import com.interview.skymill.model.FieldModel;

public class ClockwiseRotate extends Rotation {

  @Override
  protected void rotate(FieldModel model) {
    model.rotate(-90);
  }

}
