// Write a Java program to create a class called Shape with a method called getArea(). ● Create a subclass called Circle and create a constructor that takes the value of radius(int) as input parameter. ● Override the getArea() method. ● Create a class called square that takes an attribute length. Create a constructor that takes length as input. ● Override the getArea() method. ● Create a subclass of Shape called Rectangle that takes width and height as input to the constructor. ● Override the getArea() method to calculate the area of a rectangle. Instantiate and call getArea() method.

package com_javapgm;

class Shape //superclass
{
    public double getArea() {
        return 0; // Default implementation, to be overridden by subclasses
    }
}

class Circle extends Shape   //subclass 
{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape   //subclass
{
    private int length;

    public Square(int length) {
        this.length = length;
    }

    //Override the method
    public double getArea() {
        return length * length;
    }
}

class Rectangle extends Shape   //subclass
{
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    //Override the method
    public double getArea() {
        return width * height;
    }
}

public class Main2  //Main methods of the program for printing the output
{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle: " + circle.getArea());

        Square square = new Square(4);
        System.out.println("Area of Square: " + square.getArea());

        Rectangle rectangle = new Rectangle(3, 6);
        System.out.println("Area of Rectangle: " + rectangle.getArea());
    }
}
