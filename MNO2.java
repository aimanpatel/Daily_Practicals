//Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes.

package com_javapgm;

//Drawable.java - Interface
interface Drawable {
 void draw();
}

//Circle.java - Implementing Drawable interface
class Circle2 implements Drawable {
 @Override
 public void draw() {
     System.out.println("Drawing Circle");
     // Logic to draw a circle
 }
}

//Rectangle.java - Implementing Drawable interface
class Rectangle2 implements Drawable {
 @Override
 public void draw() {
     System.out.println("Drawing Rectangle");
     // Logic to draw a rectangle
 }
}

//Triangle.java - Implementing Drawable interface
class Triangle implements Drawable {
 @Override
 public void draw() {
     System.out.println("Drawing Triangle");
     // Logic to draw a triangle
 }
}

//Main.java
public class MNO2 {
 public static void main(String[] args) {
     Circle2 circle = new Circle2();
     Rectangle2 rectangle = new Rectangle2();
     Triangle triangle = new Triangle();

     circle.draw();
     rectangle.draw();
     triangle.draw();
 }
}
