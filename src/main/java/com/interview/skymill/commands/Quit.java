package com.interview.skymill.commands;

import com.interview.skymill.model.FieldModel;

public class Quit implements Command {

  @Override
  public void execute(FieldModel model, String... args) {
    model.quit();
  }
}
