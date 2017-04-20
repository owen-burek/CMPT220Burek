/*
file: Problem7_32.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 5 Problem 7.32
due date: 04/06/17
*/

import java.util.*;

public class Problem7_32{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the length of the array to pivot: ");
    int arrLen = input.nextInt();
    
    int[] userArr = new int[arrLen];

    System.out.println("Please enter an array to pivot: ");
    for(int i = 0; i < arrLen; i++)
      userArr[i] = input.nextInt();

    userArr = pivot(userArr);

    System.out.print("The array ordered around the pivot: ");
    for(int i = 0; i < userArr.length; i++){
      System.out.print(userArr[i] + " ");
    }
  }

  public static int[] pivot(int[] arr){
    int pivot = arr[0];
    int[] arrPivot = new int[arr.length];
    for(int i = 0, x = 0, y = arr.length - 1; i < arr.length; i++){
      if(pivot > arr[i]){
        arrPivot[x] = arr[i];
        x++;
      }
      else if(pivot < arr[i]){
        arrPivot[y] = arr[i];
        y--;
      }
      if(x == y){
        arrPivot[x] = pivot;
      }
    }
    return arrPivot;
  }
}