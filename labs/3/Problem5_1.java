/*
file: Problem5_1.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 3 Problem 5.1
due date: 02/23/2017
*/

import java.util.*;

public class Problem5_1{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter an integer, the input ends if it is 0: ");
    int posCount = 0;
    int negCount = 0;
    int userNum;
    double total = 0.0;
    do{
      userNum = input.nextInt();
      if(userNum > 0)
        posCount++;
      else if(userNum < 0)
        negCount++;
      total+=userNum;
    }
    while(userNum!=0); 
    System.out.println("The number of positives is: " + posCount);
    System.out.println("The number of negatives is: " + negCount);
    System.out.println("The total is: " + total);

    double average = total/(posCount+negCount);

    System.out.println("The average is: " + average);
  }
}