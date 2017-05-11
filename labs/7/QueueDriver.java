/*
file: QueueDriver.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 7 Problem 10.10
due date: 04/27/17
*/
public class QueueDriver{
  public static void main(String[]args){
    Queue queue = new Queue();
    for (int i = 1; i < 21; i++) {
      queue.enqueue(i);
    }

    // Removes these numbers and displays them
    while (queue.empty()==true) {
      System.out.print(queue.dequeue());
    }
  }
}