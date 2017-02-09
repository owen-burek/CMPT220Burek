/*
Owen Burek
February 9, 2017
Lab 2 Problem 3.11
*/

import java.util.*;

public class Problem3_11{
  public static void main(String[] args){
    System.out.println("DAYS IN A MONTH");
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter a month (numerically): ");
    int month = input.nextInt();
    System.out.print("Please enter a year: ");
    int year = input.nextInt();

    switch(month){
      case 1: System.out.println("Days: 31"); break;
      case 2: {
        if(year%4 == 0)
          System.out.println("Days: 29");
        else
          System.out.println("Days: 28");
        break;
      }
      case 3: System.out.println("Days: 31"); break;
      case 4: System.out.println("Days: 30"); break;
      case 5: System.out.println("Days: 31"); break;
      case 6: System.out.println("Days: 30"); break;
      case 7: System.out.println("Days: 31"); break;
      case 8: System.out.println("Days: 31"); break;
      case 9: System.out.println("Days: 30"); break;
      case 10: System.out.println("Days: 31"); break;
      case 11: System.out.println("Days: 30"); break;
      case 12: System.out.println("Days: 31"); break;
    }
  }
}