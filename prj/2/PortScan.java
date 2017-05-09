/*
file: PortScan.java
author: Owen Burek
course: CMPT 220L-200
assignment: Project 2

Driver for port scanning program.
Calculates and displays to the user runtime in milliseconds.
Uses functions from Socket library.
*/


import java.util.*;
import java.net.*;

public class PortScan{
  public static void main (String[] args){
    System.out.println("Welcome! Your system will now be scanned!");

    //Create Comp object instance to track runtime
    Comp myComp = new Comp();

    long start = System.currentTimeMillis();
    
    //Loop for scanning each port
    for (int i = 1; i < 65536; i++) {
      Socket toScan = new Socket();
      Comp.scan(i, toScan);
    }

    long end = System.currentTimeMillis();
    
    //Calculates and displays runtime.
    myComp.setRuntime(end - start);
    myComp.showRuntime();
    
  }
}