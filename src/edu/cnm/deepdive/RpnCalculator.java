package edu.cnm.deepdive;

import java.util.Stack;

/**
 * Class for entry point to Calc.
 * 
 * @author Stephen
 * @version 0.2
 */

public class RpnCalculator {

  public static void main(String[] args) {
    Stack<Double> stack = new Stack<>();
    for (String arg :args) {
      arg = arg.trim().toLowerCase();
      switch (arg) {// addition
        case "add":
        case "+":
          add(stack);
          break;
        case "sub": //subtraction
        case "-":
          sub(stack);
          break;
        case "multiply":  // multiplication
        case "*":
          multiply(stack);
          break;
        case "divide":  // division
        case "/":
          divide(stack);
          break;
        case "pop":
          stack.pop();
          break;
        case "exp":  //exponential
        case "^":
          add(stack);
          break;
        case "abs": // absolute
          abs(stack);
          break;
        default:
          stack.push(Double.valueOf(arg));
      }
    }
      System.out.printf("Result = %,.2f", stack.pop());
    }

  /**
   * @param stack
   */


    private static void abs(Stack<Double> stack) { // ABS
      double[] values = pop(stack, 1);
      stack.push(Math.abs(values[0]));
    }
  private static void add(Stack<Double> stack){ // Addition
    double[] values = pop(stack, 2);
    stack.push(values[0] + values[1]);
  }

  private static void sub(Stack<Double> stack) { //subtraction
    double[] values = pop(stack, 2);
    stack.push(values[0] - values[1]);
  }

  private static void multiply(Stack<Double> stack) { // Multiply
    double[] values = pop(stack, 2);
    stack.push(values[0] * values[1]);
  }

  private static void divide(Stack<Double> stack) { // Divide
    double[] values = pop(stack, 2);
    stack.push(values[0] / values[1]);
  }

  private static void exp(Stack<Double> stack) { // Exponent
    double[] values = pop(stack, 2);
    stack.push(Math.pow(values[0], values[1]));
  }

  private static double[] pop(Stack<Double> stack,int numItems) {
    double[] values = new double[numItems];
    for (int i = 0;i<numItems;i++) {
      //values[i] = double[];
    }
      return values;
  }


}
