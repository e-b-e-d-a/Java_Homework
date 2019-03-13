package ru.ebeda.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("blondy");
    hello("me");
    hello("manicure");
    System.out.println("Hello, world!");

    Square s = new Square(7);
    System.out.println("Что-то там квадрат "+ s.lalala+" "+ s.area());

    Rect r = new Rect(8,4);
    System.out.println("Прямоугольник равен"+r.area());

  }

  public static void hello(String somebody){
    System.out.println("Hello, " + somebody + " !");
  }
}