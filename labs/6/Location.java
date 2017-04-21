/*
file: Location.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 6 Problem 9.13
due date: 04/20/17
*/

import java.util.*;

class Location{
  public int row = 0;
  public int column = 0;
  public double maxValue = 0;
  
  Location() {}

  public static Location locateLargest(double[][] a){
    Location l = new Location();
    double bigNum = 0;
    for(int i = 0; i < a.length; i++){
      for(int x = 0; x < a[0].length; x++){
        if(a[i][x] > bigNum){
          l.maxValue = a[i][x];
          l.row = i;
          l.column = x;
        }
      }
    }
    return l;
  }
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the number of rows and columns: ");
    row = input.nextInt();
    column = input.nextInt();
    double[][] array = new double[rows][columns];
    System.out.println("Please enter the values in the array: ");
    for(int i = 0; i < rows; i++){
      for(int x = 0; x < columns; x++){
        array[i][x] = input.nextDouble();
      }
    }
  }
}