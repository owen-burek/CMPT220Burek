/*
file: Problem5_12.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 3 Problem 5.12
due date: 02/23/2017
*/

public class Problem5_12{
  public static void main(String[] args){
    int n = 100;
    while(Math.pow(n,2) < 12000){
      n++;
    }
    System.out.println("The smallest integer that can be squared to a value above 12000 is " + n);
  }
}