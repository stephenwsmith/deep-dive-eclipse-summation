package edu.cnm.deepdive;

public class Summation {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    

    int sum=0;
    for (int i = 0; i < args.length; i++ ) {
      int val=Integer.parseInt(args[i]);
      sum = sum + val;
   

  
  }
   System.out.println(sum); 
    
   
      }
  
}
