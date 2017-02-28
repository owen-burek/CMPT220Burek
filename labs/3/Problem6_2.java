/*
Owen Burek
February 23, 2017
Lab 3 Problem 6.2
*/

import java.util.*;

public class Problem6_2{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter an integer: ");
    int integ = input.nextInt();  
    int digSum = digitSum(integ);
    System.out.println("The digits of " + integ + " added together are " + digSum);
  }
  public static int digitSum(long n){
    int digSum = 0;
    long digit = 0;
    while(n > 0){
      digit = n % 10;
      digSum += digit;
      n /= 10;
    }
    return digSum;
  }
}