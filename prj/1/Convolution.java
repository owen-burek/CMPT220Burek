/*
file: Convolution.java
author: Owen Burek
course: CMPT 220L-200
assignment: Project 1- Convolution
due date: 03/30/17
*/

import java.util.*;

public class Convolution{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    //Read the size of the 1st array
    System.out.println("Size of array 1: ");
    int arr1Size = input.nextInt();
    //Read the size of the 2nd array
    System.out.println("Size of array 2: ");
    int arr2Size = input.nextInt();

    double[] firstArr = new double[arr1Size];
    double[] secondArr = new double[arr2Size];
    
    //Read the values of the 1st array
    System.out.println("Enter the values for the first array: ");
    for(int i = 0; i < arr1Size; i++){
      firstArr[i] = input.nextDouble();
    }
    //Read the values of the 2nd array
    System.out.println("Enter the values for the second array: ");
    for(int i = 0; i < arr2Size; i++){
      secondArr[i] = input.nextDouble();
    }

    double[] convolvedArr = convolve(arr1Size, arr2Size, firstArr, secondArr);

    System.out.print("The resulting array is: ");
    for(int i = 0; i < convolvedArr.length; i++){
      System.out.print(Math.round(convolvedArr[i]) + " ");
    }
  }
  //Given the first and second arrays with their sizes, outputs a convolved array
  public static double[] convolve(int s1, int s2, double[] a1, double[] a2){
    double[] resultArr = new double[(s1 + s2) - 1];
    for(int i = 0; i < resultArr.length; i++){
      resultArr[i] = 0;
      for(int x = i, y = 0; y < s2; x--, y++){
        if(x < 0 || x >= s1){
          resultArr[i] += 0 * a2[y];
        }
        else{
          resultArr[i] += a1[x] * a2[y];
        }
      }
    }
    return resultArr;
  }
}