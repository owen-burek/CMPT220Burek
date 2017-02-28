/*
file: Problem6_3.java
author: Owen Burek
course: CMPT 220L-200
assignment:Lab 3 Problem 6.3
due date: 03/02/17
*/

import java.util.*;

public class Problem6_3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter an integer: ");
    int number = input.nextInt();
    int revNum = reverse(number);
    System.out.println("Your integer in reverse: " + revNum);
    if (isPalindrome(number))
      System.out.println("The number is a palindrome.");
    else
      System.out.println("The number is not a palindrome.");
    
  }

  // Return the reversal of an integer, i.e., reverse(456) will return 654
  public static int reverse(int number){
    int revNumber = 0;
    while(number > 0){
      revNumber = (revNumber * 10) + (number % 10);
      number /= 10;
    }
    return revNumber;
  }

  // Return true if number is a palindrome
  public static boolean isPalindrome(int number){
    int revNumber = 0;
    int numHolder = number;
    
    while(number > 0){
      revNumber = (revNumber * 10) + (number % 10);
      number /= 10;
    }
    
    boolean result = true;

    if(revNumber == numHolder)
      result = true;
    else
      result = false;

    return result;
  }
}