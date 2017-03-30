/*
file: Problem7_20.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 5 Problem 7.20
due date: 03/30/17
*/

import java.util.*;

public class Problem7_20{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    double[] unSortArr = new double[10];
    System.out.println("Enter 10 values for the array to sort:");
    for(int i = 0; i<10; i++){
      unSortArr[i] = input.nextDouble();
    }

    unSortArr = selectSort(unSortArr);
    System.out.println("Resulting matrix:");
    for(int i = 0; i < 10; i++){
      System.out.print(unSortArr[i] + " ");
    }
  }

  public static double[] selectSort(double[] arr){
    double temp = 0;
    for(int x = 9; x > 0; x--){  
      for(int i = 0; i < (x + 1); i++){
        if(arr[i] > arr[x]){
          temp = arr[x];
          arr[x] = arr[i];
          arr[i] = temp;
        }
      }
    }
    return arr;
  }
}