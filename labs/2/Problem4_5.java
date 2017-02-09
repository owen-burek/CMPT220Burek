/*
Owen Burek
February 9, 2017
Lab 2 Problem 4.5
*/

import java.util.*;

public class Problem4_5{
  public static void main(String[] args){
    System.out.println("AREA OF A REGULAR POLYGON");
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter the number of sides: ");
    int sideNum = input.nextInt();
    System.out.print("Please enter the length of a side: ");
    double sideLength = input.nextDouble();

    double area = (sideNum * Math.pow(sideLength, 2)) / (4.0 * Math.tan(Math.PI / sideNum));
    
    System.out.println("The area of the polygon is " + area);
  }
}