package com.interview.skymill.commands;

import com.interview.skymill.model.FieldModel;
import com.interview.skymill.model.Shape;

public abstract class Movement implements Command {

  @Override
  public void execute(FieldModel model, String... args) {
    if (!model.hasFallen()) {
      move(model.getShape(), model.getDirection());
      model.evaluate();
    }
  }

  abstract protected void move(Shape shape, int direction);

}
