package com.interview.skymill;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.interview.skymill.control.Controller;
import com.interview.skymill.control.FieldController;
import com.interview.skymill.view.FieldView;
import java.util.Scanner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

public class MainTest {

  @Rule
  public final TextFromStandardInputStream systemInMock
      = emptyStandardInputStream();

  @Test
  public void testEntireProtocol() {
    final String header = "4,4,2,2";
    final String input = "1,4,1,3,2,3,2,4,1,0";

    FieldView view = new FieldView(new Scanner(System.in));
    systemInMock.provideLines(header, input);
    Controller control = new FieldController();
    view.addObserver(control);
    view.run();

    assertEquals("[0, 1]", view.getOutput());
  }
}
