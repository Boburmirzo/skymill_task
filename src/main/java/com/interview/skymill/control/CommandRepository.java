package com.interview.skymill.control;

import com.interview.skymill.commands.Backward;
import com.interview.skymill.commands.ClockwiseRotate;
import com.interview.skymill.commands.Command;
import com.interview.skymill.commands.CounterClockwiseRotate;
import com.interview.skymill.commands.Forward;
import com.interview.skymill.commands.Quit;
import java.util.HashMap;

class CommandRepository {

  public static HashMap<Integer, Command> commands;

  static {
    commands = new HashMap<>();
    commands.put(0, new Quit());
    commands.put(1, new Forward());
    commands.put(2, new Backward());
    commands.put(3, new ClockwiseRotate());
    commands.put(4, new CounterClockwiseRotate());
  }
}