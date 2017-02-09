/*
Owen Burek
February 9, 2017
Lab 2 Problem 3.15
*/

import java.util.*;

public class Problem3_15{
  public static void main(String[] args){

    System.out.println("THREE DIGIT LOTTERY");

    int lottery = (int)(Math.random()*1000);

    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your lottery pick (3 digits): ");
    int guess = input.nextInt();

    int lotteryDigit1 = (lottery/100);
    int lotteryDigit2 = (int)((lottery/10.0)%10);
    int lotteryDigit3 = (lottery%10);

    int guessDigit1 = (guess/100);
    int guessDigit2 = (int)((guess/10.0)%10);
    int guessDigit3 = (guess%10);
    
    System.out.println("The lottery number is " + lottery);
    
    int caseNum = 0;

    if (guess == lottery)
      caseNum = 1;
    else if (((guessDigit1 == lotteryDigit1)
      || (guessDigit1 == lotteryDigit2)
      || (guessDigit1 == lotteryDigit3))
      && ((guessDigit2 == lotteryDigit1) 
      || (guessDigit2 == lotteryDigit2)
      || (guessDigit2 == lotteryDigit3))
      && ((guessDigit3 == lotteryDigit1)
      || (guessDigit3 == lotteryDigit2)
      || (guessDigit3 == lotteryDigit3)))
      caseNum = 2;
    else if ((guessDigit1 == lotteryDigit1)
      ||(guessDigit1 == lotteryDigit2)
      ||(guessDigit1 == lotteryDigit3)
      ||(guessDigit2 == lotteryDigit1)
      ||(guessDigit2 == lotteryDigit2)
      ||(guessDigit2 == lotteryDigit3)
      ||(guessDigit3 == lotteryDigit1)
      ||(guessDigit3 == lotteryDigit2)
      ||(guessDigit3 == lotteryDigit3))
      caseNum = 3;

    

    switch (caseNum){
      case 1:
        System.out.println("Exact match: you win $10,000"); break;
      case 2:
        System.out.println("Match all digits: you win $3,000"); break;
      case 3:
        System.out.println("Match one digit: you win $1,000"); break;
      default:
        System.out.println("Sorry, no match");
      
    }
  }
}