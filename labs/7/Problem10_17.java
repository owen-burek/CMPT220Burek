/*
file: .java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 7 Problem 10.17
due date: 04/27/17
*/

import java.math.BigInteger;

public class Problem10_17 {
  public static void main(String[] args) {
    
    BigInteger biggo = new BigInteger(Long.MAX_VALUE + ""); 
    BigInteger last = biggo.add(new BigInteger("10"));

    for (biggo = new BigInteger(Long.MAX_VALUE + ""); 
      biggo.compareTo(last) <= 0; 
      biggo = biggo.add(new BigInteger("1"))) {
      System.out.println(biggo.multiply(biggo)); 
    }   
  }
}