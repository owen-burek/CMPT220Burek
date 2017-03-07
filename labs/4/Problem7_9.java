/*
file: Problem6_3.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 4 Problem 7.9
due date: 03/09/17
*/

import java.util.*;

public class Problem7_9{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] array = new double[10];
    
    System.out.println("Please enter ten numbers: ");
    for(int i = 0; i < 9; i++)
      array[i] = input.nextDouble();
    double arrayMin = min(array);
    System.out.println("The smallest number in the array is " + arrayMin);
  }

  public static double min(double[] array){
    double mini = array[0];
    for(int i = 0; i < 9; i++){
      if(mini > array[i])
        mini = array[i];
    }
    return mini;
  }
}