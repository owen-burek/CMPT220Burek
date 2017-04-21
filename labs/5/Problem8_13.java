/*
file: Problem8_13.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 5 Problem 8.13
due date: 04/06/17
*/

import java.util.*;

public class Problem8_13{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number of rows and columns: ");
    int rows = input.nextInt();
    int columns = input.nextInt();
    double[][] array = new double[rows][columns];
    System.out.println("Please enter the values in the array: ");
    for(int i = 0; i < rows; i++){
      for(int x = 0; x < columns; x++){
        array[i][x] = input.nextDouble();
      }
    }
    int[] biggestElements = locateLargest(array);
    System.out.println("The largest number is located at [" + biggestElements[0] + 
      "," + biggestElements[1] + "]");

  }
  public static int[] locateLargest(double[][] a){
    int[] bigEle = new int[2];
    double bigNum = 0;
    for(int i = 0; i < a.length; i++){
      for(int x = 0; x < a[0].length; x++){
        if(a[i][x] > bigNum){
          bigNum = a[i][x];
          bigEle[0] = i;
          bigEle[1] = x;
        }
      }
    }
    return bigEle;
  }
}