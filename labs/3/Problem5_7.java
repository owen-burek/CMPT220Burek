/*
file: Problem5_7.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 3 Problem 5.7
due date: 02/23/2017
*/

import java.util.*;

public class Problem5_7{
  public static void main(String[] args){
    double curTuit = 10000.0;
    double rate = 0.05;
    double fourTuit = 0.0;
    for (int year = 1; year <= 14; year++){
      curTuit += (rate * curTuit); 
      if (year == 10)
        System.out.printf("The tuition, after 10 years, will be: $ %.2f \n", curTuit);
      if (year > 10)
        fourTuit += curTuit;
    }
    System.out.printf("The tuition for four years after year 10 will be: $ %.2f", fourTuit);
  }
}