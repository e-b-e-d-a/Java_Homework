package ru.ebeda.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {

    Point p1 = new Point(1,2);
    Point p2 = new Point(4,5);
    System.out.println("Расстояние между точками = " + p1.distance(p2));

  }

}