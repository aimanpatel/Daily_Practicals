//Write a Java program to create an interface Flyable with a method called fly_obj(). Create three classes Spacecraft, Airplane, and Helicopter that implement the Flyable interface. Implement the fly_obj() method for each of the three classes.

package com_javapgm;

//Flyable.java
interface Flyable {
 void fly_obj();
}

//Spacecraft.java
class Spacecraft implements Flyable {
 @Override
 public void fly_obj() {
     System.out.println("Spacecraft is flying in outer space.");
 }
}

//Airplane.java
class Airplane implements Flyable {
 @Override
 public void fly_obj() {
     System.out.println("Airplane is flying in the sky.");
 }
}

//Helicopter.java
class Helicopter implements Flyable {
 @Override
 public void fly_obj() {
     System.out.println("Helicopter is flying in the air.");
 }
}

//Main.java
public class ABC2 {
 public static void main(String[] args) {
     Flyable spacecraft = new Spacecraft();
     Flyable airplane = new Airplane();
     Flyable helicopter = new Helicopter();

     spacecraft.fly_obj();
     airplane.fly_obj();
     helicopter.fly_obj();
 }
}


