package com.interview.skymill.view;

import java.util.InputMismatchException;
import java.util.Observable;
import java.util.Scanner;

public class FieldView extends View {
  private Scanner input;
  private String output;
  private boolean running;

  public FieldView(Scanner scanner) {
    System.out.println("Please enter header: ");
    input = scanner;
  }

  private void getHeader() {
    super.setChanged();
    super.notifyObservers(readHeaderSection());
  }

  private int[] readHeaderSection() {
    String line = input.nextLine();
    if (line.isEmpty()) {
      throw new InputMismatchException("Header section shouldn't be empty");
    }
    String[] headerValues = line.trim().split(",");
    int[] header = new int[headerValues.length];
    for (int section = 0; section < headerValues.length; section++) {
      header[section] = convertToLittleIndian(headerValues[section]);
    }
    return header;
  }

  public int convertToLittleIndian(String value) {
    return (Integer.parseInt(value));
  }

  @Override
  public void run() {
    running = true;
    getHeader();
    System.out.println("Please enter input:");
    String line = input.nextLine();
    if (line.isEmpty()) {
      throw new InputMismatchException("Header section shouldn't be empty");
    }
    String[] headerValues = line.trim().split(",");
    while (running) {
      for (String headerValue : headerValues) {
        super.setChanged();
        super.notifyObservers(Integer.parseInt(headerValue));
      }
    }
  }

  public String getOutput() {
    return output;
  }

  @Override
  public void update(Observable arg0, Object arg1) {
    int[] pos = (int[]) arg1;
    System.out.println();
    System.out.println("The final output:");
    this.output = "[" + pos[0] + ", " + pos[1] + "]";
    System.out.println(output);
    running = false;

  }
}
