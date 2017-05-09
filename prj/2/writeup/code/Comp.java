/*
file: Comp.java
author: Owen Burek
course: CMPT 220L-200
assignment: Project 2
*/


import java.io.IOException;
import java.net.*;

public class Comp{
  private long runtime = 0;

  //Default constructor for the class
  Comp(){}

  void setRuntime(long rt){
    runtime = rt;
  }

  long getRuntime(){
    return runtime;
  }

  //Calculate runtime from PortScan.java start and end variables
  void showRuntime(){
    System.out.println("Scanning your ports took " + getRuntime() + " milliseconds!");
  }
  
  //Given a port# and Socket object, the method will connect and disconnect from the port
  //If unsuccessful, it will throw an Exception will the method will catch and end the function
  static void scan(int port, Socket socket){
      try {
        socket.connect(new InetSocketAddress("localhost", port), 100);
        socket.close();
        System.out.println(port + ": OPEN");
      } 
      catch (Exception ex) {
      }
  }
}