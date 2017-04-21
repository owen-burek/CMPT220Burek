/*
file: Problem7_31.java
course: CMPT 220L-200
assignment: Lab 5 Problem 7.31
due date: 04/06/17
*/

import java.util.*;

public class Problem7_31{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Length of array 1: ");
    int arr1Size = input.nextInt();
    int[] unSortArr1 = new int[arr1Size];

    System.out.println("Length of array 2: ");
    int arr2Size = input.nextInt();
    int[] unSortArr2 = new int[arr2Size];

    System.out.println("Enter values for array 1: ");
    for(int i = 0; i < arr1Size; i++){
      unSortArr1[i] = input.nextInt();
    }
    System.out.println("Enter values for array 2: ");
    for(int i = 0; i < arr2Size; i++){
      unSortArr2[i] = input.nextInt();
    }

    unSortArr1 = selectSort(unSortArr1);
    unSortArr2 = selectSort(unSortArr2);

    int sortArr[] = merge(unSortArr1, unSortArr2);
    
    System.out.println("Resulting matrix: ");
    for(int i = 0; i < arr1Size + arr2Size; i++){
      System.out.print(sortArr[i] + " ");
    }
  }

  public static int[] selectSort(int[] arr){
    int temp = 0;
    for(int x = (arr.length - 1); x > 0; x--){  
      for(int i = 0; i < (x + 1); i++){
        if(arr[i] > arr[x]){
          temp = arr[x];
          arr[x] = arr[i];
          arr[i] = temp;
        }
      }
    }
    return arr;
  }

  public static int[] merge(int[] list1, int [] list2){
    int[] mergeArr = new int[list1.length + list2.length];

    for(int x = 0, y = 0, i = 0; i < list1.length + list2.length; i++){
      if(list1[x] < list2[y]){
        mergeArr[i] = list1[x];
        if(x < list1.length - 1)
          x++;
        else if(x == list1.length - 2)
          y++;
      }
      else{
        mergeArr[i] = list2[y];
        if(y < list2.length - 1)
          y++;
        else if(y == list2.length - 2)
          x++;
      }
    }
    return mergeArr;
  }
}