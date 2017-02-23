/*
Owen Burek
February 23, 2017
Lab 2 Problem 3.8
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