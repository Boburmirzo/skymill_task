package com.interview.skymill.commands;

import com.interview.skymill.model.FieldModel;

public interface Command {

   void execute(FieldModel model, String... args);
}
