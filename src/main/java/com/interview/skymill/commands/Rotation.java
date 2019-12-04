package com.interview.skymill.commands;

import com.interview.skymill.model.FieldModel;

public abstract class Rotation implements Command {

  @Override
  public void execute(FieldModel model, String... args) {
    if (!model.hasFallen()) {
      rotate(model);
      model.evaluate();
    }
  }
  abstract protected void rotate(FieldModel model);
}
