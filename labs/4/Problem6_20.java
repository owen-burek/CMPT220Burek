/*
file: Problem6_3.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 4 Problem 6.20
due date: 03/02/17
*/

import java.util.*;

public class Problem6_20{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a string: ");
    String words = input.nextLine();
    int length = countLetters(words);
    System.out.println("The number of letters in the string is " + length);
  }

  //Counts the number of letters in the string
  public static int countLetters(String s){
    int letter = 0;
    for(int i = 0; i < s.length(); i++){
      if(Character.isLetter(s.charAt(i)))
        letter++;
    }
    return letter;
  }
}