//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and  Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed

package com_javapgm;

//Vehicle.java
class Vehicle2 {
 protected String make;
 protected String model;
 protected int year;
 protected String fuelType;

 public Vehicle2(String make, String model, int year, String fuelType) {
     this.make = make;
     this.model = model;
     this.year = year;
     this.fuelType = fuelType;
 }

 public double calculateFuelEfficiency(double distance, double fuelConsumed) {
     return distance / fuelConsumed;
 }

 public double calculateDistance(double speed, double time) {
     return speed * time;
 }

 public double getMaxSpeed() {
     // Default implementation, can be overridden by subclasses
     return 0;
 }
}

//Truck.java
class Truck extends Vehicle2 {
 private double maxLoad;

 public Truck(String make, String model, int year, String fuelType, double maxLoad) {
     super(make, model, year, fuelType);
     this.maxLoad = maxLoad;
 }

 @Override
 public double getMaxSpeed() {
     // Assuming trucks have a maximum speed of 90 mph
     return 90;
 }
}

//Car.java
class Car2 extends Vehicle2 {
 private int passengerCapacity;

 public Car2(String make, String model, int year, String fuelType, int passengerCapacity) {
     super(make, model, year, fuelType);
     this.passengerCapacity = passengerCapacity;
 }

 @Override
 public double getMaxSpeed() {
     // Assuming cars have a maximum speed of 120 mph
     return 120;
 }
}

//Motorcycle.java
class Motorcycle extends Vehicle2 {
 private boolean hasFairing;

 public Motorcycle(String make, String model, int year, String fuelType, boolean hasFairing) {
     super(make, model, year, fuelType);
     this.hasFairing = hasFairing;
 }

 @Override
 public double getMaxSpeed() {
     // Assuming motorcycles have a maximum speed of 150 mph
     return 150;
 }
}

//Main.java
public class XYZ {
 public static void main(String[] args) {
     Truck truck = new Truck("Ford", "F-150", 2020, "Diesel", 5000);
     Car2 car = new Car2("Toyota", "Camry", 2021, "Gasoline", 5);
     Motorcycle motorcycle = new Motorcycle("Honda", "CBR500R", 2019, "Gasoline", true);

     System.out.println("Truck max speed: " + truck.getMaxSpeed() + " mph");
     System.out.println("Car max speed: " + car.getMaxSpeed() + " mph");
     System.out.println("Motorcycle max speed: " + motorcycle.getMaxSpeed() + " mph");
 }
}
