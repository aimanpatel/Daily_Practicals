//Write a Java program to create a class called Rectangle with private instance variables length and width. Provide public getter and setter methods to access and modify these variables.

package com.Abstraction;

//Rectangle.java
public class Rectangle {
 // Private instance variables
 private double length;
 private double width;

 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Getter method for length
 public double getLength() {
     return length;
 }

 // Setter method for length
 public void setLength(double length) {
     this.length = length;
 }

 // Getter method for width
 public double getWidth() {
     return width;
 }

 // Setter method for width
 public void setWidth(double width) {
     this.width = width;
 }

 // Method to calculate area of the rectangle
 public double calculateArea() {
     return length * width;
 }

 // Method to calculate perimeter of the rectangle
 public double calculatePerimeter() {
     return 2 * (length + width);
 }

 // Main method to test the Rectangle class
 public static void main(String[] args) {
     // Create a new Rectangle object
     Rectangle rectangle = new Rectangle(5.0, 3.0);

     // Print the initial dimensions of the rectangle
     System.out.println("Initial Dimensions:");
     System.out.println("Length: " + rectangle.getLength());
     System.out.println("Width: " + rectangle.getWidth());

     // Modify the dimensions of the rectangle using setter methods
     rectangle.setLength(7.0);
     rectangle.setWidth(4.0);

     // Print the modified dimensions of the rectangle
     System.out.println("\nModified Dimensions:");
     System.out.println("Length: " + rectangle.getLength());
     System.out.println("Width: " + rectangle.getWidth());

     // Calculate and print the area and perimeter of the rectangle
     System.out.println("\nArea: " + rectangle.calculateArea());
     System.out.println("Perimeter: " + rectangle.calculatePerimeter());
 }
}
