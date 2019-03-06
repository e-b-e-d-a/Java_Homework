package ru.ebeda.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("blondy");
    hello("me");
    hello("manicure");
    //System.out.println("Hello, world!");

    double lalala = 5;
    System.out.println("Что-то там квадрат "+lalala+" "+area(lalala));

    double a = 4;
    double b =6;
    System.out.println("Прямоугольник равен"+area(a,b));
  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + " !");
  }

  /*public static void quadro(){
    double l = 5;
    System.out.println(area(l));
  }*/

  public static double area (double ulala){
    return ulala*ulala;
  }

  public static double area(double a, double b){
    return a*b;
  }
}