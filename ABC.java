//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

package com_javapgm;
//Person.java
class Person {
 private String firstName;
 private String lastName;

 public Person(String firstName, String lastName) {
     this.firstName = firstName;
     this.lastName = lastName;
 }

 public String getFirstName() {
     return firstName;
 }

 public String getLastName() {
     return lastName;
 }
}

//Employee.java
class Employee extends Person {
 private String employeeId;
 private String jobTitle;

 public Employee(String firstName, String lastName, String employeeId, String jobTitle) {
     super(firstName, lastName);
     this.employeeId = employeeId;
     this.jobTitle = jobTitle;
 }

 public String getEmployeeId() {
     return employeeId;
 }

 @Override
 public String getLastName() {
     return super.getLastName() + ", " + jobTitle;
 }
}

//Main.java
public class ABC {
 public static void main(String[] args) {
     Employee employee = new Employee("Aiman", "Patel", "12345", "Software Engineer");

     System.out.println("First Name: " + employee.getFirstName());
     System.out.println("Last Name: " + employee.getLastName());
     System.out.println("Employee ID: " + employee.getEmployeeId());
 }
}
