/*
Owen Burek
February 23, 2017
Lab 3 Problem 4.26
*/

import java.util.*;

public class Problem4_26{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an amount in double, for example 11.56: ");
    String amount = input.nextLine();
    int decim = amount.indexOf(".");
    
    String dollars = amount.substring(0,decim);
    String cents = amount.substring(decim + 1);
    
    System.out.println("Dollars: " + dollars);
    
    int centNum = Integer.parseInt(cents);
    
    int quarters = centNum / 25;
    int remainingAmount = centNum - (quarters * 25);
    int dimes = remainingAmount / 10;
    remainingAmount -= (dimes * 10);
    int nickels = remainingAmount / 5;
    remainingAmount -= (nickels * 5);
    int pennies = remainingAmount;

    System.out.println("Quarters: " + quarters);
    System.out.println("Dimes: " + dimes);
    System.out.println("Nickels: " + nickels);
    System.out.println("Pennies: " + pennies);
  }
}