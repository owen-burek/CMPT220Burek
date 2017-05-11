/*
file: Queue.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 7 Problem 10.10
due date: 04/27/17
*/
/*
********************
*      Queue       *
*------------------*
* elements: int[]  *
* size: int        *
* Queue()          *
* enqueue(v: int)  *
* dequeue(): int   *
* empty(): boolean *
* getSize(): int   *
********************
*/

import java.util.*;

public class Queue{
  private int[] elements;
  private int size;
  public static final int DEFCAP = 8;

  Queue(){
    elements = new int[DEFCAP];
  }

  int getSize(){
    return size;
  }

  void enqueue(int v){
    if (size >= elements.length) {
      int[] elements2 = new int[elements.length*2];
      for(int i = 0; i < elements.length; i++){
        elements2[i] = elements[i];
      }
      elements = elements2;
    }
    elements[size + 1] = v;
  }

  int dequeue(){
    int rem = elements[0];
    int[] elements2 = new int[elements.length];
    for(int i = 0; i < elements.length; i++){
      elements2[i] = elements[i];
    }
    elements = elements2;
    size-=1;
    return rem;
  }

  boolean empty(){
    if (size == 0){
      return true;
    }
    return false;
  }
} 