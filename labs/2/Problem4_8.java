/*
Owen Burek
February 23, 2017
Lab 2 Problem 4.8
*/

import java.util.*;

public class Problem4_8{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter an ASCII code: ");
    int ascii = input.nextInt();
    char asciiChar = (char)ascii;
    System.out.println("The character for ASCII code " + ascii + " is: " + asciiChar);
  }
}