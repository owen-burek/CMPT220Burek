/*
Owen Burek
February 23, 2017
Lab 3 Problem 4.25
*/

import java.util.*;

public class Problem4_25{
  public static void main(String[] args){
    char letter1 = (char)(65 + (Math.random() * 26));
    char letter2 = (char)(65 + (Math.random() * 26));
    char letter3 = (char)(65 + (Math.random() * 26));
   


    int num1 = (int) (Math.random() * 10);
    int num2 = (int) (Math.random() * 10);
    int num3 = (int) (Math.random() * 10);
    int num4 = (int) (Math.random() * 10);

    System.out.println(letter1 + "" + letter2 + "" + letter3 + " " + num1 + "" + num2 + "" + num3 + "" + num4);
  }
}