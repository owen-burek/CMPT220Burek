/*
Owen Burek
February 9, 2017
Lab 2 Problem 3.8
*/

import java.util.*;

public class Problem3_8{
  public static void main(String[] args){
    System.out.println("NUMBER SORTING");
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the first integer to be sorted: ");
    int firstIn = input.nextInt();
    System.out.print("Please enter the second integer to be sorted: ");
    int secondIn = input.nextInt();
    System.out.print("Please enter the third integer to be sorted: ");
    int thirdIn = input.nextInt();

    int first = 0; 
    int second = 0; 
    int third = 0;
    
    if(firstIn > secondIn && firstIn > thirdIn){
       first = firstIn;
      if(secondIn > thirdIn){
        second = secondIn;
        third = thirdIn;
      }
      else{
        second = thirdIn;
        third = secondIn;
      }
    }
    else if(secondIn > firstIn && secondIn > thirdIn){
      first = secondIn;
      if(firstIn > thirdIn){
        second = firstIn;
        third = thirdIn;
      }
      else{
        second = thirdIn;
        third = firstIn;
      }
    }
    else if(thirdIn > firstIn && thirdIn > secondIn){
      first = thirdIn;
      if(firstIn > secondIn){
        second = firstIn;
        third = secondIn;
      }
      else{
        second = secondIn;
        third = firstIn;
      }

    } 


    System.out.println("The three numbers, from greatest to least, are:");
    System.out.println(first + ", " + second + ", " + third);
  }
}
