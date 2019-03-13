package ru.ebeda.sandbox;

public class PointCalculate {

  public static void main(String[] args) {

    Point p = new Point(9,9);

    System.out.println("корень из p1 " + (Math.sqrt(p.p1)));
    System.out.println("корень из р2 " + (Math.sqrt(p.p2)));
    System.out.println("Расстояние между точками = " + (p.distance()));
  }

}
