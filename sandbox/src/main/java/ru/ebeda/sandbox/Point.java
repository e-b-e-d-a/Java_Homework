package ru.ebeda.sandbox;

public class Point {
  public double x1;
  public double x2;
  public double y1;
  public double y2;
  public double p1;
  public double p2;

  public Point p1(double x1, double x2) {
    this.p1 = Math.sqrt((x2 - x1) * (x2 - x1));
  }

  public Point p2(double y1,double y2){
    this.p2 = Math.sqrt((y2 - y1) * (y2 - y1));
  }

  public double distance(Point p1,Point p2) {
    return
            this.p1(Math.sqrt((x2 - x1) * (x2 - x1)));
            this.p2(Math.sqrt((y2 - y1) * (y2 - y1)));
            this.p1-this.p2;
  }
}