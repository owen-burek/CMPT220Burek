/*
file: Rectangle.java
author: Owen Burek
course: CMPT 220L-200
assignment: Lab 6 Problem 9.1
due date: 04/20/17
*/

/*
--------------------------------------
|           Rectangle                |
--------------------------------------
| width: double                      |
| height:                            |
| Rectangle()                        |
| Rectangle(w: double, h: double)    |
| setWidth(w: double)                |
| getWidth(): double                 |
| setHeight(h: double)               |
| getHeight(): double                |
| getArea(): double                  |
| getPerimeter(): double             |
--------------------------------------
*/

class Rectangle{
  private double width = 1;
  private double height = 1;

  Rectangle() {}

  Rectangle(double w, double h) {
    width = w;
    height = h;
  }

  void setWidth(double w){
    width = w;
  }
  double getWidth(){
    return width;
  }

  void setHeight(double h){
    height = h;
  }
  double getHeight(){
    return height;
  }

  double getArea(){
    return (height * width);
  }

  double getPerimeter(){
    return (2 * height) + (2 * width);
  }

  public static void main(String[] args){
    Rectangle r = new Rectangle(4, 40);
    Rectangle s = new Rectangle(3.5, 35.9);
    System.out.print("RECTANGLE #1: Height: " + r.getHeight());
    System.out.print(" Width: " + r.getWidth());
    System.out.print(" Area: " + r.getArea());
    System.out.println(" Perimeter: " + r.getPerimeter());

    System.out.print("RECTANGLE #2: Height: " + s.getHeight());
    System.out.print(" Width: " + s.getWidth());
    System.out.print(" Area: " + s.getArea());
    System.out.println(" Perimeter: " + s.getPerimeter());
  }
}
