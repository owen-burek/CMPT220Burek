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
    System.out.println("Size of array 1: ");
    int arr1Size = input.nextInt();
    System.out.println("Size of array 2: ");
    int arr2Size = input.nextInt();
    double[] firstArr = new double[arr1Size];
    double[] secondArr = new double[arr2Size];
    

    System.out.println("Enter the values for the first array: ");
    for(int i = 0; i < arr1Size; i++){
      firstArr[i] = input.nextDouble();
    }
    System.out.println("Enter the values for the second array: ");
    for(int i = 0; i < arr2Size; i++){
      secondArr[i] = input.nextDouble();
    }

    int[] convolvedArr = convolve(arr1Size, arr2Size, firstArr, secondArr);

    System.out.print("The resulting array is: ");
    for(int i = 0; i < convolvedArr.length; i++){
      System.out.print(Math.round(convolvedArr[i]) + " ");
    }
  }

  public static int[] convolve(int s1, int s2, double[] a1, double[] a2){
    int[] resultArr = new int[(s1 + s2) - 1];
    for(int i = 0; i < resultArr.length; i++){
      resultArr[i] = 0;
      for(int x = i, y = 0; y < s2; x--, y++){
        if(x < 0 || x >= s1){
          resultArr[i] += 0 * a2[y];
          System.out.println("[0] * [" + a2[y] + "]");
        }
        else{
          resultArr[i] += a1[x] * a2[y];
          System.out.println("[" + a1[x] + "] * [" + a2[y] + "]");
        }
      }
    }
    return resultArr;
  }
}