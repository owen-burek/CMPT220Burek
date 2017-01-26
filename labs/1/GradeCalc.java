/*
Owen Burek
January 24,2017
Lab 0 Grade Calculator
*/

import java.util.Scanner;

public class GradeCalc{
  public static void main (String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Please enter the following as percentages...");

    System.out.print("midterm exam: ");
    double midterm = input.nextDouble();
    System.out.print("final exam: ");
    double finalExam = input.nextDouble();
    System.out.print("projects: ");
    double projects = input.nextDouble();
    System.out.print("homework and labs: "); 
    double homework = input.nextDouble();
    
    double grade = ((midterm * 0.2) + (finalExam * 0.2) + (projects * 0.2) + (homework * 0.4));

    System.out.println("Your final grade is: " + grade + "%");
  }
}