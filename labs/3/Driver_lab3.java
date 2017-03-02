/*
Owen Burek
Fabruary 25, 2017
Lab 3: Different Distances 
*/

import java.util.Scanner;

public class Driver_lab3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    while(true){
      double x1 = input.nextDouble();
      if(x1 == 0.0)
        break;
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      double p  = input.nextDouble();
      double distance = Math.pow(Math.pow(Math.abs(x1-x2),p) + Math.pow(Math.abs(y1-y2),p),1.0/p);
      System.out.println(distance);
    }
    
  }
}