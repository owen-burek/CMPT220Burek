/*
file: Problem7_18.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 4 Problem 7.18
due date: 03/09/17
*/

import java.util.*;

public class Problem7_18{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] array = new double[10]; 
    
    System.out.println("Please enter ten numbers: ");
    for(int i = 0; i <= 9; i++)
      array[i] = input.nextDouble();

    double[] bubbleArray = bubbleSort(array);

    System.out.println("The 10 elements in ascending order: ");
    for (int k = 0; k <= 9; k++)
      System.out.print(bubbleArray[k] + " ");
  }
  

  public static double[] bubbleSort(double[] arraySort){
    double temp = 0.0;
    for(int i = 0; i <= 9; i++){
      for (int k = 0; k <= 8; k++){
        if (arraySort[k] > arraySort[k+1]){
          temp = arraySort[k];
          arraySort[k] = arraySort[k+1];
          arraySort[k+1] = temp;
        }
      }   
    }
    return arraySort;
  }
}