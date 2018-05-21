package edu.cnm.deepdive;
/**
 * Class for entry point to Calc.
 * 
 * @author Stephen
 * @version 0.1
 */

public class Summation {

  private static int val;

  public static void main(String[] args) {
    
    /**
     * Command line entry point for RPN
     * @param args operands and operators.
     */
    
    int sum=0;
//    for (int i = 0; i < args.length; i++ ) 
//      int val=Integer.parseInt(args[i]);
//      sum = sum + val;
   

    int i = 0;
    while (i<args.length) {
      args[i] = args[1].trim();
      int val = Integer.parseInt(args[i]);
      sum += val;
      i++;
  }
    
   System.out.println(sum); 
    
   
      }
  
}
