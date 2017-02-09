/*
Owen Burek
February 9, 2017
Lab 2 Problem 4.1
*/

import java.util.*;

public class Problem4_1{
  public static void main(String[] args){
    System.out.print("AREA OF A PENTAGON");
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the length from the center to a vertex: ");

    double radius = input.nextDouble();
    double side = 2.0 * radius * Math.sin(Math.PI / 5.0);
    double area = (5.0 * Math.pow(side, 2.0)) / (4.0 * Math.tan(Math.PI / 5.0));

    System.out.printf("The area of the pentagon is %.2f", area);
  }
}