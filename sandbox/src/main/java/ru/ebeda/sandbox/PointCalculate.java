package ru.ebeda.sandbox;

import java.lang.Math.*;

public class PointCalculate {

  public static void main(String[]args) {

    Point p1 = new Point();
    Point p2 = new Point();
    p1.p1 = 16;
    p2.p2 = 9;

    System.out.println("корень из p1 " + (Math.sqrt(p1.p1)));
    System.out.println("корень из р2 " + (Math.sqrt(p2.p2)));
    System.out.println("Расстояние между точками = " + (distance(p1,p2)));
    }

  public static double distance(Point p1, Point p2) {

    return Math.sqrt(p1.p1)+ Math.sqrt(p2.p2);

  }

  }
