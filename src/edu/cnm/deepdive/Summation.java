package edu.cnm.deepdive;

import java.util.Stack;

/**
 * Class for entry point to Calc.
 * 
 * @author Stephen
 * @version 0.1
 */

public class Summation {

  public static void main(String[] args) {
    Stack<Double> stack = new Stack<>();
    for (int i = 0; i < args.length; i++) {
      String arg = args[i];
      arg = arg.trim().toLowerCase();


      switch (arg) {

        case "add":
        case "+":
          add(stack);
          break;
        case "sub":
        case "-":
          sub(stack);
          break;
        case "mul":
        case "*":
          multiply(stack);
          break;
        case "div":
        case "/":
          divide(stack);
          break;
        case "exp":
        case "^":
          exp(stack);
          break;
        default:
          stack.push(Double.valueOf(arg));
          break;
      }
    }

    System.out.printf("Result = %,.4f", stack.pop());

  }

  /**
   * @param stack
   */
  private static void add(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] + values[1]);
  }

  private static void sub(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] - values[1]);
  }

  private static void multiply(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] * values[1]);
  }

  private static void divide(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(values[0] / values[1]);
  }

  private static void exp(Stack<Double> stack) {
    double[] values = pop(stack, 2);
    stack.push(Math.pow(values[0], values[1]));
  }

  private static double[] pop(Stack<Double> stack, int numItems) {
    double[] values = new double[numItems];
    for (int i = 0; i < numItems; i++) {
      values[i] = stack.pop();
    }
    return values;
  }
}
