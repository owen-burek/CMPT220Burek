/*
Owen Burek
February 23, 2017
Lab 3 Problem 5.12
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