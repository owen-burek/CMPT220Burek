/*
Owen Burek
February 23, 2017
Lab 3 Problem 5.13
*/

public class Problem5_13{
  public static void main (String[] args){
    int n = 1;
    while(Math.pow(n,3) < 12000){
      n++;
    }
    System.out.println("The largest integer that can be cubed to a value below 12000 is " + (n - 1));
  }
  public static int sumDigits(long n){
    int len = n.length();
  }
}