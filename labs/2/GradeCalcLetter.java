/*
Owen Burek
February 9, 2017
Lab 2 Grade Calculator- Alphabetical Grade
*/

import java.util.Scanner;

public class GradeCalcLetter{
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
    String letterGrade = "";

    if (grade >= 95)
      letterGrade = "A";
    else if (grade >= 90)
      letterGrade = "A-";
    else if (grade >= 87)
      letterGrade = "B+";
    else if (grade >= 83)
      letterGrade = "B";
    else if (grade >= 80)
      letterGrade = "B-";
    else if (grade >= 77)
      letterGrade = "C+";
    else if (grade >= 73)
      letterGrade = "C";
    else if (grade >= 70)
      letterGrade = "C-";
    else if (grade >= 65)
      letterGrade = "D+";
    else if (grade >= 60)
      letterGrade = "D";
    else
      letterGrade = "F";   

    System.out.println("Your final grade is: " + letterGrade);
  }
}