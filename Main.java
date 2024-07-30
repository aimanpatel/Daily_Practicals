//Write a Java program to create a class called Vehicle with a method called drive(). ● Vehicle should have attributes such as make (String), model (String) , year (int) and maximumSpeed (int). ● Create a constructor in Vehicle with all fields as constructor parameters. ● Create a subclass called Car and override constructor. Call super(). ● Write a function that overrides the drive() method to print (make + “ ” + model + " Car is driving". ) ● Also create another subclass Bike extending the vehicle class. ● Override the drive() method to print (make + “ ” + model + " Bike is driving". ) ● Instantiate both Bike and Car class. Print their attributes. 

package com_javapgm;

class Vehicle {
	//datatype and variable of the programs requires
    String make;
    String model;
    int year;
    int maximumSpeed;

    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    public void drive() {
        System.out.println(make + " " + model + " is driving.");
    }
}

class Car extends Vehicle   //subclass
{
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    //Override the method
    public void drive() {
        System.out.println(make + " " + model + " Car is driving.");
    }
}

class Bike extends Vehicle   //subclass
{
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    //Override the method 
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving.");
    }
}

public class Main   //Main method
{
    public static void main(String[] args) {
    	
    //Object creation for car and bike and givinh the input in it.....
        Car car = new Car("Kia", "WMR123", 2024, 240);
        Bike bike = new Bike("Honda", "Passion", 2024, 200);
        
      //For printing the statement of Car.....
        System.out.println("Car Attributes:");
        System.out.println("Make: " + car.make);
        System.out.println("Model: " + car.model);
        System.out.println("Year: " + car.year);
        System.out.println("Maximum Speed: " + car.maximumSpeed);
        car.drive();

        System.out.println();
   //For printing the statement of Bike.....
        System.out.println("Bike Attributes:");
        System.out.println("Make: " + bike.make);
        System.out.println("Model: " + bike.model);
        System.out.println("Year: " + bike.year);
        System.out.println("Maximum Speed: " + bike.maximumSpeed);
        bike.drive();
    }
}
