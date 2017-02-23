/*
Owen Burek
February 23, 2017
Lab 3 Problem 4.15
*/

import java.util.*;

public class Problem4_15{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a letter: ");
    String userLetter = input.next();
    int corNum = 0;
    if(userLetter.equalsIgnoreCase("a") ||
      userLetter.equalsIgnoreCase("b") ||
      userLetter.equalsIgnoreCase("c"))
      corNum = 2;

    else if (userLetter.equalsIgnoreCase("d") ||
      userLetter.equalsIgnoreCase("e") ||
      userLetter.equalsIgnoreCase("f"))
      corNum = 3;

    else if (userLetter.equalsIgnoreCase("g") ||
      userLetter.equalsIgnoreCase("h") ||
      userLetter.equalsIgnoreCase("i"))
      corNum = 4;
    
    else if (userLetter.equalsIgnoreCase("j") ||
      userLetter.equalsIgnoreCase("k") ||
      userLetter.equalsIgnoreCase("l"))
      corNum = 5;
    
    else if (userLetter.equalsIgnoreCase("m") ||
      userLetter.equalsIgnoreCase("n") ||
      userLetter.equalsIgnoreCase("o"))
      corNum = 6;
    
    else if (userLetter.equalsIgnoreCase("p") ||
      userLetter.equalsIgnoreCase("q") ||
      userLetter.equalsIgnoreCase("r") ||
      userLetter.equalsIgnoreCase("s"))
      corNum = 7;
    
    else if (userLetter.equalsIgnoreCase("t") ||
      userLetter.equalsIgnoreCase("u") ||
      userLetter.equalsIgnoreCase("v"))
      corNum = 8;
    
    else if (userLetter.equalsIgnoreCase("w") ||
      userLetter.equalsIgnoreCase("x") ||
      userLetter.equalsIgnoreCase("y") ||
      userLetter.equalsIgnoreCase("z"))
      corNum = 9;

    System.out.println("The corresponding number is " + corNum);
  }
}