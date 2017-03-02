/*
file: Problem6_3.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 4 Problem 6.8
due date: 03/02/17
*/

import java.util.*;

public class Problem6_8{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String contin = "y";

    for(int i = 0; i < 5; i++){
      System.out.print("Please enter a temperature in Celsius: ");
      double celsius = input.nextDouble();
      System.out.print("Please enter a temperature in Fahrenheit: ");
      double fahrenheit = input.nextDouble();
      System.out.println();
      System.out.println("Celsius     Fahrenheit     |     Fahrenheit     Celsius" +
                         "\n_______________________________________________________");
      double fahrenheitOut = celsiusToFahrenheit(celsius);
      double celsiusOut = fahrenheitToCelsius(fahrenheit);
      System.out.printf("%.1f         %.1f           |     %.1f           %.1f\n",
        celsius, fahrenheitOut, fahrenheit, celsiusOut);
    }
  }

  public static double celsiusToFahrenheit(double celsius){
    double fahrenheit = (9.0 / 5) * celsius + 32;
    return fahrenheit;
  }
  public static double fahrenheitToCelsius(double fahrenheit){
    double celsius = (5.0 / 9) * (fahrenheit - 32);
    return celsius;
  }
}