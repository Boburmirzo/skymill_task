package com.interview.skymill;

import com.interview.skymill.control.Controller;
import com.interview.skymill.control.FieldController;
import com.interview.skymill.view.FieldView;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    FieldView view = new FieldView(new Scanner(System.in));
    Controller control = new FieldController();
    view.addObserver(control);
    view.run();
  }
}
