/*
Owen Burek
January 24,2017
Lab 0 Problem 2.5
*/

import java.util.Scanner;

public class Problem2_5{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the subtotal and gratuity rate: ");

    double subtotal = input.nextDouble();
    double gratRate = input.nextDouble();
    double gratuity = (subtotal * (gratRate / 100));
    double total = gratuity + subtotal;
    
    System.out.println("The gratuity is $" + gratuity + " and the total is $" 
      + total);
  }
}