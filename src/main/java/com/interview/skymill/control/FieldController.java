package com.interview.skymill.control;

import com.interview.skymill.commands.Command;
import com.interview.skymill.model.FieldModel;
import com.interview.skymill.view.View;
import java.util.Observable;

public class FieldController implements Controller {
  private FieldModel model;

  @Override
  public void update(Observable o, Object arg) {
    if (arg instanceof int[]) {
      model = new FieldModel((int[]) arg);
      model.addObserver((View) o);
    } else {
      Command command = CommandRepository.commands.get(arg);
      if (command != null) {
        System.out.println("Current command: " + arg);
        command.execute(model);
      }
    }
  }

  public FieldModel getModel() {
    return model;
  }
}
