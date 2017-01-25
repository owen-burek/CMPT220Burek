/*
Owen Burek
January 24,2017
Lab 0 Problem 2.6
*/

import java.util.Scanner;

public class Problem2_6{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 1000: ");

    int wholeNum = input.nextInt();
    int lastDigit = wholeNum % 10;
    wholeNum /= 10;
    int secondDigit = wholeNum % 10;
    wholeNum /= 10;
    int digitSum = wholeNum + lastDigit + secondDigit;

    System.out.println("The sum of the digits is " + digitSum);
  }
}