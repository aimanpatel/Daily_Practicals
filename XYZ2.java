//Create a class monkey with jump ( ) and bite ( ) methods Create a class human whichinherits this monkey class and implements basicanimal interface with eat ( ) and sleep methods 

package com_javapgm;

//BasicAnimal.java - Interface
interface BasicAnimal {
 void eat();
 void sleep();
}

//Monkey.java - Base class
class Monkey {
 public void jump() {
     System.out.println("Monkey is jumping.");
 }

 public void bite() {
     System.out.println("Monkey is biting.");
 }
}

//Human.java - Subclass of Monkey implementing BasicAnimal interface
class Human extends Monkey implements BasicAnimal {
 @Override
 public void eat() {
     System.out.println("Human is eating.");
 }

 @Override
 public void sleep() {
     System.out.println("Human is sleeping.");
 }
}

//Main.java
public class XYZ2 {
 public static void main(String[] args) {
     Human human = new Human();

     human.jump();
     human.bite();
     human.eat();
     human.sleep();
 }
}

