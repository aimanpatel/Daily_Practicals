//Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables

package com.Abstraction;

//Person.java
public class Person {
 // Private instance variables
 private String name;
 private int age;
 private String country;

 // Constructor
 public Person(String name, int age, String country) {
     this.name = name;
     this.age = age;
     this.country = country;
 }

 // Getter method for name
 public String getName() {
     return name;
 }

 // Setter method for name
 public void setName(String name) {
     this.name = name;
 }

 // Getter method for age
 public int getAge() {
     return age;
 }

 // Setter method for age
 public void setAge(int age) {
     this.age = age;
 }

 // Getter method for country
 public String getCountry() {
     return country;
 }

 // Setter method for country
 public void setCountry(String country) {
     this.country = country;
 }

 // Main method to test the Person class
 public static void main(String[] args) {
     // Create a new Person object
     Person person = new Person("Seema Rai", 30, "UAE");

     // Print the initial state of the person object
     System.out.println("Initial Details:");
     System.out.println("Name: " + person.getName());
     System.out.println("Age: " + person.getAge());
     System.out.println("Country: " + person.getCountry());

     // Modify the person object using setter methods
     person.setName("Aiman Patel");
     person.setAge(25);
     person.setCountry("India");

     // Print the modified state of the person object
     System.out.println("\nModified Details:");
     System.out.println("Name: " + person.getName());
     System.out.println("Age: " + person.getAge());
     System.out.println("Country: " + person.getCountry());
 }
}
